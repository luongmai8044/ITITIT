package mowede.framework.ititit.data.network.realtime

interface EventListener {
    fun onConnect(vararg : Any)
    fun onDisconnect(vararg: Any)
    fun onConnectError(vararg: Any)
    fun onNewUserLogin(vararg: Any)
}