package ru.spb.speech.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/spb/speech/database/DBWorkerThread;", "Landroid/os/HandlerThread;", "threadName", "", "(Ljava/lang/String;)V", "mWorkerHandler", "Landroid/os/Handler;", "onLooperPrepared", "", "postTask", "task", "Ljava/lang/Runnable;", "app_debug"})
public final class DBWorkerThread extends android.os.HandlerThread {
    private android.os.Handler mWorkerHandler;
    
    @java.lang.Override()
    protected void onLooperPrepared() {
    }
    
    public final void postTask(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable task) {
    }
    
    public DBWorkerThread(@org.jetbrains.annotations.NotNull()
    java.lang.String threadName) {
        super(null);
    }
}