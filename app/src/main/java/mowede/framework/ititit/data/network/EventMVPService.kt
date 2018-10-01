package mowede.framework.ititit.data.network

import com.github.nkzawa.emitter.Emitter

interface EventMVPService {

    fun connect(username : String)
    fun disConnect()
    fun setEventListener(listener : Emitter.Listener)
}