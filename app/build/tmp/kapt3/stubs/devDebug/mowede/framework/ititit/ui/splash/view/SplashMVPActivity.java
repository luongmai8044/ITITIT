package mowede.framework.ititit.ui.splash.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lmowede/framework/ititit/ui/splash/view/SplashMVPActivity;", "Lmowede/framework/ititit/ui/base/view/BaseActivity;", "Lmowede/framework/ititit/ui/splash/view/SplashMVPView;", "()V", "presenter", "Lmowede/framework/ititit/ui/splash/presenter/SplashMVPPresenter;", "getPresenter", "()Lmowede/framework/ititit/ui/splash/presenter/SplashMVPPresenter;", "setPresenter", "(Lmowede/framework/ititit/ui/splash/presenter/SplashMVPPresenter;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFragmentAttached", "onFragmentDetached", "tag", "", "openLoginActivity", "openMainActivity", "showErrorToast", "showSuccessToast", "app_devDebug"})
public final class SplashMVPActivity extends mowede.framework.ititit.ui.base.view.BaseActivity implements mowede.framework.ititit.ui.splash.view.SplashMVPView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onFragmentDetached(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onFragmentAttached() {
    }
    
    @java.lang.Override()
    public void showSuccessToast() {
    }
    
    @java.lang.Override()
    public void showErrorToast() {
    }
    
    @java.lang.Override()
    public void openMainActivity() {
    }
    
    @java.lang.Override()
    public void openLoginActivity() {
    }
    
    public SplashMVPActivity() {
        super();
    }
}