package mowede.framework.ititit.util.timber

import android.util.Log
import timber.log.Timber


class DebugLogTree : Timber.DebugTree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        var priority = priority
        // Workaround for devices that doesn't show lower priority logs

        if (priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO)
            priority = Log.ERROR

        super.log(priority, tag, message, t)
    }

    override fun createStackElementTag(element: StackTraceElement): String? {
        // Add log statements line number to the log
        return super.createStackElementTag(element) + " - " + element.lineNumber
    }
}