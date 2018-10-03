package mowede.framework.ititit.datasource.remote

import mowede.framework.ititit.datasource.remote.response.TokenDataResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.POST

interface TokenServiceHelper {

    @POST(ApiEndPoint.ENDPOINT_REFRESH_TOKEN)
    fun refreshToken() : Call<TokenDataResponse>

    companion object Factory {
        fun create(retrofit: Retrofit): TokenServiceHelper {
            return retrofit.create(TokenServiceHelper::class.java)
        }
    }
}