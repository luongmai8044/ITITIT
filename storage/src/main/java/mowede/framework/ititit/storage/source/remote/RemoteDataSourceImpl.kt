package mowede.framework.ititit.data.source.remote

import io.reactivex.Single
import mowede.framework.ititit.storage.entity.LoginResponse
import mowede.framework.ititit.storage.entity.request.LoginRequest
import mowede.framework.ititit.storage.source.remote.api.APIService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: APIService) : RemoteDataSource {
    override fun login(username: String, password: String): Single<LoginResponse> {
        return apiService.login(LoginRequest(username, password))
    }
}