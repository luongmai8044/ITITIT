package mowede.framework.ititit.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u0010\nJ?\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u000b\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lmowede/framework/ititit/usecases/SingleInteractor;", "Input", "Output", "", "schedulerProvider", "Lmowede/framework/ititit/util/SchedulerProvider;", "(Lmowede/framework/ititit/util/SchedulerProvider;)V", "createSingle", "Lio/reactivex/Single;", "data", "(Ljava/lang/Object;)Lio/reactivex/Single;", "execute", "Lio/reactivex/disposables/Disposable;", "onSuccess", "Lkotlin/Function1;", "", "onError", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/disposables/Disposable;", "subscribe", "Lio/reactivex/SingleObserver;", "(Lio/reactivex/SingleObserver;Ljava/lang/Object;)Lio/reactivex/disposables/Disposable;", "app_devDebug"})
public abstract class SingleInteractor<Input extends java.lang.Object, Output extends java.lang.Object> {
    private final mowede.framework.ititit.util.SchedulerProvider schedulerProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super Output, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, @org.jetbrains.annotations.Nullable()
    Input data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable execute(@org.jetbrains.annotations.NotNull()
    io.reactivex.SingleObserver<Output> subscribe, @org.jetbrains.annotations.Nullable()
    Input data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract io.reactivex.Single<Output> createSingle(@org.jetbrains.annotations.Nullable()
    Input data);
    
    public SingleInteractor(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.util.SchedulerProvider schedulerProvider) {
        super();
    }
}