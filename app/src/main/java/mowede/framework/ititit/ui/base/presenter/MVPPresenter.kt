package mowede.framework.ititit.ui.base.presenter

import mowede.framework.ititit.ui.base.view.MVPView

interface MVPPresenter<in V : MVPView> {

    fun onAttach(view: V)

    fun onDetach()

}