package mowede.framework.ititit.di.module

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.BuildConfig
import mowede.framework.ititit.ITITITApp
import mowede.framework.ititit.repository.AppDataRepository
import mowede.framework.ititit.datasource.local.AppDatabase
import mowede.framework.ititit.datasource.local.LocalDataHelper
import mowede.framework.ititit.datasource.local.AppLocalDataHelper
import mowede.framework.ititit.datasource.remote.*
import mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor
import mowede.framework.ititit.datasource.preferences.AppPreferenceHelper
import mowede.framework.ititit.datasource.preferences.PreferenceHelper
import mowede.framework.ititit.di.*
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: ITITITApp): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME).build()

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()

    @Provides
    @Singleton
    internal fun provideApiServiceHelper(@APIRetrofit retrofit: Retrofit): ApiServiceHelper = ApiServiceHelper.create(retrofit)

    @Provides
    @Singleton
    internal fun provideTokenServiceHelper(@TokenRetrofit retrofit: Retrofit) = TokenServiceHelper.create(retrofit)

    @Provides
    @Singleton
    internal fun provideLocalDataHelper(appDatabase: AppDatabase): LocalDataHelper = AppLocalDataHelper(appDatabase)

    @Provides
    @APIRetrofit
    internal fun provideRetrofit(@APIOkHttpClient httpClient: OkHttpClient): Retrofit {
        return retrofit2.Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .client(httpClient)
                .build()
    }

    @Provides
    @TokenRetrofit
    internal fun provideTokenRetrofit(@TokenOkHttpClient httpClient: OkHttpClient): Retrofit {
        return retrofit2.Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .client(httpClient)
                .build()
    }

    @Provides
    internal fun provideInterceptors(authorizationInterceptor: AuthorizationInterceptor,
                                     httpLoggingInterceptor: HttpLoggingInterceptor): List<Interceptor> {
        return listOf(authorizationInterceptor, httpLoggingInterceptor)
    }

    @Provides
    internal fun provideHTTPLogInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        }
    }

    @Provides
    @APIOkHttpClient
    internal fun provideHttpClient(interceptors: List<@JvmSuppressWildcards Interceptor>): OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
                .connectTimeout(AppConstants.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(AppConstants.READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(AppConstants.WRITE_TIMEOUT, TimeUnit.SECONDS)

        interceptors.forEach { okHttpClientBuilder.addInterceptor(it) }

        return okHttpClientBuilder.build()
    }

    @Provides
    @TokenOkHttpClient
    internal fun provideTokenHttpClient(): OkHttpClient =
            OkHttpClient.Builder()
                    .connectTimeout(AppConstants.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(AppConstants.READ_TIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(AppConstants.WRITE_TIMEOUT, TimeUnit.SECONDS)
                    .build()

    @Provides
    @Singleton
    internal fun provideDataRepository(apiServiceHelper: ApiServiceHelper,
                                       preferenceHelper: PreferenceHelper,
                                       localDataHelper: LocalDataHelper): AppDataRepository = AppDataRepository(apiServiceHelper, preferenceHelper, localDataHelper)

    @Provides
    @Singleton
    internal fun provideSession(userSession: UserSession): Session = userSession

    @Provides
    @SessionExpiredChannel
    internal fun provideSessionExpiredChannel(application: ITITITApp): Completable =
            application.sessionExpiredChannel

    @Provides
    @Singleton
    internal fun provideSessionExpiredListener(application: ITITITApp): AuthorizationInterceptor.SessionExpiredListener = application
}