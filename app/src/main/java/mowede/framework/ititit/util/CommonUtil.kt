package mowede.framework.ititit.util

import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi

object CommonUtil {

    private val moshi : Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    fun <T> mapJsonObjectToDomain(objJson : Any, type : Class<T>) =
            objJson.let {
            moshi.adapter<T>(type).fromJson(it.toString())
        }
}