package mowede.framework.ititit.data.network.realtime
import java.net.URISyntaxException

interface EventService {

    @Throws(URISyntaxException::class)
    fun connect(username : String)
    fun disconnect()
    fun setEventListener(listener : EventListener)
}