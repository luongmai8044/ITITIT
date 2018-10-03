package mowede.framework.ititit.util.timber

import android.os.Environment
import android.util.Log
import timber.log.Timber
import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.*
import mowede.framework.ititit.BuildConfig
import java.io.File


class FileLoggingTree internal constructor(): Timber.DebugTree() {

    private val LOG_TAG  = FileLoggingTree().javaClass.name

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?){
        try {
            val path = "Log"
            val fileNameTimeStamp = SimpleDateFormat("dd-MM-yyyy",
                    Locale.getDefault()).format(Date())
            val logTimeStamp = SimpleDateFormat("E MMM dd yyyy 'at' hh:mm:ss:SSS aaa",
                    Locale.getDefault()).format(Date())
            val fileName = fileNameTimeStamp + ".html"

            // Create file
            val file = generateFile(path, fileName)

            // If file created or exists save logs
            if (file != null) {
                val writer = FileWriter(file, true)
                writer.append("<p style=\"background:lightgray;\"><strong " + "style=\"backgrund:lightblue;\">&nbsp&nbsp")
                        .append(logTimeStamp)
                        .append(" :&nbsp&nbsp</strong><strong>&nbsp&nbsp")
                        .append(tag)
                        .append("</strong> - ")
                        .append(message)
                        .append("</p>")
                writer.flush()
                writer.close()
            }
        } catch (e: Exception) {
            Log.e(LOG_TAG, "Error while logging into file : $e")
        }
    }

    /*  Helper method to create file*/
    private fun generateFile(path: String, fileName: String): File? {
        var file: File? = null
        if (isExternalStorageAvailable()) {
            val root = File(Environment.getExternalStorageDirectory().getAbsolutePath(),
                    BuildConfig.APPLICATION_ID + File.separator + path)

            var dirExists = true

            if (!root.exists()) {
                dirExists = root.mkdirs()
            }

            if (dirExists) {
                file = File(root, fileName)
            }
        }
        return file
    }

    private fun isExternalStorageAvailable(): Boolean {
        return Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()
    }

    override fun createStackElementTag(element: StackTraceElement): String? {
        return super.createStackElementTag(element) + " - " + element.lineNumber
    }

}