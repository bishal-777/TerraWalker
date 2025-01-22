package com.google.appinventor.components.runtime.util;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.appinventor.components.common.FileScope;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Form;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

public class FileWriteOperation extends FileStreamOperation<OutputStream> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileWriteOperation(Form form, Component component, String method, String fileName, FileScope scope, boolean append, boolean async) {
        super(form, component, method, fileName, scope, append ? FileAccessMode.APPEND : FileAccessMode.WRITE, async);
        if (fileName.startsWith("//")) {
            throw new IllegalArgumentException("Cannot perform a write operation on an asset");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileWriteOperation(Form form, Component component, String method, ScopedFile file, boolean append, boolean async) {
        super(form, component, method, file, append ? FileAccessMode.APPEND : FileAccessMode.WRITE, async);
        if (file.getScope() == FileScope.Asset) {
            throw new IllegalArgumentException("Cannot perform a write operation on an asset");
        }
    }

    /* access modifiers changed from: protected */
    public boolean process(OutputStream stream) throws IOException {
        return true;
    }

    /* access modifiers changed from: protected */
    public OutputStream openFile() throws IOException {
        String str;
        if (this.fileName.startsWith("content:")) {
            ContentResolver contentResolver = this.form.getContentResolver();
            Uri parse = Uri.parse(this.fileName);
            if (this.accessMode == FileAccessMode.WRITE) {
                str = "wt";
            } else {
                str = "wa";
            }
            return contentResolver.openOutputStream(parse, str);
        }
        String path = FileUtil.resolveFileName(this.form, this.fileName, this.scope);
        if (path.startsWith("file://")) {
            path = URI.create(path).getPath();
        } else if (path.startsWith("file:")) {
            path = URI.create(path).getPath();
        }
        File file = new File(path);
        IOUtils.mkdirs(file);
        return new FileOutputStream(file, FileAccessMode.APPEND.equals(this.accessMode));
    }
}
