package mowede.framework.ititit.util.timber;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lmowede/framework/ititit/util/timber/FileLoggingTree;", "Ltimber/log/Timber$DebugTree;", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "createStackElementTag", "element", "Ljava/lang/StackTraceElement;", "generateFile", "Ljava/io/File;", "path", "fileName", "isExternalStorageAvailable", "", "log", "", "priority", "", "tag", "message", "t", "", "app_devDebug"})
public final class FileLoggingTree extends timber.log.Timber.DebugTree {
    private final java.lang.String LOG_TAG = null;
    
    @java.lang.Override()
    protected void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    private final java.io.File generateFile(java.lang.String path, java.lang.String fileName) {
        return null;
    }
    
    private final boolean isExternalStorageAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String createStackElementTag(@org.jetbrains.annotations.NotNull()
    java.lang.StackTraceElement element) {
        return null;
    }
    
    public FileLoggingTree() {
        super();
    }
}