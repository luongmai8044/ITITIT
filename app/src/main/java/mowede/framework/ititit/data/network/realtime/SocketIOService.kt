package mowede.framework.ititit.data.network.realtime

import com.github.nkzawa.emitter.Emitter
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import mowede.framework.ititit.data.model.UserEventType
import mowede.framework.ititit.util.AppConstants
import java.net.URISyntaxException

class SocketIOService : EventService {

    lateinit var mSocket: Socket
    lateinit var mListener: EventListener

    override fun setEventListener(listener: EventListener) {
        mListener = listener
    }

    @Throws(URISyntaxException::class)
    override fun connect(username: String) {
        mSocket = IO.socket(AppConstants.SOCKET_URL)
        mSocket.on(Socket.EVENT_CONNECT, onConnect)
        mSocket.on(Socket.EVENT_DISCONNECT, onDisconnect)
        mSocket.on(Socket.EVENT_CONNECT_ERROR, onConnectError)
        mSocket.on(UserEventType.NEW_USER_LOGIN.value, onNewUserLogin)
        mSocket.connect()
    }

    override fun disconnect() {
        mSocket.disconnect()
    }


    private var onConnect = Emitter.Listener { args -> mListener.onConnect(args) }

    private var onDisconnect = Emitter.Listener { args -> mListener.onDisconnect(args) }

    private var onConnectError = Emitter.Listener { args -> mListener.onConnectError(args) }

    private var onNewUserLogin = Emitter.Listener { args -> mListener.onNewUserLogin(args) }

}