package mowede.framework.ititit.storage.source.remote.api

import mowede.framework.ititit.storage.entity.response.TokenDataResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.POST

interface TokenService {

    @POST(APIEndPoint.ENDPOINT_REFRESH_TOKEN)
    fun refreshToken() : Call<TokenDataResponse>

    companion object Factory {
        fun create(retrofit: Retrofit): TokenService {
            return retrofit.create(TokenService::class.java)
        }
    }
}