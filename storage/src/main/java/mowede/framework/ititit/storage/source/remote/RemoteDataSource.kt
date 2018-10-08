package mowede.framework.ititit.storage.source.remote

import io.reactivex.Single
import mowede.framework.ititit.storage.entity.response.LoginResponse

interface RemoteDataSource {
    fun login(username: String, password: String) : Single<LoginResponse>
}