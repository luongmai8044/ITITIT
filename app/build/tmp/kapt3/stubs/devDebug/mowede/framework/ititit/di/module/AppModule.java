package mowede.framework.ititit.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0017\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0001\u00a2\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001\u00a2\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u001fH\u0001\u00a2\u0006\u0002\b J\r\u0010!\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b#J \u0010$\u001a\u00020%2\u0011\u0010&\u001a\r\u0012\t\u0012\u00070(\u00a2\u0006\u0002\b)0\'H\u0001\u00a2\u0006\u0002\b*J#\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\'2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\"H\u0001\u00a2\u0006\u0002\b/J\u0015\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b3J\u0015\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001\u00a2\u0006\u0002\b8J\u0017\u00109\u001a\u00020\u000b2\b\b\u0001\u0010:\u001a\u00020%H\u0001\u00a2\u0006\u0002\b;J\r\u0010<\u001a\u00020=H\u0001\u00a2\u0006\u0002\b>J\u0015\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0001\u00a2\u0006\u0002\bCJ\u0015\u0010D\u001a\u00020E2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001\u00a2\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020H2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001\u00a2\u0006\u0002\bIJ\u001f\u0010J\u001a\u00020K2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010L\u001a\u00020MH\u0001\u00a2\u0006\u0002\bNJ\r\u0010O\u001a\u00020%H\u0001\u00a2\u0006\u0002\bPJ\u0017\u0010Q\u001a\u00020\u000b2\b\b\u0001\u0010:\u001a\u00020%H\u0001\u00a2\u0006\u0002\bRJ\u0017\u0010S\u001a\u00020T2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\bUJ\u0015\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0001\u00a2\u0006\u0002\bZJ\r\u0010[\u001a\u00020MH\u0001\u00a2\u0006\u0002\b\\\u00a8\u0006]"}, d2 = {"Lmowede/framework/ititit/di/module/AppModule;", "", "()V", "provideAccountPreferences", "Lmowede/framework/ititit/datasource/preferences/AccountPreferences;", "accountPreferencesImpl", "Lmowede/framework/ititit/datasource/preferences/AccountPreferencesImpl;", "provideAccountPreferences$app_devDebug", "provideApiServiceHelper", "Lmowede/framework/ititit/datasource/remote/ApiServiceHelper;", "retrofit", "Lretrofit2/Retrofit;", "provideApiServiceHelper$app_devDebug", "provideAppDatabase", "Lmowede/framework/ititit/datasource/local/AppDatabase;", "context", "Landroid/content/Context;", "provideAppDatabase$app_devDebug", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideCompositeDisposable$app_devDebug", "provideContext", "application", "Lmowede/framework/ititit/ITITITApp;", "provideContext$app_devDebug", "provideDataRepository", "Lmowede/framework/ititit/repository/DataRepository;", "repository", "Lmowede/framework/ititit/repository/AppDataRepository;", "provideDataRepository$app_devDebug", "provideGson", "Lcom/google/gson/Gson;", "provideGson$app_devDebug", "provideHTTPLogInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideHTTPLogInterceptor$app_devDebug", "provideHttpClient", "Lokhttp3/OkHttpClient;", "interceptors", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideHttpClient$app_devDebug", "provideInterceptors", "authorizationInterceptor", "Lmowede/framework/ititit/datasource/remote/interceptor/AuthorizationInterceptor;", "httpLoggingInterceptor", "provideInterceptors$app_devDebug", "provideLocalDataHelper", "Lmowede/framework/ititit/datasource/local/LocalDataHelper;", "appDatabase", "provideLocalDataHelper$app_devDebug", "providePrefHelper", "Lmowede/framework/ititit/datasource/preferences/PreferenceHelper;", "appPreferenceHelper", "Lmowede/framework/ititit/datasource/preferences/AppPreferenceHelper;", "providePrefHelper$app_devDebug", "provideRetrofit", "httpClient", "provideRetrofit$app_devDebug", "provideSchedulerProvider", "Lmowede/framework/ititit/util/SchedulerProvider;", "provideSchedulerProvider$app_devDebug", "provideSession", "Lmowede/framework/ititit/usecases/Session;", "userSession", "Lmowede/framework/ititit/usecases/UserSession;", "provideSession$app_devDebug", "provideSessionExpiredChannel", "Lio/reactivex/Completable;", "provideSessionExpiredChannel$app_devDebug", "provideSessionExpiredListener", "Lmowede/framework/ititit/datasource/remote/interceptor/AuthorizationInterceptor$SessionExpiredListener;", "provideSessionExpiredListener$app_devDebug", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "prefName", "", "provideSharedPreferences$app_devDebug", "provideTokenHttpClient", "provideTokenHttpClient$app_devDebug", "provideTokenRetrofit", "provideTokenRetrofit$app_devDebug", "provideTokenServiceHelper", "Lmowede/framework/ititit/datasource/remote/TokenServiceHelper;", "provideTokenServiceHelper$app_devDebug", "provideUserManager", "Lmowede/framework/ititit/repository/UserManager;", "userManagerImpl", "Lmowede/framework/ititit/repository/UserManagerImpl;", "provideUserManager$app_devDebug", "provideprefFileName", "provideprefFileName$app_devDebug", "app_devDebug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ITITITApp application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences$app_devDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.PreferenceInfo()
    java.lang.String prefName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.datasource.local.AppDatabase provideAppDatabase$app_devDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.PreferenceInfo()
    @dagger.Provides()
    public final java.lang.String provideprefFileName$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.datasource.preferences.PreferenceHelper providePrefHelper$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.preferences.AppPreferenceHelper appPreferenceHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.datasource.preferences.AccountPreferences provideAccountPreferences$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.preferences.AccountPreferencesImpl accountPreferencesImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.repository.UserManager provideUserManager$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.repository.UserManagerImpl userManagerImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final mowede.framework.ititit.util.SchedulerProvider provideSchedulerProvider$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.datasource.remote.ApiServiceHelper provideApiServiceHelper$app_devDebug(@org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.APIRetrofit()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.datasource.remote.TokenServiceHelper provideTokenServiceHelper$app_devDebug(@org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.TokenRetrofit()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.datasource.local.LocalDataHelper provideLocalDataHelper$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.local.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.APIRetrofit()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit$app_devDebug(@org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.APIOkHttpClient()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.TokenRetrofit()
    @dagger.Provides()
    public final retrofit2.Retrofit provideTokenRetrofit$app_devDebug(@org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.TokenOkHttpClient()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.util.List<okhttp3.Interceptor> provideInterceptors$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor authorizationInterceptor, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideHTTPLogInterceptor$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.APIOkHttpClient()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideHttpClient$app_devDebug(@org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Interceptor> interceptors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.TokenOkHttpClient()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideTokenHttpClient$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.repository.DataRepository provideDataRepository$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.repository.AppDataRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.usecases.Session provideSession$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.usecases.UserSession userSession) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.SessionExpiredChannel()
    @dagger.Provides()
    public final io.reactivex.Completable provideSessionExpiredChannel$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ITITITApp application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor.SessionExpiredListener provideSessionExpiredListener$app_devDebug(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ITITITApp application) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}