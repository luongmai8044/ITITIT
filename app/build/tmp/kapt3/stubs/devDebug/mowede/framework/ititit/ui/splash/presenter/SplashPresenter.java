package mowede.framework.ititit.ui.splash.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lmowede/framework/ititit/ui/splash/presenter/SplashPresenter;", "Lmowede/framework/ititit/ui/base/presenter/BasePresenter;", "Lmowede/framework/ititit/ui/splash/view/SplashMVPView;", "Lmowede/framework/ititit/ui/splash/presenter/SplashMVPPresenter;", "userManager", "Lmowede/framework/ititit/repository/UserManager;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lmowede/framework/ititit/repository/UserManager;Lio/reactivex/disposables/CompositeDisposable;)V", "decideActivityToOpen", "", "()Lkotlin/Unit;", "isUserLoggedIn", "", "onAttach", "view", "app_devDebug"})
public final class SplashPresenter extends mowede.framework.ititit.ui.base.presenter.BasePresenter<mowede.framework.ititit.ui.splash.view.SplashMVPView> implements mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter {
    private final mowede.framework.ititit.repository.UserManager userManager = null;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ui.splash.view.SplashMVPView view) {
    }
    
    private final kotlin.Unit decideActivityToOpen() {
        return null;
    }
    
    private final boolean isUserLoggedIn() {
        return false;
    }
    
    @javax.inject.Inject()
    public SplashPresenter(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.repository.UserManager userManager, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null);
    }
}