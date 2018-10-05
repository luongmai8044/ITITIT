package mowede.framework.ititit

import android.app.Application
import mowede.framework.ititit.di.component.AppComponent
import mowede.framework.ititit.di.component.DaggerAppComponent
import mowede.framework.ititit.di.module.AppModule
import mowede.framework.ititit.di.module.DataModule
import mowede.framework.ititit.di.module.DomainModule
import mowede.framework.ititit.di.module.PresenterModule

class App : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .dataModule(DataModule())
                .domainModule(DomainModule())
                .presenterModule(PresenterModule())
                .build()
    }
}