package mowede.framework.ititit.storage.source.remote.api

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import mowede.framework.ititit.storage.source.remote.interceptors.ErrorResponseInterceptor
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object APIServiceFactory {

    fun makeAPIService(isDebug: Boolean, url: String): APIService {
        val okHttpClient = makeOkHttpClient(
                getInterceptors(isDebug))
        return makeAPIsService(okHttpClient, makeGson(), url)
    }

    private fun makeAPIsService(okHttpClient: OkHttpClient, gson: Gson, url: String): APIService {
        val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        return retrofit.create(APIService::class.java)
    }

    private fun getInterceptors(isDebug: Boolean): Set<Interceptor> {
        return setOf(
                makeLoggingInterceptor(isDebug),
                ErrorResponseInterceptor())
    }

    private fun makeOkHttpClient(interceptors: Set<Interceptor>): OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .apply { interceptors.forEach { addInterceptor(it) } }
                .build()
    }

    private fun makeGson(): Gson {
        return GsonBuilder()
                .setLenient()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create()
    }

    private fun makeLoggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (isDebug)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }

}