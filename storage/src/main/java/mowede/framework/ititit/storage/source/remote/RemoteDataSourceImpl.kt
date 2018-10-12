package mowede.framework.ititit.storage.source.remote

import io.reactivex.Completable
import io.reactivex.Single
import mowede.framework.ititit.storage.entity.response.LoginResponse
import mowede.framework.ititit.storage.entity.request.LoginRequest
import mowede.framework.ititit.storage.mapper.ErrorMapper
import mowede.framework.ititit.storage.source.remote.api.APIService
import mowede.framework.ititit.storage.util.RetryWithDelay
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: APIService) : RemoteDataSource {

    override fun registerConsumer(username: String, password: String): Completable {
        return apiService.registerConsumer(username, password)
    }

    override fun login(username: String, password: String): Single<LoginResponse> {
        return apiService.login(LoginRequest(username, password))
                .retryWhen(RetryWithDelay(3, 2, TimeUnit.SECONDS))
                .onErrorResumeNext { ErrorMapper.mapNetworkError(it) }
    }
}