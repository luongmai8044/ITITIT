package mowede.framework.ititit.data.network

import io.reactivex.subjects.PublishSubject
import mowede.framework.ititit.data.model.ConnectionEventType
import mowede.framework.ititit.data.model.UserEventType
import mowede.framework.ititit.data.network.realtime.EventListener
import mowede.framework.ititit.data.network.realtime.EventService
import javax.inject.Inject

class EventDataRepository @Inject internal constructor(private val eventService: EventService) : EventListener{

    var onEventChanel: PublishSubject<Event> = PublishSubject.create()

    init {
        eventService.setEventListener(this)
    }

    override fun onConnect(vararg: Any) {
        onEventChanel.onNext(Event(ConnectionEventType.SOCKET_CONNECTED.value, vararg))
    }

    override fun onDisconnect(vararg: Any) {
        eventService.disconnect()
    }

    override fun onConnectError(vararg: Any) {
        onEventChanel.onNext(Event(ConnectionEventType.SOCKET_CONNECT_FAILED.value, vararg))
    }

    override fun onNewUserLogin(vararg: Any) {
        onEventChanel.onNext(Event(UserEventType.NEW_USER_LOGIN.value, vararg))
    }

}