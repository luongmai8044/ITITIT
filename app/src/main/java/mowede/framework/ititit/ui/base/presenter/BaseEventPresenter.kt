package mowede.framework.ititit.ui.base.presenter

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.data.model.ConnectionEventType
import mowede.framework.ititit.data.network.EventDataRepository
import mowede.framework.ititit.ui.base.interactor.MVPInteractor
import mowede.framework.ititit.ui.base.view.EventMVPView

abstract class BaseEventPresenter<V : EventMVPView, I : MVPInteractor>
internal constructor(override var interactor: I,
                     override var compositeDisposable: CompositeDisposable,
                     private val eventDataRepository: EventDataRepository) : BasePresenter<V, I>(interactor, compositeDisposable) {

    override fun onAttach(view: V) {
        this.view = view

        eventDataRepository.onEventChanel.subscribe {
            it.apply {
                when(this.type){
                    ConnectionEventType.SOCKET_CONNECT_FAILED.value -> view.onConnectError()
                    ConnectionEventType.SOCKET_CONNECTED.value -> view.onConnect()
                    ConnectionEventType.SOCKET_DISCONNECTED.value -> view.onDisconnect()
                }
            }
        }
    }

}