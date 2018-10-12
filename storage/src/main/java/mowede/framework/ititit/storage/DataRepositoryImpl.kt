package mowede.framework.ititit.storage

import io.reactivex.Completable
import io.reactivex.Single
import mowede.framework.ititit.DataRepository
import mowede.framework.ititit.storage.source.local.LocalDataSource
import mowede.framework.ititit.storage.source.preferences.UserPreferences
import mowede.framework.ititit.storage.source.remote.RemoteDataSource
import mowede.framework.ititit.model.User
import mowede.framework.ititit.storage.model.TokenData
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(private val localDataSource: LocalDataSource,
                                             private val remoteDataSource: RemoteDataSource,
                                             private val userPreferences: UserPreferences) : DataRepository {


    override fun registerConsumer(username: String, password: String): Completable {
        return remoteDataSource.registerConsumer(username, password)
    }

    override fun login(username: String, password: String): Single<User> {
        return remoteDataSource.login(username, password)
                .doOnSuccess {
                    val tokenData = TokenData(it.accessToken, it.refreshToken)
                    userPreferences.putTokenData(tokenData)
                }
                .map { it.transform() }
    }
}