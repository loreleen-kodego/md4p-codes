package com.sablot.activity.objects_and_classes.Activity1

import android.os.Parcel
import android.os.Parcelable

data class Borrower(
    val libraryCardNumber: String?,
    override val name: String?,
    override val phone: String?,
) : Person, Parcelable //inheritance of Borrower
{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(libraryCardNumber)
        parcel.writeString(name)
        parcel.writeString(phone)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Borrower> {
        override fun createFromParcel(parcel: Parcel): Borrower {
            return Borrower(parcel)
        }

        override fun newArray(size: Int): Array<Borrower?> {
            return arrayOfNulls(size)
        }
    }
}
