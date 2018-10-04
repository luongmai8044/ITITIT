package mowede.framework.ititit.ui.splash

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter
import mowede.framework.ititit.ui.splash.presenter.SplashPresenter

@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter)
            : SplashMVPPresenter = splashPresenter
}