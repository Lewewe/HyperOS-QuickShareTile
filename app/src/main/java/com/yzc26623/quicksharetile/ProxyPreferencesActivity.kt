package com.yzc26623.quicksharetile

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle

class PreferencesActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent().apply {
            component = ComponentName(
                "com.google.android.gms",
                "com.google.android.gms.nearby.sharing.main.SettingsMainActivity"
            )
        }

        try {
            startActivity(intent)
        } finally {
            finish()
        }
    }
}