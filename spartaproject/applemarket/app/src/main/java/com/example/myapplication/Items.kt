package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Items(val image:Int, val name:String,
                 val Intro:String, val seller:String,
                 val price:String, val address:String,
                 val like:Int, val chatting:Int):Parcelable