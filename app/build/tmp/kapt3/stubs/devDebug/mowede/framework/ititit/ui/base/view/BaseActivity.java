package mowede.framework.ititit.ui.base.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lmowede/framework/ititit/ui/base/view/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lmowede/framework/ititit/ui/base/view/MVPView;", "Lmowede/framework/ititit/ui/base/view/BaseFragment$CallBack;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "sessionExpiredChannel", "Lio/reactivex/Completable;", "getSessionExpiredChannel", "()Lio/reactivex/Completable;", "setSessionExpiredChannel", "(Lio/reactivex/Completable;)V", "hideProgress", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "performDI", "showError", "error", "", "showProgress", "app_devDebug"})
public abstract class BaseActivity extends android.support.v7.app.AppCompatActivity implements mowede.framework.ititit.ui.base.view.MVPView, mowede.framework.ititit.ui.base.view.BaseFragment.CallBack {
    @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.SessionExpiredChannel()
    @javax.inject.Inject()
    public io.reactivex.Completable sessionExpiredChannel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable getSessionExpiredChannel() {
        return null;
    }
    
    public final void setSessionExpiredChannel(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void setCompositeDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    private final void performDI() {
    }
    
    public BaseActivity() {
        super();
    }
}