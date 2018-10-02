package mowede.framework.ititit.ui.base.view

interface EventMVPView : MVPView {
    fun onConnect()
    fun onDisconnect()
    fun onConnectError()
}