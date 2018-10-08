package mowede.framework.ititit.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u0010\tJ9\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lmowede/framework/ititit/usecases/CompletableInteractor;", "Input", "", "schedulerProvider", "Lmowede/framework/ititit/util/SchedulerProvider;", "(Lmowede/framework/ititit/util/SchedulerProvider;)V", "createCompletable", "Lio/reactivex/Completable;", "data", "(Ljava/lang/Object;)Lio/reactivex/Completable;", "execute", "Lio/reactivex/disposables/Disposable;", "onComplete", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/disposables/Disposable;", "subscribe", "Lio/reactivex/CompletableObserver;", "(Lio/reactivex/CompletableObserver;Ljava/lang/Object;)Lio/reactivex/disposables/Disposable;", "app_devDebug"})
public abstract class CompletableInteractor<Input extends java.lang.Object> {
    private final mowede.framework.ititit.util.SchedulerProvider schedulerProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, @org.jetbrains.annotations.Nullable()
    Input data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable execute(@org.jetbrains.annotations.NotNull()
    io.reactivex.CompletableObserver subscribe, @org.jetbrains.annotations.Nullable()
    Input data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract io.reactivex.Completable createCompletable(@org.jetbrains.annotations.Nullable()
    Input data);
    
    public CompletableInteractor(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.util.SchedulerProvider schedulerProvider) {
        super();
    }
}