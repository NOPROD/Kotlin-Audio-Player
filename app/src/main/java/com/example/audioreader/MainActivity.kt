package com.example.audioreader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.audioreader.ui.main.FragmentMain
import com.example.audioreader.ui.main.FragmentSettings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentMain = FragmentMain()
        val fragmentSettings = FragmentSettings()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragmentMain)
            commit()
        }

        btnFragmentMain.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragmentMain)
                addToBackStack(null)
                commit()
            }
        }

        btnFragmentSettings.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragmentSettings)
                addToBackStack(null)
                commit()
            }
        }
    }
}