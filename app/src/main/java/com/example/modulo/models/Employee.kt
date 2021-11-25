
    package com.example.modulo.models

    import android.os.Parcelable
    import kotlinx.parcelize.Parcelize


    @Parcelize
    class Employee(
        val id: Int,
        val name: String,
        val curp: String,
        val area: String,

    ) : Parcelable {

    }
