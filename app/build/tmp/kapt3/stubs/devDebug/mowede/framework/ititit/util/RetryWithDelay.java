package mowede.framework.ititit.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lmowede/framework/ititit/util/RetryWithDelay;", "Lio/reactivex/functions/Function;", "Lio/reactivex/Flowable;", "", "", "maxRetryCount", "", "retryDelay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(IJLjava/util/concurrent/TimeUnit;)V", "retryCount", "apply", "attempts", "app_devDebug"})
public final class RetryWithDelay implements io.reactivex.functions.Function<io.reactivex.Flowable<? extends java.lang.Throwable>, io.reactivex.Flowable<java.lang.Object>> {
    private int retryCount;
    private final int maxRetryCount = 0;
    private final long retryDelay = 0L;
    private final java.util.concurrent.TimeUnit timeUnit = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Object> apply(@org.jetbrains.annotations.NotNull()
    io.reactivex.Flowable<? extends java.lang.Throwable> attempts) {
        return null;
    }
    
    public RetryWithDelay(int maxRetryCount, long retryDelay, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        super();
    }
}