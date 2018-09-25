package mowede.framework.ititit.ui.base.view

import android.content.Context
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentManager
import android.widget.Toast
import mowede.framework.ititit.util.CommonUtil
import dagger.android.support.AndroidSupportInjection
import mowede.framework.ititit.util.extension.ProgressBarFragment


abstract class BaseDialogView : DialogFragment(), DialogMVPView {

    private var parentActivity: BaseActivity? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity) {
            val activity = context as BaseActivity?
            this.parentActivity = activity
            activity?.onFragmentAttached()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDependencyInjection()
    }

    override fun show(fragmentManager: FragmentManager, tag: String) {
        val transaction = fragmentManager.beginTransaction()

        val prevFragment = fragmentManager.findFragmentByTag(tag)
        if (prevFragment != null) {
            transaction.remove(prevFragment)
        }
        transaction.addToBackStack(null)
        show(transaction, tag)
    }

    override fun hideProgress() {
        fragmentManager?.findFragmentByTag(ProgressBarFragment.TAG)?.let {
            fragmentManager?.beginTransaction()?.remove(it)?.commit()
        }
    }

    override fun showProgress() {
        hideProgress()
        ProgressBarFragment.newInstance().show(fragmentManager, ProgressBarFragment.TAG)
    }

    private fun performDependencyInjection() {
        AndroidSupportInjection.inject(this)
    }

    fun dismissDialog(tag: String) {
        dismiss()
        getBaseActivity()?.onFragmentDetached(tag)
    }

    override fun showNetworkError(){
        Toast.makeText(context, "Network Error", 1).show()
    }


    private fun getBaseActivity(): BaseActivity? {
        return parentActivity
    }

}