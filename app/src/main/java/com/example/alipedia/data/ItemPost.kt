package com.example.alipedia.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ItemPost (
    val imgUrl : String,
    val txtTitle : String,
    val txtSubtitle : String,
    val txtDetail : String,

    //for trends fragment ->
    val isTrend : Boolean,
    val insight : String
        ):Parcelable