package mowede.framework.ititit

import android.app.Application
import io.reactivex.Completable
import io.reactivex.CompletableEmitter
import mowede.framework.ititit.di.component.AppComponent
import mowede.framework.ititit.di.component.DaggerAppComponent
import mowede.framework.ititit.di.module.AppModule
import mowede.framework.ititit.di.module.DataModule
import mowede.framework.ititit.di.module.DomainModule
import mowede.framework.ititit.di.module.PresenterModule
import mowede.framework.ititit.storage.source.remote.interceptors.AuthorizationInterceptor

class App : Application(), AuthorizationInterceptor.SessionExpiredListener {
    lateinit var appComponent: AppComponent
        private set

    private lateinit var sessionExpiredEmitter : CompletableEmitter
    val sessionExpiredChannel : Completable = Completable.create { emitter ->  sessionExpiredEmitter = emitter}

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .dataModule(DataModule())
                .domainModule(DomainModule())
                .presenterModule(PresenterModule())
                .build()
    }

    override fun onSessionExpired() {
        sessionExpiredEmitter.onComplete()
    }

}