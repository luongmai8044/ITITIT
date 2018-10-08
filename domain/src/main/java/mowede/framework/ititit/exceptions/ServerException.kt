package mowede.framework.ititit.exceptions

class ServerException(val errorCode: String, val errorMessage: String): Throwable(errorMessage)