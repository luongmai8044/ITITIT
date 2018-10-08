package mowede.framework.ititit.di.module

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.DataRepository
import mowede.framework.ititit.storage.source.local.LocalDataSource
import mowede.framework.ititit.storage.source.local.LocalDataSourceImpl
import mowede.framework.ititit.storage.source.preferences.AppPreferences
import mowede.framework.ititit.storage.source.preferences.UserPreferences
import mowede.framework.ititit.storage.source.remote.RemoteDataSource
import mowede.framework.ititit.storage.source.remote.RemoteDataSourceImpl
import mowede.framework.ititit.managers.UserManager
import mowede.framework.ititit.storage.DataRepositoryImpl
import mowede.framework.ititit.storage.UserManagerImpl
import mowede.framework.ititit.storage.source.preferences.AppPreferencesImpl
import mowede.framework.ititit.storage.source.preferences.UserPreferencesImpl
import javax.inject.Singleton

@Module
class DataModule {

    @Provides @Singleton
    fun provideUserManager(userManagerImpl: UserManagerImpl): UserManager = userManagerImpl

    @Provides @Singleton
    fun provideDataRepository(dataRepositoryImpl: DataRepositoryImpl): DataRepository = dataRepositoryImpl

    @Provides @Singleton
    fun provideLocalDataSource(localDataSourceImpl: LocalDataSourceImpl): LocalDataSource = localDataSourceImpl

    @Provides @Singleton
    fun provideRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource = remoteDataSourceImpl

    @Provides @Singleton
    fun provideAppPreferences(appPreferencesImpl: AppPreferencesImpl): AppPreferences = appPreferencesImpl

    @Provides @Singleton
    fun provideUserPreferences(userPreferencesImpl: UserPreferencesImpl): UserPreferences = userPreferencesImpl
}