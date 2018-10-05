package mowede.framework.ititit.di.component

import dagger.Component
import mowede.framework.ititit.di.module.*
import mowede.framework.ititit.ui.login.LoginActivity
import mowede.framework.ititit.ui.splash.SplashActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [
    (AppModule::class),
    (DataModule::class),
    (NetworkModule::class),
    (PresenterModule::class),
    (DomainModule::class)])
interface AppComponent {
    fun inject(activity: SplashActivity)
    fun inject(activity: LoginActivity)
}