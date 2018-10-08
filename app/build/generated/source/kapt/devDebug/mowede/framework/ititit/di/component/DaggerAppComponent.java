// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package mowede.framework.ititit.di.component;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import mowede.framework.ititit.ITITITApp;
import mowede.framework.ititit.ITITITApp_MembersInjector;
import mowede.framework.ititit.datasource.local.AppDatabase;
import mowede.framework.ititit.datasource.local.LocalDataHelper;
import mowede.framework.ititit.datasource.preferences.AccountPreferences;
import mowede.framework.ititit.datasource.preferences.AccountPreferencesImpl;
import mowede.framework.ititit.datasource.preferences.AccountPreferencesImpl_Factory;
import mowede.framework.ititit.datasource.preferences.AppPreferenceHelper;
import mowede.framework.ititit.datasource.preferences.AppPreferenceHelper_Factory;
import mowede.framework.ititit.datasource.preferences.PreferenceHelper;
import mowede.framework.ititit.datasource.remote.ApiServiceHelper;
import mowede.framework.ititit.datasource.remote.TokenServiceHelper;
import mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor;
import mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor_Factory;
import mowede.framework.ititit.di.builder.ActivityBuilder_BindLoginActivity;
import mowede.framework.ititit.di.builder.ActivityBuilder_BindSplashActivity;
import mowede.framework.ititit.di.module.AppModule;
import mowede.framework.ititit.di.module.AppModule_ProvideAccountPreferences$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideApiServiceHelper$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideAppDatabase$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideCompositeDisposable$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideContext$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideDataRepository$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideHTTPLogInterceptor$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideHttpClient$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideInterceptors$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideLocalDataHelper$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvidePrefHelper$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideRetrofit$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideSchedulerProvider$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideSession$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideSessionExpiredChannel$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideSessionExpiredListener$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideSharedPreferences$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideTokenHttpClient$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideTokenRetrofit$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideTokenServiceHelper$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideUserManager$app_devDebugFactory;
import mowede.framework.ititit.di.module.AppModule_ProvideprefFileName$app_devDebugFactory;
import mowede.framework.ititit.repository.AppDataRepository;
import mowede.framework.ititit.repository.AppDataRepository_Factory;
import mowede.framework.ititit.repository.DataRepository;
import mowede.framework.ititit.repository.UserManager;
import mowede.framework.ititit.repository.UserManagerImpl;
import mowede.framework.ititit.repository.UserManagerImpl_Factory;
import mowede.framework.ititit.ui.login.LoginActivityModule;
import mowede.framework.ititit.ui.login.LoginActivityModule_ProvideLoginPresenter$app_devDebugFactory;
import mowede.framework.ititit.ui.login.interactor.ServerLoginInteractor;
import mowede.framework.ititit.ui.login.interactor.ServerLoginInteractor_Factory;
import mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor;
import mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor_Factory;
import mowede.framework.ititit.ui.login.presenter.LoginMVPPresenter;
import mowede.framework.ititit.ui.login.presenter.LoginPresenter;
import mowede.framework.ititit.ui.login.presenter.LoginPresenter_Factory;
import mowede.framework.ititit.ui.login.view.LoginActivity;
import mowede.framework.ititit.ui.login.view.LoginActivity_MembersInjector;
import mowede.framework.ititit.ui.splash.SplashActivityModule;
import mowede.framework.ititit.ui.splash.SplashActivityModule_ProvideSplashPresenter$app_devDebugFactory;
import mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter;
import mowede.framework.ititit.ui.splash.presenter.SplashPresenter;
import mowede.framework.ititit.ui.splash.presenter.SplashPresenter_Factory;
import mowede.framework.ititit.ui.splash.view.SplashMVPActivity;
import mowede.framework.ititit.ui.splash.view.SplashMVPActivity_MembersInjector;
import mowede.framework.ititit.usecases.Session;
import mowede.framework.ititit.usecases.UserSession;
import mowede.framework.ititit.usecases.UserSession_Factory;
import mowede.framework.ititit.util.SchedulerProvider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuilder_BindSplashActivity.SplashMVPActivitySubcomponent.Builder>
      splashMVPActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider;

  private Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider2;

  private Provider<
          Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>>
      mapOfClassOfAndProviderOfFactoryOfProvider;

  private Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  private MembersInjector<ITITITApp> iTITITAppMembersInjector;

  private Provider<ITITITApp> applicationProvider;

  private Provider<Completable> provideSessionExpiredChannel$app_devDebugProvider;

  private Provider<CompositeDisposable> provideCompositeDisposable$app_devDebugProvider;

  private Provider<Context> provideContext$app_devDebugProvider;

  private Provider<String> provideprefFileName$app_devDebugProvider;

  private Provider<SharedPreferences> provideSharedPreferences$app_devDebugProvider;

  private Provider<AccountPreferencesImpl> accountPreferencesImplProvider;

  private Provider<AccountPreferences> provideAccountPreferences$app_devDebugProvider;

  private Provider<UserManagerImpl> userManagerImplProvider;

  private Provider<UserManager> provideUserManager$app_devDebugProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider$app_devDebugProvider;

  private Provider<AppPreferenceHelper> appPreferenceHelperProvider;

  private Provider<PreferenceHelper> providePrefHelper$app_devDebugProvider;

  private Provider<UserSession> userSessionProvider;

  private Provider<Session> provideSession$app_devDebugProvider;

  private Provider<OkHttpClient> provideTokenHttpClient$app_devDebugProvider;

  private Provider<Retrofit> provideTokenRetrofit$app_devDebugProvider;

  private Provider<TokenServiceHelper> provideTokenServiceHelper$app_devDebugProvider;

  private Provider<AuthorizationInterceptor.SessionExpiredListener>
      provideSessionExpiredListener$app_devDebugProvider;

  private Provider<AuthorizationInterceptor> authorizationInterceptorProvider;

  private Provider<HttpLoggingInterceptor> provideHTTPLogInterceptor$app_devDebugProvider;

  private Provider<List<Interceptor>> provideInterceptors$app_devDebugProvider;

  private Provider<OkHttpClient> provideHttpClient$app_devDebugProvider;

  private Provider<Retrofit> provideRetrofit$app_devDebugProvider;

  private Provider<ApiServiceHelper> provideApiServiceHelper$app_devDebugProvider;

  private Provider<AppDatabase> provideAppDatabase$app_devDebugProvider;

  private Provider<LocalDataHelper> provideLocalDataHelper$app_devDebugProvider;

  private Provider<AppDataRepository> appDataRepositoryProvider;

  private Provider<DataRepository> provideDataRepository$app_devDebugProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.splashMVPActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityBuilder_BindSplashActivity.SplashMVPActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindSplashActivity.SplashMVPActivitySubcomponent.Builder get() {
            return new SplashMVPActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider =
        (Provider) splashMVPActivitySubcomponentBuilderProvider;

    this.loginActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider2 = (Provider) loginActivitySubcomponentBuilderProvider;

    this.mapOfClassOfAndProviderOfFactoryOfProvider =
        MapProviderFactory
            .<Class<? extends Activity>, AndroidInjector.Factory<? extends Activity>>builder(2)
            .put(SplashMVPActivity.class, bindAndroidInjectorFactoryProvider)
            .put(LoginActivity.class, bindAndroidInjectorFactoryProvider2)
            .build();

    this.dispatchingAndroidInjectorProvider =
        DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

    this.iTITITAppMembersInjector =
        ITITITApp_MembersInjector.create(dispatchingAndroidInjectorProvider);

    this.applicationProvider = InstanceFactory.create(builder.application);

    this.provideSessionExpiredChannel$app_devDebugProvider =
        AppModule_ProvideSessionExpiredChannel$app_devDebugFactory.create(
            builder.appModule, applicationProvider);

    this.provideCompositeDisposable$app_devDebugProvider =
        AppModule_ProvideCompositeDisposable$app_devDebugFactory.create(builder.appModule);

    this.provideContext$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideContext$app_devDebugFactory.create(
                builder.appModule, applicationProvider));

    this.provideprefFileName$app_devDebugProvider =
        AppModule_ProvideprefFileName$app_devDebugFactory.create(builder.appModule);

    this.provideSharedPreferences$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideSharedPreferences$app_devDebugFactory.create(
                builder.appModule,
                provideContext$app_devDebugProvider,
                provideprefFileName$app_devDebugProvider));

    this.accountPreferencesImplProvider =
        AccountPreferencesImpl_Factory.create(provideSharedPreferences$app_devDebugProvider);

    this.provideAccountPreferences$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideAccountPreferences$app_devDebugFactory.create(
                builder.appModule, accountPreferencesImplProvider));

    this.userManagerImplProvider =
        UserManagerImpl_Factory.create(provideAccountPreferences$app_devDebugProvider);

    this.provideUserManager$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideUserManager$app_devDebugFactory.create(
                builder.appModule, userManagerImplProvider));

    this.provideSchedulerProvider$app_devDebugProvider =
        AppModule_ProvideSchedulerProvider$app_devDebugFactory.create(builder.appModule);

    this.appPreferenceHelperProvider =
        AppPreferenceHelper_Factory.create(
            provideContext$app_devDebugProvider, provideprefFileName$app_devDebugProvider);

    this.providePrefHelper$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvidePrefHelper$app_devDebugFactory.create(
                builder.appModule, appPreferenceHelperProvider));

    this.userSessionProvider = UserSession_Factory.create(providePrefHelper$app_devDebugProvider);

    this.provideSession$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideSession$app_devDebugFactory.create(
                builder.appModule, userSessionProvider));

    this.provideTokenHttpClient$app_devDebugProvider =
        AppModule_ProvideTokenHttpClient$app_devDebugFactory.create(builder.appModule);

    this.provideTokenRetrofit$app_devDebugProvider =
        AppModule_ProvideTokenRetrofit$app_devDebugFactory.create(
            builder.appModule, provideTokenHttpClient$app_devDebugProvider);

    this.provideTokenServiceHelper$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideTokenServiceHelper$app_devDebugFactory.create(
                builder.appModule, provideTokenRetrofit$app_devDebugProvider));

    this.provideSessionExpiredListener$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideSessionExpiredListener$app_devDebugFactory.create(
                builder.appModule, applicationProvider));

    this.authorizationInterceptorProvider =
        DoubleCheck.provider(
            AuthorizationInterceptor_Factory.create(
                provideSession$app_devDebugProvider,
                provideTokenServiceHelper$app_devDebugProvider,
                provideSessionExpiredListener$app_devDebugProvider));

    this.provideHTTPLogInterceptor$app_devDebugProvider =
        AppModule_ProvideHTTPLogInterceptor$app_devDebugFactory.create(builder.appModule);

    this.provideInterceptors$app_devDebugProvider =
        AppModule_ProvideInterceptors$app_devDebugFactory.create(
            builder.appModule,
            authorizationInterceptorProvider,
            provideHTTPLogInterceptor$app_devDebugProvider);

    this.provideHttpClient$app_devDebugProvider =
        AppModule_ProvideHttpClient$app_devDebugFactory.create(
            builder.appModule, provideInterceptors$app_devDebugProvider);

    this.provideRetrofit$app_devDebugProvider =
        AppModule_ProvideRetrofit$app_devDebugFactory.create(
            builder.appModule, provideHttpClient$app_devDebugProvider);

    this.provideApiServiceHelper$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideApiServiceHelper$app_devDebugFactory.create(
                builder.appModule, provideRetrofit$app_devDebugProvider));

    this.provideAppDatabase$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideAppDatabase$app_devDebugFactory.create(
                builder.appModule, provideContext$app_devDebugProvider));

    this.provideLocalDataHelper$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideLocalDataHelper$app_devDebugFactory.create(
                builder.appModule, provideAppDatabase$app_devDebugProvider));

    this.appDataRepositoryProvider =
        AppDataRepository_Factory.create(
            provideApiServiceHelper$app_devDebugProvider,
            providePrefHelper$app_devDebugProvider,
            provideLocalDataHelper$app_devDebugProvider);

    this.provideDataRepository$app_devDebugProvider =
        DoubleCheck.provider(
            AppModule_ProvideDataRepository$app_devDebugFactory.create(
                builder.appModule, appDataRepositoryProvider));
  }

  @Override
  public void inject(ITITITApp app) {
    iTITITAppMembersInjector.injectMembers(app);
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private ITITITApp application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(ITITITApp.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(ITITITApp application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class SplashMVPActivitySubcomponentBuilder
      extends ActivityBuilder_BindSplashActivity.SplashMVPActivitySubcomponent.Builder {
    private SplashActivityModule splashActivityModule;

    private SplashMVPActivity seedInstance;

    @Override
    public ActivityBuilder_BindSplashActivity.SplashMVPActivitySubcomponent build() {
      if (splashActivityModule == null) {
        this.splashActivityModule = new SplashActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(
            SplashMVPActivity.class.getCanonicalName() + " must be set");
      }
      return new SplashMVPActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SplashMVPActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SplashMVPActivitySubcomponentImpl
      implements ActivityBuilder_BindSplashActivity.SplashMVPActivitySubcomponent {
    private Provider<SplashPresenter> splashPresenterProvider;

    private Provider<SplashMVPPresenter> provideSplashPresenter$app_devDebugProvider;

    private MembersInjector<SplashMVPActivity> splashMVPActivityMembersInjector;

    private SplashMVPActivitySubcomponentImpl(SplashMVPActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SplashMVPActivitySubcomponentBuilder builder) {

      this.splashPresenterProvider =
          SplashPresenter_Factory.create(
              MembersInjectors.<SplashPresenter>noOp(),
              DaggerAppComponent.this.provideUserManager$app_devDebugProvider,
              DaggerAppComponent.this.provideCompositeDisposable$app_devDebugProvider);

      this.provideSplashPresenter$app_devDebugProvider =
          SplashActivityModule_ProvideSplashPresenter$app_devDebugFactory.create(
              builder.splashActivityModule, splashPresenterProvider);

      this.splashMVPActivityMembersInjector =
          SplashMVPActivity_MembersInjector.create(
              DaggerAppComponent.this.provideSessionExpiredChannel$app_devDebugProvider,
              DaggerAppComponent.this.provideCompositeDisposable$app_devDebugProvider,
              provideSplashPresenter$app_devDebugProvider);
    }

    @Override
    public void inject(SplashMVPActivity arg0) {
      splashMVPActivityMembersInjector.injectMembers(arg0);
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder {
    private LoginActivityModule loginActivityModule;

    private LoginActivity seedInstance;

    @Override
    public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent build() {
      if (loginActivityModule == null) {
        this.loginActivityModule = new LoginActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(LoginActivity.class.getCanonicalName() + " must be set");
      }
      return new LoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent {
    private Provider<ServerLoginInteractor> serverLoginInteractorProvider;

    private Provider<SocialLoginInteractor> socialLoginInteractorProvider;

    private Provider<LoginPresenter> loginPresenterProvider;

    private Provider<LoginMVPPresenter> provideLoginPresenter$app_devDebugProvider;

    private MembersInjector<LoginActivity> loginActivityMembersInjector;

    private LoginActivitySubcomponentImpl(LoginActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoginActivitySubcomponentBuilder builder) {

      this.serverLoginInteractorProvider =
          ServerLoginInteractor_Factory.create(
              MembersInjectors.<ServerLoginInteractor>noOp(),
              DaggerAppComponent.this.provideSchedulerProvider$app_devDebugProvider,
              DaggerAppComponent.this.provideDataRepository$app_devDebugProvider);

      this.socialLoginInteractorProvider =
          SocialLoginInteractor_Factory.create(
              DaggerAppComponent.this.provideSchedulerProvider$app_devDebugProvider,
              DaggerAppComponent.this.provideDataRepository$app_devDebugProvider);

      this.loginPresenterProvider =
          LoginPresenter_Factory.create(
              MembersInjectors.<LoginPresenter>noOp(),
              DaggerAppComponent.this.provideCompositeDisposable$app_devDebugProvider,
              serverLoginInteractorProvider,
              socialLoginInteractorProvider);

      this.provideLoginPresenter$app_devDebugProvider =
          LoginActivityModule_ProvideLoginPresenter$app_devDebugFactory.create(
              builder.loginActivityModule, loginPresenterProvider);

      this.loginActivityMembersInjector =
          LoginActivity_MembersInjector.create(
              DaggerAppComponent.this.provideSessionExpiredChannel$app_devDebugProvider,
              DaggerAppComponent.this.provideCompositeDisposable$app_devDebugProvider,
              provideLoginPresenter$app_devDebugProvider);
    }

    @Override
    public void inject(LoginActivity arg0) {
      loginActivityMembersInjector.injectMembers(arg0);
    }
  }
}
