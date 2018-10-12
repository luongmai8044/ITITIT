package mowede.framework.ititit.storage.source.remote

import io.reactivex.Completable
import io.reactivex.Single
import mowede.framework.ititit.storage.entity.response.LoginResponse

interface RemoteDataSource {
    fun login(username: String, password: String) : Single<LoginResponse>

    fun registerConsumer(username: String, password: String): Completable
}