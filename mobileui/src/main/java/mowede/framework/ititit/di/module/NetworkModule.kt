package mowede.framework.ititit.di.module

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.BuildConfig
import mowede.framework.ititit.storage.source.remote.api.APIService
import mowede.framework.ititit.storage.source.remote.api.APIServiceFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideAPIService() : APIService = APIServiceFactory.makeAPIService(BuildConfig.DEBUG, BuildConfig.BASE_URL)
}