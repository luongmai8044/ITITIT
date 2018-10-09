// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package mowede.framework.ititit.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideSharedPreferences$app_devDebugFactory
    implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  private final Provider<String> prefNameProvider;

  public AppModule_ProvideSharedPreferences$app_devDebugFactory(
      AppModule module, Provider<Context> contextProvider, Provider<String> prefNameProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert prefNameProvider != null;
    this.prefNameProvider = prefNameProvider;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.provideSharedPreferences$app_devDebug(contextProvider.get(), prefNameProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPreferences> create(
      AppModule module, Provider<Context> contextProvider, Provider<String> prefNameProvider) {
    return new AppModule_ProvideSharedPreferences$app_devDebugFactory(
        module, contextProvider, prefNameProvider);
  }
}