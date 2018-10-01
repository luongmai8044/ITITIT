package mowede.framework.ititit.data.network

import com.github.nkzawa.emitter.Emitter
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import mowede.framework.ititit.util.AppConstants

class EventService : EventMVPService{

    lateinit var socket : Socket
    lateinit var mListener: EventListener

    override fun disConnect() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setEventListener(listener: Emitter.Listener) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun connect(username: String) {
        socket = IO.socket(AppConstants.SOCKET_URL)
        socket.on(Socket.EVENT_CONNECT, )
        socket.connect()
    }

    private fun onConnect() = object : Emitter.Listener {
        override fun call(vararg args: Any?) {
            mListener.onConnect(args)
        }

    }


}