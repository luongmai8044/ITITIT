package mowede.framework.ititit.storage.source.preferences

import android.content.SharedPreferences
import javax.inject.Inject

class AppPreferencesImpl
    @Inject constructor(private val sharedPreferences: SharedPreferences): AppPreferences