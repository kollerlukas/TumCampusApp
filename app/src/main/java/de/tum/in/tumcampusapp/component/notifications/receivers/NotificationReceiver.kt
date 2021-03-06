package de.tum.`in`.tumcampusapp.component.notifications.receivers

import android.app.Notification
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.support.v4.app.NotificationManagerCompat
import de.tum.`in`.tumcampusapp.utils.Const

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (context == null || intent == null) {
            return
        }

        val notificationId = intent.getIntExtra(Const.KEY_NOTIFICATION_ID, 0)
        val notification = intent.getParcelableExtra<Notification>(Const.KEY_NOTIFICATION) ?: return

        NotificationManagerCompat
                .from(context)
                .notify(notificationId, notification)
    }

}