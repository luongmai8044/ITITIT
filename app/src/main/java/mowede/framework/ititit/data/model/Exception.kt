package mowede.framework.ititit.data.model

open class NetworkException(error: Throwable?) : RuntimeException(error)

class NoNetworkException(error: Throwable) : NetworkException(error)

class ServerUnreachableException(error: Throwable) : NetworkException(error)

class HttpCallFailureException(error: Throwable? = null) : NetworkException(error)

class SocketConnectException(error: Throwable? = null) : NetworkException(error)