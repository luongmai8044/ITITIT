package mowede.framework.ititit.data.network

interface EventListener {
    fun onConnect(vararg : Any)
    fun onDisconnect(vararg: Any)
    fun onNewMessage(vararg: Any)
}