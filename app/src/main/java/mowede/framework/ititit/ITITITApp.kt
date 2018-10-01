package mowede.framework.ititit

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.reactivex.Completable
import io.reactivex.CompletableEmitter
import mowede.framework.ititit.data.network.interceptor.AuthorizationInterceptor
import mowede.framework.ititit.di.component.DaggerAppComponent
import mowede.framework.ititit.util.timber.DebugLogTree
import mowede.framework.ititit.util.timber.ReleaseLogTree
import timber.log.Timber
import uk.co.chrisjenx.calligraphy.CalligraphyConfig
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

        if(BuildConfig.DEBUG){
            Timber.uprootAll()
            Timber.plant(DebugLogTree())
        }else{
            Timber.plant(ReleaseLogTree())
        }

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/RobotoCondensed-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )
    }

    override fun onSessionExpired() {
        sessionExpiredEmitter.onComplete()
    }

}