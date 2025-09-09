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
        createNotificationChannel()
        val notification: Notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Safe Distance Active")
            .setContentText("Monitoring phone distance from face...")
            .setSmallIcon(android.R.drawable.ic_menu_info_details)
            .build()
        startForeground(1, notification)
        // Sensor setup will go here later
    }
    override fun onBind(intent: Intent?): IBinder? = null
    override fun onDestroy() { super.onDestroy() }

    private fun buildNotification() =
    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                CHANNEL_ID,
                "Safe Distance Monitoring Service",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(serviceChannel)
        }
    }
}
