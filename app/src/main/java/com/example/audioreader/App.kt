package com.example.audioreader


import android.app.Application
import com.yariksoffice.lingver.Lingver
import com.yariksoffice.lingver.store.PreferenceLocaleStore
import java.util.Locale

class App : Application() {

    @Suppress("UNUSED_VARIABLE")
    override fun onCreate() {
        super.onCreate()
        val store = PreferenceLocaleStore(this, Locale(LANGUAGE_FRENCH))
        val lingver = Lingver.init(this, store)
    }

    companion object {
        const val LANGUAGE_ENGLISH = "en"
        const val LANGUAGE_ENGLISH_COUNTRY = "US"
        const val LANGUAGE_FRENCH = "fr"
        const val LANGUAGE_FRENCH_COUNTRY = "FR"
    }
}