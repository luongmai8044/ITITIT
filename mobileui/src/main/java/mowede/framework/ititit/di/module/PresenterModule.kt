package mowede.framework.ititit.di.module

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.presentation.login.LoginPresenter
import mowede.framework.ititit.presentation.login.LoginPresenterImpl
import mowede.framework.ititit.presentation.splash.SplashPresenter
import mowede.framework.ititit.presentation.splash.SplashPresenterImpl

@Module
class PresenterModule {
    @Provides
    fun provideSplashPresenter(splashPresenterImpl: SplashPresenterImpl) : SplashPresenter = splashPresenterImpl

    @Provides
    fun provideLoginPresenter(loginPresenterImpl: LoginPresenterImpl) : LoginPresenter = loginPresenterImpl
}