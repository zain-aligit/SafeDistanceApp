package com.example.safedistance

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class DistanceGuardService: Service() {
    override fun onCreate() {
        super.onCreate()
        startForeground(1001, buildNotification())
        // Sensor setup will go here later
    }
    override fun onBind(intent: Intent?): IBinder? = null
    override fun onDestroy() { super.onDestroy() }

    private fun buildNotification() =
        NotificationCompat.Builder(this, "distance_guard")
            .setContentTitle("Monitoring Safe Distance")
            .setContentText("Service is running")
            .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
            .setOngoing(true)
            .also {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    val ch = NotificationChannel("distance_guard", "Safe Distance", NotificationManager.IMPORTANCE_LOW)
                    (getSystemService(NotificationManager::class.java)).createNotificationChannel(ch)
                }
            }.build()
}
