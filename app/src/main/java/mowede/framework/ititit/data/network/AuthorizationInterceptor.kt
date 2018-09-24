package mowede.framework.ititit.data.network

import android.util.Base64
import mowede.framework.ititit.util.SchedulerProvider
import mowede.framework.ititit.util.extension.mapError
import mowede.framework.ititit.util.extension.mapNetworkErrors
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthorizationInterceptor
@Inject constructor(private val session: Session, private val apiServiceHelper: ApiServiceHelper, private val schedulerProvider: SchedulerProvider)
    : Interceptor {

    override fun intercept(chain: Interceptor.Chain?): Response? {
        var mainResponse = chain?.proceed(chain.request())
        val mainRequest = chain?.request()
        var code = mainResponse?.code()

        if(session.isLoggedIn()) {
            if (code == 401 || code == 403) {

                val authKey = getAuthorizationHeader(session.getEmail(), session.getToken())
                apiServiceHelper.testPrivateAPI(authKey)
                        .mapNetworkErrors()
                        .mapError()
                        .doOnSuccess {
                            response -> response.let{
                                session.saveToken(it.accessToken)
                                val builder = mainRequest?.let {
                                    it.newBuilder().header("Authorization", session.getToken())
                                        .method(mainRequest.method(), mainRequest.body())}
                                mainResponse = chain?.proceed(builder?.build())
                            }
                        }
                        .compose(schedulerProvider.ioToMainSingleScheduler())

                session.invalidate()
            }
        }
        return mainResponse
    }

    fun getAuthorizationHeader(email : String?, token : String?): String {
        val credential = "$email:$token"
        return "Basic" + Base64.encodeToString(credential.toByteArray(), Base64.DEFAULT)
    }
}