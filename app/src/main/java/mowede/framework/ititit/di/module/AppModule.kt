package mowede.framework.ititit.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.BuildConfig
import mowede.framework.ititit.data.database.AppDatabase
import mowede.framework.ititit.data.database.repository.options.OptionsRepo
import mowede.framework.ititit.data.database.repository.options.OptionsRepository
import mowede.framework.ititit.data.database.repository.questions.QuestionRepo
import mowede.framework.ititit.data.database.repository.questions.QuestionRepository
import mowede.framework.ititit.data.network.*
import mowede.framework.ititit.data.preferences.AppPreferenceHelper
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.di.ApiKeyInfo
import mowede.framework.ititit.di.PreferenceInfo
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME).build()

    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = BuildConfig.API_KEY

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideQuestionRepoHelper(appDatabase: AppDatabase): QuestionRepo = QuestionRepository(appDatabase.questionsDao())

    @Provides
    @Singleton
    internal fun provideOptionsRepoHelper(appDatabase: AppDatabase): OptionsRepo = OptionsRepository(appDatabase.optionsDao())

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()

    @Provides @Singleton
    internal fun provideApiServiceHelper(retrofit: Retrofit) : ApiServiceHelper = ApiServiceHelper.create(retrofit)

    @Provides @Singleton
    internal fun provideRetrofit(httpClient: OkHttpClient) : Retrofit {
        return retrofit2.Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .client(httpClient)
                .build()
    }

    @Provides @Singleton
    internal fun provideHttpClient(authorizationInterceptor: AuthorizationInterceptor, renewInterceptor: TokenRenewInterceptor) : OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
                .connectTimeout(AppConstants.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(AppConstants.READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(AppConstants.WRITE_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(authorizationInterceptor)
                .addInterceptor(renewInterceptor)

        return okHttpClientBuilder.build()
    }

    @Provides
    internal fun provideAuthorizationInterceptors(session: Session, apiServiceHelper: ApiServiceHelper, schedulerProvider: SchedulerProvider) : Interceptor = AuthorizationInterceptor(session, apiServiceHelper, schedulerProvider)

    @Provides
    internal fun provideRenewInterceptors(session: Session) : Interceptor = TokenRenewInterceptor(session)

    @Provides @Singleton
    internal fun provideDataRepository(repository : NetworkDataRepository) : DataRepository = repository

    @Provides @Singleton
    internal fun provideSession(userSession: UserSession) : Session = userSession
}