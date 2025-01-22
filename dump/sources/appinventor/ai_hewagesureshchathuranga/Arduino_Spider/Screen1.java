package appinventor.ai_hewagesureshchathuranga.Arduino_Spider;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.Slider;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.StopBlocksExecution;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.AddOp;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("Backward").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("LeftForward").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("RightForward").readResolve());
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("LeftBackward").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("RightBackward").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("RotateLeft").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("RotateRight").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("SendText").readResolve());
    static final PairWithPosition Lit108 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 693131);
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("Send1ByteNumber").readResolve());
    static final IntNum Lit11;
    static final IntNum Lit110 = IntNum.make(0);
    static final PairWithPosition Lit111 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 693295);
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("Forward$Click").readResolve());
    static final FString Lit113 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement29").readResolve());
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit117 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 782446), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 782441);
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 783237);
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve());
    static final PairWithPosition Lit120 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 783395);
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("Left$Click").readResolve());
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final IntNum Lit124 = IntNum.make(152);
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit126 = IntNum.make(140);
    static final FString Lit127 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit128 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit129 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final PairWithPosition Lit130 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 880752), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 880747);
    static final PairWithPosition Lit131 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 881543);
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 881703);
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("Right$Click").readResolve());
    static final FString Lit134 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement30").readResolve());
    static final FString Lit136 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit137 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit138 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit139 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 987264), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 987259);
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final PairWithPosition Lit140 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 988055);
    static final PairWithPosition Lit141 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 988231);
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("LeftBackward$Click").readResolve());
    static final FString Lit143 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit144 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit145 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1040502), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1040497);
    static final PairWithPosition Lit146 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1041293);
    static final PairWithPosition Lit147 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1041459);
    static final SimpleSymbol Lit148 = ((SimpleSymbol) new SimpleSymbol("Backward$Click").readResolve());
    static final FString Lit149 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Scrollable").readResolve());
    static final FString Lit150 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit151 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1110145), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1110140);
    static final PairWithPosition Lit152 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1110936);
    static final PairWithPosition Lit153 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1111113);
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("RightBackward$Click").readResolve());
    static final FString Lit155 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit156 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit157 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1179774), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1179769);
    static final PairWithPosition Lit158 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1180565);
    static final PairWithPosition Lit159 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1180739);
    static final SimpleSymbol Lit16;
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("RotateLeft$Click").readResolve());
    static final FString Lit161 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement32").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final FString Lit164 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit165 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit166 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit167 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1261692), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1261687);
    static final IntNum Lit168 = IntNum.make(10);
    static final PairWithPosition Lit169 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1262480);
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final PairWithPosition Lit170 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1262652);
    static final SimpleSymbol Lit171 = ((SimpleSymbol) new SimpleSymbol("RotateRight$Click").readResolve());
    static final FString Lit172 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit173 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement1").readResolve());
    static final FString Lit174 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit175 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit176 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final FString Lit177 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit178 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit179 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("ShowStatusBar").readResolve());
    static final PairWithPosition Lit180 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1380476), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1380471);
    static final PairWithPosition Lit181 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1381263);
    static final PairWithPosition Lit182 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1381438);
    static final SimpleSymbol Lit183 = ((SimpleSymbol) new SimpleSymbol("LeftForward$Click").readResolve());
    static final FString Lit184 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit185 = ((SimpleSymbol) new SimpleSymbol("Label9").readResolve());
    static final FString Lit186 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit187 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit188 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit189 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1478782), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1478777);
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final PairWithPosition Lit190 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1479569);
    static final PairWithPosition Lit191 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1479745);
    static final SimpleSymbol Lit192 = ((SimpleSymbol) new SimpleSymbol("RightForward$Click").readResolve());
    static final FString Lit193 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit194 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement31").readResolve());
    static final FString Lit195 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit196 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit197 = ((SimpleSymbol) new SimpleSymbol("Save").readResolve());
    static final IntNum Lit198;
    static final IntNum Lit199 = IntNum.make(40);
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final IntNum Lit200 = IntNum.make(124);
    static final FString Lit201 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit202 = IntNum.make(12);
    static final PairWithPosition Lit203 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1568856);
    static final SimpleSymbol Lit204 = ((SimpleSymbol) new SimpleSymbol("Positions").readResolve());
    static final PairWithPosition Lit205 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1568994), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1568986);
    static final SimpleSymbol Lit206 = ((SimpleSymbol) new SimpleSymbol("Save$Click").readResolve());
    static final FString Lit207 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit208 = ((SimpleSymbol) new SimpleSymbol("Run").readResolve());
    static final IntNum Lit209;
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final IntNum Lit210 = IntNum.make(110);
    static final FString Lit211 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit212 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1630309), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1630304);
    static final IntNum Lit213 = IntNum.make(14);
    static final PairWithPosition Lit214 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1630462);
    static final IntNum Lit215 = IntNum.make(-16724788);
    static final PairWithPosition Lit216 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1630678);
    static final SimpleSymbol Lit217 = ((SimpleSymbol) new SimpleSymbol("Run$Click").readResolve());
    static final FString Lit218 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit219 = ((SimpleSymbol) new SimpleSymbol("Reset").readResolve());
    static final FString Lit22 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final IntNum Lit220;
    static final FString Lit221 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit222 = IntNum.make(13);
    static final PairWithPosition Lit223 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1691736);
    static final IntNum Lit224 = IntNum.make((int) Component.COLOR_LTGRAY);
    static final SimpleSymbol Lit225 = ((SimpleSymbol) new SimpleSymbol("Reset$Click").readResolve());
    static final FString Lit226 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit227 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement38").readResolve());
    static final IntNum Lit228 = IntNum.make(-1004);
    static final FString Lit229 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement36").readResolve());
    static final FString Lit230 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit231 = ((SimpleSymbol) new SimpleSymbol("PositionsSaved").readResolve());
    static final IntNum Lit232;
    static final FString Lit233 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit234 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit235;
    static final FString Lit236 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit237 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit238 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement37").readResolve());
    static final FString Lit239 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final FString Lit240 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit241 = ((SimpleSymbol) new SimpleSymbol("Speed").readResolve());
    static final SimpleSymbol Lit242 = ((SimpleSymbol) new SimpleSymbol("ColorLeft").readResolve());
    static final IntNum Lit243;
    static final SimpleSymbol Lit244 = ((SimpleSymbol) new SimpleSymbol("ColorRight").readResolve());
    static final IntNum Lit245;
    static final SimpleSymbol Lit246 = ((SimpleSymbol) new SimpleSymbol("MaxValue").readResolve());
    static final IntNum Lit247 = IntNum.make(255);
    static final SimpleSymbol Lit248 = ((SimpleSymbol) new SimpleSymbol("MinValue").readResolve());
    static final IntNum Lit249 = IntNum.make(16);
    static final IntNum Lit25 = IntNum.make(-1001);
    static final SimpleSymbol Lit250 = ((SimpleSymbol) new SimpleSymbol("ThumbPosition").readResolve());
    static final IntNum Lit251 = IntNum.make(150);
    static final IntNum Lit252 = IntNum.make(300);
    static final FString Lit253 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit254 = ((SimpleSymbol) new SimpleSymbol("$thumbPosition").readResolve());
    static final PairWithPosition Lit255;
    static final PairWithPosition Lit256;
    static final SimpleSymbol Lit257 = ((SimpleSymbol) new SimpleSymbol("Speed$PositionChanged").readResolve());
    static final SimpleSymbol Lit258 = ((SimpleSymbol) new SimpleSymbol("PositionChanged").readResolve());
    static final FString Lit259 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit260 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement39").readResolve());
    static final IntNum Lit261 = IntNum.make(-1002);
    static final FString Lit262 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit263 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit264 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement40").readResolve());
    static final IntNum Lit265 = IntNum.make(90);
    static final FString Lit266 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit267 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit268 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement34").readResolve());
    static final FString Lit269 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit270 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit271 = ((SimpleSymbol) new SimpleSymbol("Image2").readResolve());
    static final IntNum Lit272 = IntNum.make(70);
    static final FString Lit273 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit274 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit275 = ((SimpleSymbol) new SimpleSymbol("WebViewer1").readResolve());
    static final IntNum Lit276 = IntNum.make(20);
    static final SimpleSymbol Lit277 = ((SimpleSymbol) new SimpleSymbol("HomeUrl").readResolve());
    static final IntNum Lit278 = IntNum.make(60);
    static final FString Lit279 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement18").readResolve());
    static final FString Lit280 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit281 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final SimpleSymbol Lit282 = ((SimpleSymbol) new SimpleSymbol("IsConnected").readResolve());
    static final PairWithPosition Lit283 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 2162873);
    static final IntNum Lit284 = IntNum.make(-3407872);
    static final SimpleSymbol Lit285 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1$BluetoothError").readResolve());
    static final SimpleSymbol Lit286 = ((SimpleSymbol) new SimpleSymbol("BluetoothError").readResolve());
    static final FString Lit287 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit288 = ((SimpleSymbol) new SimpleSymbol("Clock1").readResolve());
    static final FString Lit289 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit290 = IntNum.make(-13408513);
    static final PairWithPosition Lit291;
    static final IntNum Lit292 = IntNum.make(-3407872);
    static final SimpleSymbol Lit293 = ((SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve());
    static final SimpleSymbol Lit294 = ((SimpleSymbol) new SimpleSymbol("Timer").readResolve());
    static final SimpleSymbol Lit295 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit296 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit297 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit298 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit299 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final IntNum Lit30 = IntNum.make(2);
    static final SimpleSymbol Lit300 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit301 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit302 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit303 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit304 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit305 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit306 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit307 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit308 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit309 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final IntNum Lit31 = IntNum.make(16777215);
    static final IntNum Lit32 = IntNum.make(-1004);
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit34 = IntNum.make(-2);
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit4;
    static final IntNum Lit40 = IntNum.make(18);
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit43 = IntNum.make(1);
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit45;
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement35").readResolve());
    static final IntNum Lit49 = IntNum.make(-1001);
    static final SimpleSymbol Lit5;
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement26").readResolve());
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("BluetoothList").readResolve());
    static final IntNum Lit56;
    static final IntNum Lit57 = IntNum.make(15);
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit59 = IntNum.make(36);
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit61;
    static final IntNum Lit62 = IntNum.make(100);
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("Elements").readResolve());
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve());
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("BluetoothList$BeforePicking").readResolve());
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve());
    static final IntNum Lit7 = IntNum.make(3);
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("Connect").readResolve());
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final PairWithPosition Lit72 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 426106);
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("BluetoothList$AfterPicking").readResolve());
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Connected").readResolve());
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("HasMargins").readResolve());
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Disconnect").readResolve());
    static final IntNum Lit81;
    static final IntNum Lit82;
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Disconnect$Click").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement27").readResolve());
    static final IntNum Lit88 = IntNum.make(-1003);
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit9;
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement28").readResolve());
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("Forward").readResolve());
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol(Component.LISTVIEW_KEY_IMAGE).readResolve());
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit97 = PairWithPosition.make(Lit309, PairWithPosition.make(Lit309, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 692340), "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 692335);
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("Left").readResolve());
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Right").readResolve());
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn72 = null;
    static final ModuleMethod lambda$Fn73 = null;
    static final ModuleMethod lambda$Fn74 = null;
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn79 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn80 = null;
    static final ModuleMethod lambda$Fn81 = null;
    static final ModuleMethod lambda$Fn82 = null;
    static final ModuleMethod lambda$Fn83 = null;
    static final ModuleMethod lambda$Fn84 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Backward;
    public final ModuleMethod Backward$Click;
    public BluetoothClient BluetoothClient1;
    public final ModuleMethod BluetoothClient1$BluetoothError;
    public ListPicker BluetoothList;
    public final ModuleMethod BluetoothList$AfterPicking;
    public final ModuleMethod BluetoothList$BeforePicking;
    public Button Button1;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public Label Connected;
    public Button Disconnect;
    public final ModuleMethod Disconnect$Click;
    public Button Forward;
    public final ModuleMethod Forward$Click;
    public HorizontalArrangement HorizontalArrangement18;
    public HorizontalArrangement HorizontalArrangement26;
    public HorizontalArrangement HorizontalArrangement27;
    public HorizontalArrangement HorizontalArrangement28;
    public HorizontalArrangement HorizontalArrangement29;
    public HorizontalArrangement HorizontalArrangement30;
    public HorizontalArrangement HorizontalArrangement31;
    public HorizontalArrangement HorizontalArrangement32;
    public HorizontalArrangement HorizontalArrangement34;
    public HorizontalArrangement HorizontalArrangement35;
    public HorizontalArrangement HorizontalArrangement36;
    public HorizontalArrangement HorizontalArrangement37;
    public HorizontalArrangement HorizontalArrangement38;
    public HorizontalArrangement HorizontalArrangement39;
    public HorizontalArrangement HorizontalArrangement40;
    public HorizontalScrollArrangement HorizontalScrollArrangement1;
    public Image Image1;
    public Image Image2;
    public Label Label8;
    public Label Label9;
    public Button Left;
    public final ModuleMethod Left$Click;
    public Button LeftBackward;
    public final ModuleMethod LeftBackward$Click;
    public Button LeftForward;
    public final ModuleMethod LeftForward$Click;
    public Label Positions;
    public Label PositionsSaved;
    public Button Reset;
    public final ModuleMethod Reset$Click;
    public Button Right;
    public final ModuleMethod Right$Click;
    public Button RightBackward;
    public final ModuleMethod RightBackward$Click;
    public Button RightForward;
    public final ModuleMethod RightForward$Click;
    public Button RotateLeft;
    public final ModuleMethod RotateLeft$Click;
    public Button RotateRight;
    public final ModuleMethod RotateRight$Click;
    public Button Run;
    public final ModuleMethod Run$Click;
    public Button Save;
    public final ModuleMethod Save$Click;
    public Slider Speed;
    public final ModuleMethod Speed$PositionChanged;
    public WebViewer WebViewer1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit16 = simpleSymbol;
        Lit291 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 2191655);
        SimpleSymbol simpleSymbol2 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit9 = simpleSymbol2;
        Lit256 = PairWithPosition.make(simpleSymbol2, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1933500);
        SimpleSymbol simpleSymbol3 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit5 = simpleSymbol3;
        Lit255 = PairWithPosition.make(simpleSymbol3, LList.Empty, "/tmp/1700632783519_0.01937158457515975-0/youngandroidproject/../src/appinventor/ai_hewagesureshchathuranga/Arduino_Spider/Screen1.yail", 1933480);
        int[] iArr = new int[2];
        iArr[0] = -14046238;
        Lit245 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -14038558;
        Lit243 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit235 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit232 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -3355444;
        Lit220 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -3355444;
        Lit209 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -3355444;
        Lit198 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -3355444;
        Lit82 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -13877680;
        Lit81 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -3355444;
        Lit61 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -13877680;
        Lit56 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -3355444;
        Lit45 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -855310;
        Lit11 = IntNum.make(iArr13);
        int[] iArr14 = new int[2];
        iArr14[0] = -3355444;
        Lit4 = IntNum.make(iArr14);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit295, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit296, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit297, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit298, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit299, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit300, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit301, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit302, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit303, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit304, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit305, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit306, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit307, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit308, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime8631272541632802891.scm:634");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 32, (Object) null, 0);
        this.BluetoothList$BeforePicking = new ModuleMethod(frame2, 33, Lit68, 0);
        this.BluetoothList$AfterPicking = new ModuleMethod(frame2, 34, Lit73, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 38, (Object) null, 0);
        this.Disconnect$Click = new ModuleMethod(frame2, 39, Lit84, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 45, (Object) null, 0);
        this.Forward$Click = new ModuleMethod(frame2, 46, Lit112, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 47, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 50, (Object) null, 0);
        this.Left$Click = new ModuleMethod(frame2, 51, Lit121, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 54, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 55, (Object) null, 0);
        this.Right$Click = new ModuleMethod(frame2, 56, Lit133, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 57, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 58, (Object) null, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 59, (Object) null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 60, (Object) null, 0);
        this.LeftBackward$Click = new ModuleMethod(frame2, 61, Lit142, 0);
        lambda$Fn37 = new ModuleMethod(frame2, 62, (Object) null, 0);
        lambda$Fn38 = new ModuleMethod(frame2, 63, (Object) null, 0);
        this.Backward$Click = new ModuleMethod(frame2, 64, Lit148, 0);
        lambda$Fn39 = new ModuleMethod(frame2, 65, (Object) null, 0);
        lambda$Fn40 = new ModuleMethod(frame2, 66, (Object) null, 0);
        this.RightBackward$Click = new ModuleMethod(frame2, 67, Lit154, 0);
        lambda$Fn41 = new ModuleMethod(frame2, 68, (Object) null, 0);
        lambda$Fn42 = new ModuleMethod(frame2, 69, (Object) null, 0);
        this.RotateLeft$Click = new ModuleMethod(frame2, 70, Lit160, 0);
        lambda$Fn43 = new ModuleMethod(frame2, 71, (Object) null, 0);
        lambda$Fn44 = new ModuleMethod(frame2, 72, (Object) null, 0);
        lambda$Fn45 = new ModuleMethod(frame2, 73, (Object) null, 0);
        lambda$Fn46 = new ModuleMethod(frame2, 74, (Object) null, 0);
        this.RotateRight$Click = new ModuleMethod(frame2, 75, Lit171, 0);
        lambda$Fn47 = new ModuleMethod(frame2, 76, (Object) null, 0);
        lambda$Fn48 = new ModuleMethod(frame2, 77, (Object) null, 0);
        lambda$Fn49 = new ModuleMethod(frame2, 78, (Object) null, 0);
        lambda$Fn50 = new ModuleMethod(frame2, 79, (Object) null, 0);
        lambda$Fn51 = new ModuleMethod(frame2, 80, (Object) null, 0);
        lambda$Fn52 = new ModuleMethod(frame2, 81, (Object) null, 0);
        this.LeftForward$Click = new ModuleMethod(frame2, 82, Lit183, 0);
        lambda$Fn53 = new ModuleMethod(frame2, 83, (Object) null, 0);
        lambda$Fn54 = new ModuleMethod(frame2, 84, (Object) null, 0);
        lambda$Fn55 = new ModuleMethod(frame2, 85, (Object) null, 0);
        lambda$Fn56 = new ModuleMethod(frame2, 86, (Object) null, 0);
        this.RightForward$Click = new ModuleMethod(frame2, 87, Lit192, 0);
        lambda$Fn57 = new ModuleMethod(frame2, 88, (Object) null, 0);
        lambda$Fn58 = new ModuleMethod(frame2, 89, (Object) null, 0);
        lambda$Fn59 = new ModuleMethod(frame2, 90, (Object) null, 0);
        lambda$Fn60 = new ModuleMethod(frame2, 91, (Object) null, 0);
        this.Save$Click = new ModuleMethod(frame2, 92, Lit206, 0);
        lambda$Fn61 = new ModuleMethod(frame2, 93, (Object) null, 0);
        lambda$Fn62 = new ModuleMethod(frame2, 94, (Object) null, 0);
        this.Run$Click = new ModuleMethod(frame2, 95, Lit217, 0);
        lambda$Fn63 = new ModuleMethod(frame2, 96, (Object) null, 0);
        lambda$Fn64 = new ModuleMethod(frame2, 97, (Object) null, 0);
        this.Reset$Click = new ModuleMethod(frame2, 98, Lit225, 0);
        lambda$Fn65 = new ModuleMethod(frame2, 99, (Object) null, 0);
        lambda$Fn66 = new ModuleMethod(frame2, 100, (Object) null, 0);
        lambda$Fn67 = new ModuleMethod(frame2, 101, (Object) null, 0);
        lambda$Fn68 = new ModuleMethod(frame2, 102, (Object) null, 0);
        lambda$Fn69 = new ModuleMethod(frame2, 103, (Object) null, 0);
        lambda$Fn70 = new ModuleMethod(frame2, 104, (Object) null, 0);
        lambda$Fn71 = new ModuleMethod(frame2, 105, (Object) null, 0);
        lambda$Fn72 = new ModuleMethod(frame2, 106, (Object) null, 0);
        lambda$Fn73 = new ModuleMethod(frame2, 107, (Object) null, 0);
        lambda$Fn74 = new ModuleMethod(frame2, 108, (Object) null, 0);
        this.Speed$PositionChanged = new ModuleMethod(frame2, 109, Lit257, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn75 = new ModuleMethod(frame2, 110, (Object) null, 0);
        lambda$Fn76 = new ModuleMethod(frame2, 111, (Object) null, 0);
        lambda$Fn77 = new ModuleMethod(frame2, 112, (Object) null, 0);
        lambda$Fn78 = new ModuleMethod(frame2, 113, (Object) null, 0);
        lambda$Fn79 = new ModuleMethod(frame2, 114, (Object) null, 0);
        lambda$Fn80 = new ModuleMethod(frame2, 115, (Object) null, 0);
        lambda$Fn81 = new ModuleMethod(frame2, 116, (Object) null, 0);
        lambda$Fn82 = new ModuleMethod(frame2, 117, (Object) null, 0);
        lambda$Fn83 = new ModuleMethod(frame2, 118, (Object) null, 0);
        lambda$Fn84 = new ModuleMethod(frame2, 119, (Object) null, 0);
        this.BluetoothClient1$BluetoothError = new ModuleMethod(frame2, 120, Lit285, 8194);
        this.Clock1$Timer = new ModuleMethod(frame2, 121, Lit293, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Spider Robot", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Background.png", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "DSC_1541~2.JPG", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "portrait", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.TRUE, Lit16);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Boolean.FALSE, Lit16);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.FALSE, Lit16);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "Responsive", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Robot Lk", Lit9);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit16), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement36 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit22, Lit23, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit26, Lit23, lambda$Fn4);
                }
                this.HorizontalArrangement18 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit27, Lit28, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit35, Lit28, lambda$Fn6);
                }
                this.Label8 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit28, Lit36, Lit37, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit28, Lit46, Lit37, lambda$Fn8);
                }
                this.HorizontalArrangement35 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit47, Lit48, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit50, Lit48, lambda$Fn10);
                }
                this.HorizontalArrangement26 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit51, Lit52, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit53, Lit52, lambda$Fn12);
                }
                this.BluetoothList = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit54, Lit55, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit52, Lit63, Lit55, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit68, this.BluetoothList$BeforePicking);
                } else {
                    addToFormEnvironment(Lit68, this.BluetoothList$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "BluetoothList", "BeforePicking");
                } else {
                    addToEvents(Lit55, Lit69);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit73, this.BluetoothList$AfterPicking);
                } else {
                    addToFormEnvironment(Lit73, this.BluetoothList$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "BluetoothList", "AfterPicking");
                } else {
                    addToEvents(Lit55, Lit74);
                }
                this.Connected = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit75, Lit76, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit52, Lit78, Lit76, lambda$Fn16);
                }
                this.Disconnect = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit52, Lit79, Lit80, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit52, Lit83, Lit80, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit84, this.Disconnect$Click);
                } else {
                    addToFormEnvironment(Lit84, this.Disconnect$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Disconnect", "Click");
                } else {
                    addToEvents(Lit80, Lit85);
                }
                this.HorizontalArrangement27 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit87, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit0, Lit89, Lit87, lambda$Fn20);
                }
                this.HorizontalArrangement28 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit90, Lit91, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit92, Lit91, lambda$Fn22);
                }
                this.Forward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit91, Lit93, Lit94, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit91, Lit96, Lit94, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit112, this.Forward$Click);
                } else {
                    addToFormEnvironment(Lit112, this.Forward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Forward", "Click");
                } else {
                    addToEvents(Lit94, Lit85);
                }
                this.HorizontalArrangement29 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit113, Lit114, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit115, Lit114, lambda$Fn26);
                }
                this.Left = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit114, Lit116, Lit98, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit114, Lit117, Lit98, lambda$Fn28);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit121, this.Left$Click);
                } else {
                    addToFormEnvironment(Lit121, this.Left$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Left", "Click");
                } else {
                    addToEvents(Lit98, Lit85);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit114, Lit122, Lit123, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit114, Lit127, Lit123, lambda$Fn30);
                }
                this.Right = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit114, Lit128, Lit99, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit114, Lit129, Lit99, lambda$Fn32);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit133, this.Right$Click);
                } else {
                    addToFormEnvironment(Lit133, this.Right$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Right", "Click");
                } else {
                    addToEvents(Lit99, Lit85);
                }
                this.HorizontalArrangement30 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit134, Lit135, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit0, Lit136, Lit135, lambda$Fn34);
                }
                this.LeftBackward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit135, Lit137, Lit103, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit135, Lit138, Lit103, lambda$Fn36);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit142, this.LeftBackward$Click);
                } else {
                    addToFormEnvironment(Lit142, this.LeftBackward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "LeftBackward", "Click");
                } else {
                    addToEvents(Lit103, Lit85);
                }
                this.Backward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit135, Lit143, Lit100, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit135, Lit144, Lit100, lambda$Fn38);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit148, this.Backward$Click);
                } else {
                    addToFormEnvironment(Lit148, this.Backward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Backward", "Click");
                } else {
                    addToEvents(Lit100, Lit85);
                }
                this.RightBackward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit135, Lit149, Lit104, lambda$Fn39), $result);
                } else {
                    addToComponents(Lit135, Lit150, Lit104, lambda$Fn40);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit154, this.RightBackward$Click);
                } else {
                    addToFormEnvironment(Lit154, this.RightBackward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "RightBackward", "Click");
                } else {
                    addToEvents(Lit104, Lit85);
                }
                this.RotateLeft = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit155, Lit105, lambda$Fn41), $result);
                } else {
                    addToComponents(Lit0, Lit156, Lit105, lambda$Fn42);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit160, this.RotateLeft$Click);
                } else {
                    addToFormEnvironment(Lit160, this.RotateLeft$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "RotateLeft", "Click");
                } else {
                    addToEvents(Lit105, Lit85);
                }
                this.HorizontalArrangement32 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit161, Lit162, lambda$Fn43), $result);
                } else {
                    addToComponents(Lit0, Lit164, Lit162, lambda$Fn44);
                }
                this.RotateRight = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit162, Lit165, Lit106, lambda$Fn45), $result);
                } else {
                    addToComponents(Lit162, Lit166, Lit106, lambda$Fn46);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit171, this.RotateRight$Click);
                } else {
                    addToFormEnvironment(Lit171, this.RotateRight$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "RotateRight", "Click");
                } else {
                    addToEvents(Lit106, Lit85);
                }
                this.HorizontalScrollArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit172, Lit173, lambda$Fn47), $result);
                } else {
                    addToComponents(Lit0, Lit174, Lit173, lambda$Fn48);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit173, Lit175, Lit176, lambda$Fn49), $result);
                } else {
                    addToComponents(Lit173, Lit177, Lit176, lambda$Fn50);
                }
                this.LeftForward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit173, Lit178, Lit101, lambda$Fn51), $result);
                } else {
                    addToComponents(Lit173, Lit179, Lit101, lambda$Fn52);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit183, this.LeftForward$Click);
                } else {
                    addToFormEnvironment(Lit183, this.LeftForward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "LeftForward", "Click");
                } else {
                    addToEvents(Lit101, Lit85);
                }
                this.Label9 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit173, Lit184, Lit185, lambda$Fn53), $result);
                } else {
                    addToComponents(Lit173, Lit186, Lit185, lambda$Fn54);
                }
                this.RightForward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit173, Lit187, Lit102, lambda$Fn55), $result);
                } else {
                    addToComponents(Lit173, Lit188, Lit102, lambda$Fn56);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit192, this.RightForward$Click);
                } else {
                    addToFormEnvironment(Lit192, this.RightForward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "RightForward", "Click");
                } else {
                    addToEvents(Lit102, Lit85);
                }
                this.HorizontalArrangement31 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit193, Lit194, lambda$Fn57), $result);
                } else {
                    addToComponents(Lit0, Lit195, Lit194, lambda$Fn58);
                }
                this.Save = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit194, Lit196, Lit197, lambda$Fn59), $result);
                } else {
                    addToComponents(Lit194, Lit201, Lit197, lambda$Fn60);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit206, this.Save$Click);
                } else {
                    addToFormEnvironment(Lit206, this.Save$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Save", "Click");
                } else {
                    addToEvents(Lit197, Lit85);
                }
                this.Run = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit194, Lit207, Lit208, lambda$Fn61), $result);
                } else {
                    addToComponents(Lit194, Lit211, Lit208, lambda$Fn62);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit217, this.Run$Click);
                } else {
                    addToFormEnvironment(Lit217, this.Run$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Run", "Click");
                } else {
                    addToEvents(Lit208, Lit85);
                }
                this.Reset = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit194, Lit218, Lit219, lambda$Fn63), $result);
                } else {
                    addToComponents(Lit194, Lit221, Lit219, lambda$Fn64);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit225, this.Reset$Click);
                } else {
                    addToFormEnvironment(Lit225, this.Reset$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Reset", "Click");
                } else {
                    addToEvents(Lit219, Lit85);
                }
                this.HorizontalArrangement38 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit226, Lit227, lambda$Fn65), $result);
                } else {
                    addToComponents(Lit0, Lit229, Lit227, lambda$Fn66);
                }
                this.PositionsSaved = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit227, Lit230, Lit231, lambda$Fn67), $result);
                } else {
                    addToComponents(Lit227, Lit233, Lit231, lambda$Fn68);
                }
                this.Positions = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit227, Lit234, Lit204, lambda$Fn69), $result);
                } else {
                    addToComponents(Lit227, Lit236, Lit204, lambda$Fn70);
                }
                this.HorizontalArrangement37 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit237, Lit238, lambda$Fn71), $result);
                } else {
                    addToComponents(Lit0, Lit239, Lit238, lambda$Fn72);
                }
                this.Speed = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit238, Lit240, Lit241, lambda$Fn73), $result);
                } else {
                    addToComponents(Lit238, Lit253, Lit241, lambda$Fn74);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit257, this.Speed$PositionChanged);
                } else {
                    addToFormEnvironment(Lit257, this.Speed$PositionChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Speed", "PositionChanged");
                } else {
                    addToEvents(Lit241, Lit258);
                }
                this.HorizontalArrangement39 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit259, Lit260, lambda$Fn75), $result);
                } else {
                    addToComponents(Lit0, Lit262, Lit260, lambda$Fn76);
                }
                this.HorizontalArrangement40 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit263, Lit264, lambda$Fn77), $result);
                } else {
                    addToComponents(Lit0, Lit266, Lit264, lambda$Fn78);
                }
                this.HorizontalArrangement34 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit267, Lit268, lambda$Fn79), $result);
                } else {
                    addToComponents(Lit0, Lit269, Lit268, lambda$Fn80);
                }
                this.Image2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit268, Lit270, Lit271, lambda$Fn81), $result);
                } else {
                    addToComponents(Lit268, Lit273, Lit271, lambda$Fn82);
                }
                this.WebViewer1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit274, Lit275, lambda$Fn83), $result);
                } else {
                    addToComponents(Lit0, Lit279, Lit275, lambda$Fn84);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit280, Lit65, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit281, Lit65, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit285, this.BluetoothClient1$BluetoothError);
                } else {
                    addToFormEnvironment(Lit285, this.BluetoothClient1$BluetoothError);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "BluetoothClient1", "BluetoothError");
                } else {
                    addToEvents(Lit65, Lit286);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit287, Lit288, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit289, Lit288, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit293, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit293, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit288, Lit294);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Spider Robot", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Background.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "DSC_1541~2.JPG", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "portrait", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.TRUE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Boolean.FALSE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.FALSE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "Responsive", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Robot Lk", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit16);
    }

    static Object lambda4() {
        return runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit5);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit5);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit6, Lit7, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit10, Lit31, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit32, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit33, Lit34, Lit5);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit6, Lit7, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit10, Lit31, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit32, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit33, Lit34, Lit5);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit37, Lit38, Boolean.TRUE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit41, "Arduino Spider Robot", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit42, Lit43, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit44, Lit45, Lit5);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit37, Lit38, Boolean.TRUE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit41, "Arduino Spider Robot", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit42, Lit43, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit44, Lit45, Lit5);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit24, Lit49, Lit5);
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit24, Lit49, Lit5);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit6, Lit7, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit29, Lit30, Lit5);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit6, Lit7, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit29, Lit30, Lit5);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit10, Lit56, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit38, Boolean.TRUE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit39, Lit57, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Component.TYPEFACE_SANSSERIF, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit24, Lit59, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit60, Lit30, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit41, "Connect", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit44, Lit61, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit33, Lit62, Lit5);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit10, Lit56, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit38, Boolean.TRUE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit39, Lit57, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Component.TYPEFACE_SANSSERIF, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit24, Lit59, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit60, Lit30, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit41, "Connect", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit44, Lit61, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit33, Lit62, Lit5);
    }

    public Object BluetoothList$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit64, runtime.getProperty$1(Lit65, Lit66), Lit67);
    }

    public Object BluetoothList$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit65, Lit70, LList.list1(runtime.getProperty$1(Lit55, Lit71)), Lit72) != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit55, Lit64, runtime.getProperty$1(Lit65, Lit66), Lit67) : Values.empty;
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit77, Boolean.FALSE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit41, "Not Connected", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit42, Lit43, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit33, Lit62, Lit5);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit77, Boolean.FALSE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit41, "Not Connected", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit42, Lit43, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit33, Lit62, Lit5);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit10, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit38, Boolean.TRUE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit39, Lit57, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit58, Component.TYPEFACE_SANSSERIF, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit24, Lit59, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit60, Lit30, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit41, "Disconnect", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit44, Lit82, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit33, Lit62, Lit5);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit10, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit38, Boolean.TRUE, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit39, Lit57, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit58, Component.TYPEFACE_SANSSERIF, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit24, Lit59, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit60, Lit30, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit41, "Disconnect", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit44, Lit82, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit33, Lit62, Lit5);
    }

    public Object Disconnect$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit65, Lit80, LList.Empty, LList.Empty);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit24, Lit88, Lit5);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit24, Lit88, Lit5);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit6, Lit7, Lit5);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit6, Lit7, Lit5);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit33, Lit62, Lit5);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit33, Lit62, Lit5);
    }

    public Object Forward$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit94, Lit95), "Forward_0.png"), Lit97, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_1.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "LeftForward_0ne.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit107, LList.list1("F"), Lit108);
        }
        runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit111);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit6, Lit7, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit29, Lit30, Lit5);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit6, Lit7, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit29, Lit30, Lit5);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit98, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit33, Lit62, Lit5);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit98, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit33, Lit62, Lit5);
    }

    public Object Left$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit98, Lit95), "Left_0.png"), Lit118, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_1.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "LeftForward_0ne.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit107, LList.list1("L"), Lit119);
        }
        runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit120);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit123, Lit24, Lit124, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit123, Lit125, "DSC_1541~2.JPG", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit123, Lit33, Lit126, Lit5);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit123, Lit24, Lit124, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit123, Lit125, "DSC_1541~2.JPG", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit123, Lit33, Lit126, Lit5);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit33, Lit62, Lit5);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit33, Lit62, Lit5);
    }

    public Object Right$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit99, Lit95), "Right_0.png"), Lit130, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_1.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "LeftForward_0ne.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit107, LList.list1("R"), Lit131);
        }
        runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit132);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit6, Lit7, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit29, Lit30, Lit5);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit6, Lit7, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit29, Lit30, Lit5);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit41, "Hand Shake", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit33, Lit62, Lit5);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit41, "Hand Shake", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit33, Lit62, Lit5);
    }

    public Object LeftBackward$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit103, Lit95), "LeftBackward_1ne.png"), Lit139, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "LeftForward_0ne.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit107, LList.list1("U"), Lit140);
        }
        runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftBackward_1ne.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit141);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit33, Lit62, Lit5);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit33, Lit62, Lit5);
    }

    public Object Backward$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit100, Lit95), "Backward_0.png"), Lit145, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_1.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "LeftForward_0ne.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit107, LList.list1("B"), Lit146);
        }
        runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit147);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit104, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit104, Lit41, "Hand Wave", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit33, Lit62, Lit5);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit104, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit104, Lit41, "Hand Wave", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit33, Lit62, Lit5);
    }

    public Object RightBackward$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit104, Lit95), "LeftBackward_1ne.png"), Lit151, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "LeftForward_0ne.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit107, LList.list1("W"), Lit152);
        }
        runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftBackward_1ne.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit153);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit105, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit41, "Dance", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit33, Lit62, Lit5);
    }

    static Object lambda43() {
        runtime.setAndCoerceProperty$Ex(Lit105, Lit39, Lit40, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit41, "Dance", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit33, Lit62, Lit5);
    }

    public Object RotateLeft$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit105, Lit95), "LeftBackward_1ne.png"), Lit157, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "LeftForward_0ne.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftForward_0ne.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit107, LList.list1("V"), Lit158);
        }
        runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "LeftBackward_1ne.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit159);
    }

    static Object lambda44() {
        return runtime.setAndCoerceProperty$Ex(Lit162, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda45() {
        return runtime.setAndCoerceProperty$Ex(Lit162, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda46() {
        runtime.setAndCoerceProperty$Ex(Lit106, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "RotateRight_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit106, Lit33, Lit62, Lit5);
    }

    static Object lambda47() {
        runtime.setAndCoerceProperty$Ex(Lit106, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "RotateRight_0.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit106, Lit33, Lit62, Lit5);
    }

    public Object RotateRight$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit106, Lit95), "RotateRight_0.png"), Lit167, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "RotateRight_1.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftBackward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "RightBackward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "RotateLeft_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "RightForward_0.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit168), Lit169);
        }
        runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "RotateRight_0.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit170);
    }

    static Object lambda48() {
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda49() {
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit163, Boolean.FALSE, Lit16);
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 109:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 120:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                case 109:
                    return this.$main.Speed$PositionChanged(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                case 120:
                    return this.$main.BluetoothClient1$BluetoothError(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return Screen1.lambda13();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 33:
                    return this.$main.BluetoothList$BeforePicking();
                case 34:
                    return this.$main.BluetoothList$AfterPicking();
                case 35:
                    return Screen1.lambda16();
                case 36:
                    return Screen1.lambda17();
                case 37:
                    return Screen1.lambda18();
                case 38:
                    return Screen1.lambda19();
                case 39:
                    return this.$main.Disconnect$Click();
                case 40:
                    return Screen1.lambda20();
                case 41:
                    return Screen1.lambda21();
                case 42:
                    return Screen1.lambda22();
                case 43:
                    return Screen1.lambda23();
                case 44:
                    return Screen1.lambda24();
                case 45:
                    return Screen1.lambda25();
                case 46:
                    return this.$main.Forward$Click();
                case 47:
                    return Screen1.lambda26();
                case 48:
                    return Screen1.lambda27();
                case 49:
                    return Screen1.lambda28();
                case 50:
                    return Screen1.lambda29();
                case 51:
                    return this.$main.Left$Click();
                case 52:
                    return Screen1.lambda30();
                case 53:
                    return Screen1.lambda31();
                case 54:
                    return Screen1.lambda32();
                case 55:
                    return Screen1.lambda33();
                case 56:
                    return this.$main.Right$Click();
                case 57:
                    return Screen1.lambda34();
                case 58:
                    return Screen1.lambda35();
                case 59:
                    return Screen1.lambda36();
                case 60:
                    return Screen1.lambda37();
                case 61:
                    return this.$main.LeftBackward$Click();
                case 62:
                    return Screen1.lambda38();
                case 63:
                    return Screen1.lambda39();
                case 64:
                    return this.$main.Backward$Click();
                case 65:
                    return Screen1.lambda40();
                case 66:
                    return Screen1.lambda41();
                case 67:
                    return this.$main.RightBackward$Click();
                case 68:
                    return Screen1.lambda42();
                case 69:
                    return Screen1.lambda43();
                case 70:
                    return this.$main.RotateLeft$Click();
                case 71:
                    return Screen1.lambda44();
                case 72:
                    return Screen1.lambda45();
                case 73:
                    return Screen1.lambda46();
                case 74:
                    return Screen1.lambda47();
                case 75:
                    return this.$main.RotateRight$Click();
                case 76:
                    return Screen1.lambda48();
                case 77:
                    return Screen1.lambda49();
                case 78:
                    return Screen1.lambda50();
                case 79:
                    return Screen1.lambda51();
                case 80:
                    return Screen1.lambda52();
                case 81:
                    return Screen1.lambda53();
                case 82:
                    return this.$main.LeftForward$Click();
                case 83:
                    return Screen1.lambda54();
                case 84:
                    return Screen1.lambda55();
                case 85:
                    return Screen1.lambda56();
                case 86:
                    return Screen1.lambda57();
                case 87:
                    return this.$main.RightForward$Click();
                case 88:
                    return Screen1.lambda58();
                case 89:
                    return Screen1.lambda59();
                case 90:
                    return Screen1.lambda60();
                case 91:
                    return Screen1.lambda61();
                case 92:
                    return this.$main.Save$Click();
                case 93:
                    return Screen1.lambda62();
                case 94:
                    return Screen1.lambda63();
                case 95:
                    return this.$main.Run$Click();
                case 96:
                    return Screen1.lambda64();
                case 97:
                    return Screen1.lambda65();
                case 98:
                    return this.$main.Reset$Click();
                case 99:
                    return Screen1.lambda66();
                case 100:
                    return Screen1.lambda67();
                case 101:
                    return Screen1.lambda68();
                case 102:
                    return Screen1.lambda69();
                case 103:
                    return Screen1.lambda70();
                case 104:
                    return Screen1.lambda71();
                case 105:
                    return Screen1.lambda72();
                case 106:
                    return Screen1.lambda73();
                case 107:
                    return Screen1.lambda74();
                case 108:
                    return Screen1.lambda75();
                case 110:
                    return Screen1.lambda76();
                case 111:
                    return Screen1.lambda77();
                case 112:
                    return Screen1.lambda78();
                case 113:
                    return Screen1.lambda79();
                case 114:
                    return Screen1.lambda80();
                case 115:
                    return Screen1.lambda81();
                case 116:
                    return Screen1.lambda82();
                case 117:
                    return Screen1.lambda83();
                case 118:
                    return Screen1.lambda84();
                case 119:
                    return Screen1.lambda85();
                case 121:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 70:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 74:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 76:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 77:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 78:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 82:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 83:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 88:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 90:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 91:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 92:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 93:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 94:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 95:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 96:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 97:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 98:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 99:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 100:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 101:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 102:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 103:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 104:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 105:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 106:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 107:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 108:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 110:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 111:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 112:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 113:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 114:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 115:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 116:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 117:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 118:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 119:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 121:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static Object lambda50() {
        runtime.setAndCoerceProperty$Ex(Lit176, Lit41, "Text for Button1", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit176, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda51() {
        runtime.setAndCoerceProperty$Ex(Lit176, Lit41, "Text for Button1", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit176, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda52() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit101, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit33, Lit62, Lit5);
    }

    static Object lambda53() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit101, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit33, Lit62, Lit5);
    }

    public Object LeftForward$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit101, Lit95), "LeftForward_0.png"), Lit180, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_1.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "RightForward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftBackward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "RightBackward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "RotateLeft_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "RotateRight_0.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit43), Lit181);
        }
        runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftBackward_1ne.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit182);
    }

    static Object lambda54() {
        runtime.setAndCoerceProperty$Ex(Lit185, Lit41, "Text for Label9", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit185, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda55() {
        runtime.setAndCoerceProperty$Ex(Lit185, Lit41, "Text for Label9", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit185, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda56() {
        runtime.setAndCoerceProperty$Ex(Lit102, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "RightForward_0.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit102, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit33, Lit62, Lit5);
    }

    static Object lambda57() {
        runtime.setAndCoerceProperty$Ex(Lit102, Lit24, Lit62, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "RightForward_0.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit102, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit33, Lit62, Lit5);
    }

    public Object RightForward$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit102, Lit95), "RightForward_0.png"), Lit189, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "RightForward_1.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit98, Lit95, "Left_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit99, Lit95, "Right_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit100, Lit95, "Backward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit101, Lit95, "LeftForward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit94, Lit95, "Forward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit103, Lit95, "LeftBackward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit104, Lit95, "RightBackward_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit105, Lit95, "RotateLeft_0.png", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit95, "RotateRight_0.png", Lit9);
            return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit7), Lit190);
        }
        runtime.setAndCoerceProperty$Ex(Lit102, Lit95, "LeftBackward_1ne.png", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit110), Lit191);
    }

    static Object lambda58() {
        return runtime.setAndCoerceProperty$Ex(Lit194, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda59() {
        return runtime.setAndCoerceProperty$Ex(Lit194, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda60() {
        runtime.setAndCoerceProperty$Ex(Lit197, Lit10, Lit198, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit197, Lit24, Lit199, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit197, Lit41, "SAVE", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit197, Lit33, Lit200, Lit5);
    }

    static Object lambda61() {
        runtime.setAndCoerceProperty$Ex(Lit197, Lit10, Lit198, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit197, Lit24, Lit199, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit197, Lit41, "SAVE", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit197, Lit33, Lit200, Lit5);
    }

    public Object Save$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit202), Lit203);
        return runtime.setAndCoerceProperty$Ex(Lit204, Lit41, runtime.callYailPrimitive(AddOp.$Pl, LList.list2(runtime.getProperty$1(Lit204, Lit41), Lit43), Lit205, "+"), Lit9);
    }

    static Object lambda62() {
        runtime.setAndCoerceProperty$Ex(Lit208, Lit10, Lit209, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit208, Lit24, Lit199, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit208, Lit41, "RUN", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit208, Lit33, Lit210, Lit5);
    }

    static Object lambda63() {
        runtime.setAndCoerceProperty$Ex(Lit208, Lit10, Lit209, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit208, Lit24, Lit199, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit208, Lit41, "RUN", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit208, Lit33, Lit210, Lit5);
    }

    public Object Run$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit208, Lit41), "RUN"), Lit212, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit208, Lit41, "PAUSE", Lit9);
            runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit213), Lit214);
            return runtime.setAndCoerceProperty$Ex(Lit208, Lit10, Lit215, Lit5);
        }
        runtime.setAndCoerceProperty$Ex(Lit208, Lit41, "RUN", Lit9);
        return runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit57), Lit216);
    }

    static Object lambda64() {
        runtime.setAndCoerceProperty$Ex(Lit219, Lit10, Lit220, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit219, Lit24, Lit199, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit219, Lit41, "RESET", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit219, Lit33, Lit210, Lit5);
    }

    static Object lambda65() {
        runtime.setAndCoerceProperty$Ex(Lit219, Lit10, Lit220, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit219, Lit24, Lit199, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit219, Lit41, "RESET", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit219, Lit33, Lit210, Lit5);
    }

    public Object Reset$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit65, Lit109, LList.list1(Lit222), Lit223);
        runtime.setAndCoerceProperty$Ex(Lit208, Lit10, Lit224, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit204, Lit41, Lit110, Lit9);
    }

    static Object lambda66() {
        runtime.setAndCoerceProperty$Ex(Lit227, Lit24, Lit228, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit227, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda67() {
        runtime.setAndCoerceProperty$Ex(Lit227, Lit24, Lit228, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit227, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda68() {
        runtime.setAndCoerceProperty$Ex(Lit231, Lit41, "Positions saved: ", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit231, Lit44, Lit232, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit231, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda69() {
        runtime.setAndCoerceProperty$Ex(Lit231, Lit41, "Positions saved: ", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit231, Lit44, Lit232, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit231, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda70() {
        runtime.setAndCoerceProperty$Ex(Lit204, Lit41, Component.TYPEFACE_DEFAULT, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit204, Lit44, Lit235, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit204, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda71() {
        runtime.setAndCoerceProperty$Ex(Lit204, Lit41, Component.TYPEFACE_DEFAULT, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit204, Lit44, Lit235, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit204, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda72() {
        return runtime.setAndCoerceProperty$Ex(Lit238, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda73() {
        return runtime.setAndCoerceProperty$Ex(Lit238, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda74() {
        runtime.setAndCoerceProperty$Ex(Lit241, Lit242, Lit243, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit244, Lit245, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit246, Lit247, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit248, Lit249, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit250, Lit251, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit241, Lit33, Lit252, Lit5);
    }

    static Object lambda75() {
        runtime.setAndCoerceProperty$Ex(Lit241, Lit242, Lit243, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit244, Lit245, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit246, Lit247, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit248, Lit249, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit250, Lit251, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit241, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit241, Lit33, Lit252, Lit5);
    }

    public Object Speed$PositionChanged(Object $thumbPosition) {
        Object $thumbPosition2 = runtime.sanitizeComponentData($thumbPosition);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit65;
        SimpleSymbol simpleSymbol2 = Lit109;
        ModuleMethod moduleMethod = runtime.yail$Mnround;
        if ($thumbPosition2 instanceof Package) {
            $thumbPosition2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit254), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, LList.list1($thumbPosition2), Lit255, "round")), Lit256);
    }

    static Object lambda76() {
        return runtime.setAndCoerceProperty$Ex(Lit260, Lit24, Lit261, Lit5);
    }

    static Object lambda77() {
        return runtime.setAndCoerceProperty$Ex(Lit260, Lit24, Lit261, Lit5);
    }

    static Object lambda78() {
        runtime.setAndCoerceProperty$Ex(Lit264, Lit24, Lit265, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit264, Lit95, "SUR010.jpg", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit264, Lit33, Lit265, Lit5);
    }

    static Object lambda79() {
        runtime.setAndCoerceProperty$Ex(Lit264, Lit24, Lit265, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit264, Lit95, "SUR010.jpg", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit264, Lit33, Lit265, Lit5);
    }

    static Object lambda80() {
        return runtime.setAndCoerceProperty$Ex(Lit268, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda81() {
        return runtime.setAndCoerceProperty$Ex(Lit268, Lit163, Boolean.FALSE, Lit16);
    }

    static Object lambda82() {
        runtime.setAndCoerceProperty$Ex(Lit271, Lit24, Lit272, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit271, Lit125, "SUR010.jpg", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit271, Lit33, Lit272, Lit5);
    }

    static Object lambda83() {
        runtime.setAndCoerceProperty$Ex(Lit271, Lit24, Lit272, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit271, Lit125, "SUR010.jpg", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit271, Lit33, Lit272, Lit5);
    }

    static Object lambda84() {
        runtime.setAndCoerceProperty$Ex(Lit275, Lit24, Lit276, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit275, Lit277, "https://www.youtube.com/@RobotLk", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit275, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit275, Lit33, Lit278, Lit5);
    }

    static Object lambda85() {
        runtime.setAndCoerceProperty$Ex(Lit275, Lit24, Lit276, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit275, Lit277, "https://www.youtube.com/@RobotLk", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit275, Lit163, Boolean.FALSE, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit275, Lit33, Lit278, Lit5);
    }

    public Object BluetoothClient1$BluetoothError(Object $functionName, Object $message) {
        runtime.sanitizeComponentData($functionName);
        runtime.sanitizeComponentData($message);
        runtime.setThisForm();
        runtime.callComponentMethod(Lit65, Lit80, LList.Empty, LList.Empty);
        if (runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.getProperty$1(Lit65, Lit282)), Lit283, "not") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit76, Lit41, "Disconnected", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit44, Lit284, Lit5);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        if (runtime.getProperty$1(Lit65, Lit282) != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit76, Lit41, "Connected", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit76, Lit44, Lit290, Lit5);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.getProperty$1(Lit65, Lit282)), Lit291, "not") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit76, Lit41, "Disconnected", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit44, Lit292, Lit5);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (StopBlocksExecution e) {
                return false;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, lists.cons(componentObject, lists.cons(bool, LList.makeList(args, 0))));
            } catch (StopBlocksExecution e) {
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = lists.caddr.apply1(component$Mninfo);
                lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
