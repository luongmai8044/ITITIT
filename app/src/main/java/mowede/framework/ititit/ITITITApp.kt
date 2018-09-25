package mowede.framework.ititit

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.reactivex.Completable
import io.reactivex.CompletableEmitter
import mowede.framework.ititit.data.network.interceptor.AuthorizationInterceptor
import mowede.framework.ititit.di.component.DaggerAppComponent
import javax.inject.Inject


class ITITITApp : Application(), HasActivityInjector, AuthorizationInterceptor.SessionExpiredListener {

    private lateinit var sessionExpiredEmitter : CompletableEmitter
    val sessionExpiredChannel : Completable = Completable.create { emitter ->  sessionExpiredEmitter = emitter}

    @Inject
    internal lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>


    override fun activityInjector() = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun onSessionExpired() {
        sessionExpiredEmitter.onComplete()
    }

}