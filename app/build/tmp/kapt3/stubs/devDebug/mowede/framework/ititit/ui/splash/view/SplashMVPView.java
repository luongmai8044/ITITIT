package mowede.framework.ititit.ui.splash.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lmowede/framework/ititit/ui/splash/view/SplashMVPView;", "Lmowede/framework/ititit/ui/base/view/MVPView;", "openLoginActivity", "", "openMainActivity", "showErrorToast", "showSuccessToast", "app_devDebug"})
public abstract interface SplashMVPView extends mowede.framework.ititit.ui.base.view.MVPView {
    
    public abstract void showSuccessToast();
    
    public abstract void showErrorToast();
    
    public abstract void openMainActivity();
    
    public abstract void openLoginActivity();
}