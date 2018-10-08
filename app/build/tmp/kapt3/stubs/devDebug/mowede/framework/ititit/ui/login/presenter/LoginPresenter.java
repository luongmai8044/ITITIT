package mowede.framework.ititit.ui.login.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lmowede/framework/ititit/ui/login/presenter/LoginPresenter;", "Lmowede/framework/ititit/ui/base/presenter/BasePresenter;", "Lmowede/framework/ititit/ui/login/view/LoginMVPView;", "Lmowede/framework/ititit/ui/login/presenter/LoginMVPPresenter;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "serverLoginInteractor", "Lmowede/framework/ititit/ui/login/interactor/ServerLoginInteractor;", "socialLoginInteractor", "Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor;", "(Lio/reactivex/disposables/CompositeDisposable;Lmowede/framework/ititit/ui/login/interactor/ServerLoginInteractor;Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor;)V", "serverLoginSubscriber", "Lio/reactivex/SingleObserver;", "Lmowede/framework/ititit/repository/model/User;", "getServerLoginSubscriber", "()Lio/reactivex/SingleObserver;", "serverLoginSubscriber$delegate", "Lkotlin/Lazy;", "onFBLoginClicked", "", "onGoogleLoginClicked", "onServerLoginClicked", "email", "", "password", "app_devDebug"})
public final class LoginPresenter extends mowede.framework.ititit.ui.base.presenter.BasePresenter<mowede.framework.ititit.ui.login.view.LoginMVPView> implements mowede.framework.ititit.ui.login.presenter.LoginMVPPresenter {
    private final kotlin.Lazy serverLoginSubscriber$delegate = null;
    private final mowede.framework.ititit.ui.login.interactor.ServerLoginInteractor serverLoginInteractor = null;
    private final mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor socialLoginInteractor = null;
    
    @java.lang.Override()
    public void onServerLoginClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @java.lang.Override()
    public void onFBLoginClicked() {
    }
    
    @java.lang.Override()
    public void onGoogleLoginClicked() {
    }
    
    private final io.reactivex.SingleObserver<mowede.framework.ititit.repository.model.User> getServerLoginSubscriber() {
        return null;
    }
    
    @javax.inject.Inject()
    public LoginPresenter(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ui.login.interactor.ServerLoginInteractor serverLoginInteractor, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor socialLoginInteractor) {
        super(null);
    }
}