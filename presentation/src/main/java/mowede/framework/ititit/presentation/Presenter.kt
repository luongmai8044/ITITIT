package mowede.framework.ititit.presentation

interface Presenter<V: View> {
    var view: V?
    fun start()
    fun stop()
}