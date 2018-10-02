package mowede.framework.ititit.ui.base.view

interface MVPView {

    fun showProgress()

    fun hideProgress()

    fun showError(error : Throwable)
}