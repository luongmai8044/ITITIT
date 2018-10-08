// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package mowede.framework.ititit.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import mowede.framework.ititit.datasource.remote.ApiServiceHelper;
import retrofit2.Retrofit;

public final class AppModule_ProvideApiServiceHelper$app_devDebugFactory
    implements Factory<ApiServiceHelper> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideApiServiceHelper$app_devDebugFactory(
      AppModule module, Provider<Retrofit> retrofitProvider) {
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiServiceHelper get() {
    return Preconditions.checkNotNull(
        module.provideApiServiceHelper$app_devDebug(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiServiceHelper> create(
      AppModule module, Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiServiceHelper$app_devDebugFactory(module, retrofitProvider);
  }
}
