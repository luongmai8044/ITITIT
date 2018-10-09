// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package mowede.framework.ititit.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

public final class AppModule_ProvideHTTPLogInterceptor$app_devDebugFactory
    implements Factory<HttpLoggingInterceptor> {
  private final AppModule module;

  public AppModule_ProvideHTTPLogInterceptor$app_devDebugFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return Preconditions.checkNotNull(
        module.provideHTTPLogInterceptor$app_devDebug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HttpLoggingInterceptor> create(AppModule module) {
    return new AppModule_ProvideHTTPLogInterceptor$app_devDebugFactory(module);
  }
}