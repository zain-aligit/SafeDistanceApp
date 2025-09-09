package com.example.safedistance

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Request overlay permission:
        if (!Settings.canDrawOverlays(this)) {
            startActivity(Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                                 android.net.Uri.parse("package:$packageName")))
        }

        // Simple UI: A button to calibrate (we’ll expand soon)
        val btn = Button(this).apply { text = "Calibrate Safe Distance" }
        btn.setOnClickListener { /* Save baseline here later */ }
        setContentView(btn)
    }
}
