package mowede.framework.ititit.data.model

enum class ConnectionEventType(val value: String) {
    SOCKET_CONNECT_FAILED("Socket Connect Failed"),
    SOCKET_CONNECTED("Socket Is Connected"),
    SOCKET_DISCONNECTED("Socket Is Disconnected")
}

enum class UserEventType(val value: String){
    NEW_USER_LOGIN("New User Login")
}