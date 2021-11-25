package com.example.modulo.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class Container(
    val id: Int,
    val name: String,
    val origen: String,
    val destino: String,
    val mgw: String,
    val humidity: String,
    val temp: String,
    val heatindex: String,
    ) : Parcelable {

}