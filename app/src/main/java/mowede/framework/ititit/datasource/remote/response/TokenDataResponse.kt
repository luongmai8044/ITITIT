package mowede.framework.ititit.datasource.remote.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TokenDataResponse internal constructor(@Expose
                                                  @SerializedName("access_token")
                                                  val accessToken: String,
                                                  @Expose
                                                  @SerializedName("refresh_token")
                                                  val refreshToken: String)