package com.example.swoosh

import android.os.Parcel
import android.os.Parcelable

class SwooshPlayer constructor(var league:String,var skill:String):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SwooshPlayer> {
        override fun createFromParcel(parcel: Parcel): SwooshPlayer {
            return SwooshPlayer(parcel)
        }

        override fun newArray(size: Int): Array<SwooshPlayer?> {
            return arrayOfNulls(size)
        }
    }
}
