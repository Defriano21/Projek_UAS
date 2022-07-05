package com.example.projek_uas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class hewanku(
    val imghewanku: Int,
    val namehewanku: String,
    val deschewanku: String,
    val desc2hewanku: String,
) : Parcelable