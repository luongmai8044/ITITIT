package mowede.framework.ititit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lmowede/framework/ititit/ITITITApp;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "Lmowede/framework/ititit/datasource/remote/interceptor/AuthorizationInterceptor$SessionExpiredListener;", "()V", "activityDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityDispatchingAndroidInjector$app_devDebug", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityDispatchingAndroidInjector$app_devDebug", "(Ldagger/android/DispatchingAndroidInjector;)V", "sessionExpiredChannel", "Lio/reactivex/Completable;", "getSessionExpiredChannel", "()Lio/reactivex/Completable;", "sessionExpiredEmitter", "Lio/reactivex/CompletableEmitter;", "activityInjector", "onCreate", "", "onSessionExpired", "app_devDebug"})
public final class ITITITApp extends android.app.Application implements dagger.android.HasActivityInjector, mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor.SessionExpiredListener {
    private io.reactivex.CompletableEmitter sessionExpiredEmitter;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Completable sessionExpiredChannel = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityDispatchingAndroidInjector;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable getSessionExpiredChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityDispatchingAndroidInjector$app_devDebug() {
        return null;
    }
    
    public final void setActivityDispatchingAndroidInjector$app_devDebug(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onSessionExpired() {
    }
    
    public ITITITApp() {
        super();
    }
}