package mowede.framework.ititit.di.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import mowede.framework.ititit.ui.splash.SplashActivityModule;
import mowede.framework.ititit.ui.splash.view.SplashMVPActivity;

@Module(subcomponents = ActivityBuilder_BindSplashActivity.SplashMVPActivitySubcomponent.class)
public abstract class ActivityBuilder_BindSplashActivity {
  private ActivityBuilder_BindSplashActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SplashMVPActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SplashMVPActivitySubcomponent.Builder builder);

  @Subcomponent(modules = SplashActivityModule.class)
  public interface SplashMVPActivitySubcomponent extends AndroidInjector<SplashMVPActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashMVPActivity> {}
  }
}
