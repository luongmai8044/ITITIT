// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package mowede.framework.ititit.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.inject.Provider;
import mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

public final class AppModule_ProvideInterceptors$app_devDebugFactory
    implements Factory<List<Interceptor>> {
  private final AppModule module;

  private final Provider<AuthorizationInterceptor> authorizationInterceptorProvider;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public AppModule_ProvideInterceptors$app_devDebugFactory(
      AppModule module,
      Provider<AuthorizationInterceptor> authorizationInterceptorProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    assert module != null;
    this.module = module;
    assert authorizationInterceptorProvider != null;
    this.authorizationInterceptorProvider = authorizationInterceptorProvider;
    assert httpLoggingInterceptorProvider != null;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public List<Interceptor> get() {
    return Preconditions.checkNotNull(
        module.provideInterceptors$app_devDebug(
            authorizationInterceptorProvider.get(), httpLoggingInterceptorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<List<Interceptor>> create(
      AppModule module,
      Provider<AuthorizationInterceptor> authorizationInterceptorProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new AppModule_ProvideInterceptors$app_devDebugFactory(
        module, authorizationInterceptorProvider, httpLoggingInterceptorProvider);
  }
}
