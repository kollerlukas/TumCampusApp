package de.tum.`in`.tumcampusapp.component.notifications

import android.content.Context
import android.support.v4.app.NotificationCompat
import android.support.v4.content.ContextCompat
import de.tum.`in`.tumcampusapp.R
import de.tum.`in`.tumcampusapp.component.notifications.model.AppNotification
import de.tum.`in`.tumcampusapp.component.notifications.model.FutureNotification

/**
 * Subclasses of this class provide a list of [AppNotification]s that they want to display. These
 * can either be [InstantNotification]s, which will be displayed instantly or [FutureNotification]s,
 * which will be scheduled for later.
 *
 * Subclasses of this class will be invoked in [ProvidesNotifications]'s getNotifications().
 *
 * @param context The current [Context]
 */
abstract class NotificationProvider(protected val context: Context) {

    protected val notificationColorAccent = ContextCompat.getColor(context, R.color.color_primary)

    /**
     * Returns the [NotificationCompat.Builder] with attributes shared by all of the provider's
     * notifications, such as setAutoCancel() or setGroup()
     *
     * @return A [NotificationCompat.Builder] for this provider
     */
    protected abstract fun getNotificationBuilder(): NotificationCompat.Builder

    /**
     * Returns the list of [AppNotification]s that this provider wants to display.
     *
     * @return List of [AppNotification]s
     */
    //abstract fun getNotification(): AppNotification?

    abstract fun buildNotification(): AppNotification?

}