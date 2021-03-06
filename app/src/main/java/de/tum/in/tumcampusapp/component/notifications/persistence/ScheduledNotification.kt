package de.tum.`in`.tumcampusapp.component.notifications.persistence

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "scheduled_notifications")
data class ScheduledNotification(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    @ColumnInfo(name = "type_id")
    var typeId: Int = 0,
    @ColumnInfo(name = "content_id")
    var contentId: Int = 0
)
