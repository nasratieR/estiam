package com.example.estiam

import android.os.Parcel
import android.os.Parcelable

class ReminderService() : Service(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Logique d'envoi de rappel
        val taskName = intent?.getStringExtra("task_name")
        taskName?.let {
            Toast.makeText(this, "Rappel: $taskName", Toast.LENGTH_LONG).show()
        }
        return START_STICKY
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ReminderService> {
        override fun createFromParcel(parcel: Parcel): ReminderService {
            return ReminderService(parcel)
        }

        override fun newArray(size: Int): Array<ReminderService?> {
            return arrayOfNulls(size)
        }
    }
}