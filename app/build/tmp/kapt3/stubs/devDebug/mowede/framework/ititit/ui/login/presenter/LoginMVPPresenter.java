package mowede.framework.ititit.ui.login.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lmowede/framework/ititit/ui/login/presenter/LoginMVPPresenter;", "Lmowede/framework/ititit/ui/base/presenter/MVPPresenter;", "Lmowede/framework/ititit/ui/login/view/LoginMVPView;", "onFBLoginClicked", "", "onGoogleLoginClicked", "onServerLoginClicked", "email", "", "password", "app_devDebug"})
public abstract interface LoginMVPPresenter extends mowede.framework.ititit.ui.base.presenter.MVPPresenter<mowede.framework.ititit.ui.login.view.LoginMVPView> {
    
    public abstract void onServerLoginClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void onFBLoginClicked();
    
    public abstract void onGoogleLoginClicked();
}