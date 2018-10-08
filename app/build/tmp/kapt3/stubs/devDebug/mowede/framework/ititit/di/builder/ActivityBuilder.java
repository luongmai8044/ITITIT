package mowede.framework.ititit.di.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lmowede/framework/ititit/di/builder/ActivityBuilder;", "", "()V", "bindLoginActivity", "Lmowede/framework/ititit/ui/login/view/LoginActivity;", "bindSplashActivity", "Lmowede/framework/ititit/ui/splash/view/SplashMVPActivity;", "app_devDebug"})
@dagger.Module()
public abstract class ActivityBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {mowede.framework.ititit.ui.splash.SplashActivityModule.class})
    public abstract mowede.framework.ititit.ui.splash.view.SplashMVPActivity bindSplashActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {mowede.framework.ititit.ui.login.LoginActivityModule.class})
    public abstract mowede.framework.ititit.ui.login.view.LoginActivity bindLoginActivity();
    
    public ActivityBuilder() {
        super();
    }
}