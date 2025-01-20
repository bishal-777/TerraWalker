package kawa;

import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.kawa.swingviews.SwingContent;
import gnu.lists.CharBuffer;
import gnu.mapping.Environment;
import gnu.mapping.Future;
import gnu.mapping.Values;
import gnu.text.Path;
import gnu.text.QueueReader;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class ReplDocument extends DefaultStyledDocument implements DocumentListener, FocusListener {
    static Style blueStyle = styles.addStyle("blue", (Style) null);
    public static Style defaultStyle = styles.addStyle("default", (Style) null);
    public static Style inputStyle = styles.addStyle("input", (Style) null);
    static Style promptStyle = styles.addStyle("prompt", (Style) null);
    public static Style redStyle = styles.addStyle("red", (Style) null);
    public static StyleContext styles = new StyleContext();
    Object closeListeners;
    SwingContent content;
    public int endMark;
    Environment environment;
    final ReplPaneOutPort err_stream;
    final GuiInPort in_p;
    final QueueReader in_r;
    Language language;
    int length;
    final ReplPaneOutPort out_stream;
    public int outputMark;
    JTextPane pane;
    int paneCount;
    Future thread;

    public interface DocumentCloseListener {
        void closed(ReplDocument replDocument);
    }

    static {
        StyleConstants.setForeground(redStyle, Color.red);
        StyleConstants.setForeground(blueStyle, Color.blue);
        StyleConstants.setForeground(promptStyle, Color.green);
        StyleConstants.setBold(inputStyle, true);
    }

    public ReplDocument(Language language2, Environment penvironment, boolean shared) {
        this(new SwingContent(), language2, penvironment, shared);
    }

    private ReplDocument(SwingContent content2, Language language2, Environment penvironment, final boolean shared) {
        super(content2, styles);
        this.outputMark = 0;
        this.endMark = -1;
        this.length = 0;
        this.content = content2;
        ModuleBody.exitIncrement();
        addDocumentListener(this);
        this.language = language2;
        this.in_r = new QueueReader() {
            public void checkAvailable() {
                ReplDocument.this.checkingPendingInput();
            }
        };
        this.out_stream = new ReplPaneOutPort(this, "/dev/stdout", defaultStyle);
        this.err_stream = new ReplPaneOutPort(this, "/dev/stderr", redStyle);
        this.in_p = new GuiInPort(this.in_r, Path.valueOf("/dev/stdin"), this.out_stream, this);
        this.thread = Future.make(new repl(language2) {
            public Object apply0() {
                Environment env = Environment.getCurrent();
                if (shared) {
                    env.setIndirectDefines();
                }
                ReplDocument.this.environment = env;
                Shell.run(this.language, env);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        ReplDocument.this.fireDocumentClosed();
                    }
                });
                return Values.empty;
            }
        }, penvironment, this.in_p, this.out_stream, this.err_stream);
        this.thread.start();
    }

    public synchronized void deleteOldText() {
        int lineBefore = 0;
        synchronized (this) {
            try {
                String str = getText(0, this.outputMark);
                if (this.outputMark > 0) {
                    lineBefore = str.lastIndexOf(10, this.outputMark - 1) + 1;
                }
                remove(0, lineBefore);
            } catch (BadLocationException ex) {
                throw new Error(ex);
            }
        }
    }

    public void insertString(int pos, String str, AttributeSet style) {
        try {
            ReplDocument.super.insertString(pos, str, style);
        } catch (BadLocationException ex) {
            throw new Error(ex);
        }
    }

    public void write(final String str, final AttributeSet style) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                boolean moveCaret = ReplDocument.this.pane != null && ReplDocument.this.pane.getCaretPosition() == ReplDocument.this.outputMark;
                ReplDocument.this.insertString(ReplDocument.this.outputMark, str, style);
                ReplDocument.this.outputMark += str.length();
                if (moveCaret) {
                    ReplDocument.this.pane.setCaretPosition(ReplDocument.this.outputMark);
                }
            }
        });
    }

    public void checkingPendingInput() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                int inputStart = ReplDocument.this.outputMark;
                if (inputStart <= ReplDocument.this.endMark) {
                    CharBuffer b = ReplDocument.this.content.buffer;
                    int lineAfter = b.indexOf(10, inputStart);
                    if (lineAfter == ReplDocument.this.endMark) {
                        ReplDocument.this.endMark = -1;
                    }
                    if (inputStart == ReplDocument.this.outputMark) {
                        ReplDocument.this.outputMark = lineAfter + 1;
                    }
                    if (ReplDocument.this.in_r != null) {
                        synchronized (ReplDocument.this.in_r) {
                            ReplDocument.this.in_r.append((CharSequence) b, inputStart, lineAfter + 1);
                            ReplDocument.this.in_r.notifyAll();
                        }
                    }
                }
            }
        });
    }

    public void focusGained(FocusEvent e) {
        ReplPane replPane;
        Object source = e.getSource();
        if (source instanceof ReplPane) {
            this.pane = (ReplPane) source;
        } else {
            this.pane = null;
        }
        if (source instanceof ReplPane) {
            replPane = (ReplPane) source;
        } else {
            replPane = null;
        }
        this.pane = replPane;
    }

    public void focusLost(FocusEvent e) {
        this.pane = null;
    }

    public void changedUpdate(DocumentEvent e) {
        textValueChanged(e);
    }

    public void insertUpdate(DocumentEvent e) {
        textValueChanged(e);
    }

    public void removeUpdate(DocumentEvent e) {
        textValueChanged(e);
    }

    public synchronized void textValueChanged(DocumentEvent e) {
        int pos = e.getOffset();
        int delta = getLength() - this.length;
        this.length += delta;
        if (pos < this.outputMark) {
            this.outputMark += delta;
        } else if (pos - delta < this.outputMark) {
            this.outputMark = pos;
        }
        if (this.endMark >= 0) {
            if (pos < this.endMark) {
                this.endMark += delta;
            } else if (pos - delta < this.endMark) {
                this.endMark = pos;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void close() {
        this.in_r.appendEOF();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        this.thread.stop();
        fireDocumentClosed();
        ModuleBody.exitDecrement();
    }

    public void addDocumentCloseListener(DocumentCloseListener listener) {
        ArrayList vec;
        if (this.closeListeners == null) {
            this.closeListeners = listener;
            return;
        }
        if (this.closeListeners instanceof ArrayList) {
            vec = (ArrayList) this.closeListeners;
        } else {
            vec = new ArrayList(10);
            vec.add(this.closeListeners);
            this.closeListeners = vec;
        }
        vec.add(listener);
    }

    public void removeDocumentCloseListener(DocumentCloseListener listener) {
        if (this.closeListeners instanceof DocumentCloseListener) {
            if (this.closeListeners == listener) {
                this.closeListeners = null;
            }
        } else if (this.closeListeners != null) {
            ArrayList vec = (ArrayList) this.closeListeners;
            int i = vec.size();
            while (true) {
                i--;
                if (i < 0) {
                    break;
                } else if (vec.get(i) == listener) {
                    vec.remove(i);
                }
            }
            if (vec.size() == 0) {
                this.closeListeners = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void fireDocumentClosed() {
        if (this.closeListeners instanceof DocumentCloseListener) {
            ((DocumentCloseListener) this.closeListeners).closed(this);
        } else if (this.closeListeners != null) {
            ArrayList vec = (ArrayList) this.closeListeners;
            int i = vec.size();
            while (true) {
                i--;
                if (i >= 0) {
                    ((DocumentCloseListener) vec.get(i)).closed(this);
                } else {
                    return;
                }
            }
        }
    }
}
