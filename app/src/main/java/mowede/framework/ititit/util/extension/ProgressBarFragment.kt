package mowede.framework.ititit.util.extension

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.graphics.drawable.toDrawable
import mowede.framework.ititit.R


class ProgressBarFragment : DialogFragment() {

    companion object {

        internal val TAG = "progress_bar_dialog"

        fun newInstance(): ProgressBarFragment {
            return ProgressBarFragment()
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.progress_bar_fragment, container, false)
        dialog.window?.setBackgroundDrawable(Color.TRANSPARENT.toDrawable())
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        return view
    }

}
