package mowede.framework.ititit.storage.source.remote

import io.reactivex.Single
import mowede.framework.ititit.storage.entity.response.LoginResponse
import mowede.framework.ititit.storage.entity.request.LoginRequest
import mowede.framework.ititit.storage.mapper.ErrorMapper
import mowede.framework.ititit.storage.source.remote.api.APIServiceHelper
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: APIServiceHelper) : RemoteDataSource {
    override fun login(username: String, password: String): Single<LoginResponse> {
        return apiService.login(LoginRequest(username, password))
                .onErrorResumeNext { ErrorMapper.mapNetworkError(it) }
    }
}