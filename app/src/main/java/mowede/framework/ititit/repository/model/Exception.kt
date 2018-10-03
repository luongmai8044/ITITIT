package mowede.framework.ititit.repository.model

open class NetworkException(error: Throwable?) : RuntimeException(error)

class NoNetworkException(error: Throwable) : NetworkException(error)

class ServerUnreachableException(error: Throwable) : NetworkException(error)

class HttpCallFailureException(error: Throwable? = null) : NetworkException(error)

class MaxRetriesExceededException(error: Throwable) : NetworkException(error)