package mowede.framework.ititit.data.source.remote

import io.reactivex.Single
import mowede.framework.ititit.storage.entity.LoginResponse

interface RemoteDataSource {
    fun login(username: String, password: String) : Single<LoginResponse>
}