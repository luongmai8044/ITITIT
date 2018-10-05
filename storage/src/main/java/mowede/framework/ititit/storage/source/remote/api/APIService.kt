package mowede.framework.ititit.storage.source.remote.api

import io.reactivex.Single
import mowede.framework.ititit.storage.entity.LoginResponse
import mowede.framework.ititit.storage.entity.request.LoginRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface APIService {
    @POST(ApiPaths.LOGIN)
    fun login(@Body data: LoginRequest): Single<LoginResponse>
}