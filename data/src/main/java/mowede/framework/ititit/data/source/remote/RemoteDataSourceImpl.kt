package mowede.framework.ititit.data.source.remote

import io.reactivex.Single
import mowede.framework.ititit.data.entity.LoginResponse
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor() : RemoteDataSource {
    override fun login(username: String, password: String): Single<LoginResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}