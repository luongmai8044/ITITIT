package mowede.framework.ititit.data

import io.reactivex.Single
import mowede.framework.ititit.DataRepository
import mowede.framework.ititit.data.source.local.LocalDataSource
import mowede.framework.ititit.data.source.remote.RemoteDataSource
import mowede.framework.ititit.model.LoginData
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(private val localDataSource: LocalDataSource,
                                             private val remoteDataSource: RemoteDataSource)
    : DataRepository {
    override fun login(username: String, password: String): Single<LoginData> {
        return remoteDataSource.login(username, password)
                .map { it.transform() }
    }

}