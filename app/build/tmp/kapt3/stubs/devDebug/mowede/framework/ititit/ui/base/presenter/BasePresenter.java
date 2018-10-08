package mowede.framework.ititit.ui.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J8\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0004JF\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\u0004\b\u0001\u0010\u001d2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u00020\u00170\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0019H\u0004J\u0015\u0010\u001f\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0011J\b\u0010 \u001a\u00020\u0017H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR*\u0010\r\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006!"}, d2 = {"Lmowede/framework/ititit/ui/base/presenter/BasePresenter;", "V", "Lmowede/framework/ititit/ui/base/view/MVPView;", "Lmowede/framework/ititit/ui/base/presenter/MVPPresenter;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lio/reactivex/disposables/CompositeDisposable;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "isViewAttached", "", "()Z", "<set-?>", "view", "getView", "()Lmowede/framework/ititit/ui/base/view/MVPView;", "setView", "(Lmowede/framework/ititit/ui/base/view/MVPView;)V", "Lmowede/framework/ititit/ui/base/view/MVPView;", "makeCompletableSubscriber", "Lio/reactivex/CompletableObserver;", "onComplete", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "", "makeSingleSubscriber", "Lio/reactivex/SingleObserver;", "T", "onSuccess", "onAttach", "onDetach", "app_devDebug"})
public abstract class BasePresenter<V extends mowede.framework.ititit.ui.base.view.MVPView> implements mowede.framework.ititit.ui.base.presenter.MVPPresenter<V> {
    @org.jetbrains.annotations.Nullable()
    private V view;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.Nullable()
    public final V getView() {
        return null;
    }
    
    private final void setView(V p0) {
    }
    
    private final boolean isViewAttached() {
        return false;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    V view) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    /**
     * * create a subscriber for a SingleObservable
     *     * @param onSuccess: Action on success
     *     * @param onError: Action on error, return false if no need handle general exceptions, otherwise return true
     *     * @return a SingleObserver
     */
    @org.jetbrains.annotations.NotNull()
    protected final <T extends java.lang.Object>io.reactivex.SingleObserver<T> makeSingleSubscriber(@org.jetbrains.annotations.Nullable()
    mowede.framework.ititit.ui.base.view.MVPView view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> onError) {
        return null;
    }
    
    /**
     * * create a subscriber for a Completable
     *     * @param onComplete: Action on success
     *     * @param onError: Action on error, return false if no need handle general exceptions, otherwise return true
     *     * @return a SingleObserver
     */
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.CompletableObserver makeCompletableSubscriber(@org.jetbrains.annotations.Nullable()
    mowede.framework.ititit.ui.base.view.MVPView view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> onError) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public BasePresenter(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}