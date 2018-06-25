package de.tum.`in`.tumcampusapp.utils

import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class FirebaseLogging(context: Context) {

    private val firebaseLogging = FirebaseAnalytics.getInstance(context)
    private var event = ""
    private val bundle = Bundle()

    fun setEvent(name: String): FirebaseLogging {
        event = name
        return this
    }

    fun addParameter(key: String, value: String): FirebaseLogging {
        bundle.putString(key, value)
        return this
    }

    fun log() {
        firebaseLogging.logEvent(event, bundle)
    }

    companion object {

        fun get(context: Context): FirebaseLogging {
            return FirebaseLogging(context)
        }

    }

}