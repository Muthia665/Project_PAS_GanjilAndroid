package com.example.project_pas_ganjilandroid

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Modl (
    var photo: Int,
    var title: String,
    var desc: String
) : Parcelable