package mowede.framework.ititit.di.module

import dagger.Module
import dagger.Provides
import io.reactivex.Completable
import mowede.framework.ititit.App
import mowede.framework.ititit.BuildConfig
import mowede.framework.ititit.di.*
import mowede.framework.ititit.storage.source.remote.api.APIServiceHelper
import mowede.framework.ititit.storage.source.remote.api.TokenServiceHelper
import mowede.framework.ititit.storage.source.remote.interceptors.AuthorizationInterceptor
import mowede.framework.ititit.utils.AppConstants
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    internal fun provideApiServiceHelper(@APIRetrofit retrofit: Retrofit): APIServiceHelper = APIServiceHelper.create(retrofit)

    @Provides
    @Singleton
    internal fun provideTokenServiceHelper(@TokenRetrofit retrofit: Retrofit) = TokenServiceHelper.create(retrofit)

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
    @TokenOkHttpClient
    internal fun provideTokenHttpClient(): OkHttpClient =
            OkHttpClient.Builder()
                    .connectTimeout(AppConstants.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(AppConstants.READ_TIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(AppConstants.WRITE_TIMEOUT, TimeUnit.SECONDS)
                    .build()

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
    @SessionExpiredChannel
    internal fun provideSessionExpiredChannel(application: App): Completable =
            application.sessionExpiredChannel

    @Provides
    @Singleton
    internal fun provideSessionExpiredListener(application: App): AuthorizationInterceptor.SessionExpiredListener = application


}