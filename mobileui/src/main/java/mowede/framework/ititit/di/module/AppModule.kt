package mowede.framework.ititit.di.module

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.App
import mowede.framework.ititit.usecases.SchedulerProvider
import mowede.framework.ititit.utils.SchedulerProviderImpl
import javax.inject.Singleton

@Module
class AppModule constructor(private val app: App) {

    companion object {
        private const val APP_PREF_NAME = "Preferences"
    }

    @Provides
    internal fun provideContext(): Context = app

    @Provides internal fun provideApp(): App = app

    @Provides @Singleton
    internal fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(APP_PREF_NAME, Context.MODE_PRIVATE)
    }

    @Provides @Singleton
    internal fun provideSchedulerProvider(schedulerProviderImpl: SchedulerProviderImpl): SchedulerProvider = schedulerProviderImpl

    @Provides
    internal fun provideCompositeDisaposible() : CompositeDisposable = CompositeDisposable()
}