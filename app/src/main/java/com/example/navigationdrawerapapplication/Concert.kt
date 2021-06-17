package com.example.navigationdrawerapapplication

import java.io.Serializable
import java.util.*

class Concert (
        val address: String,
        val place: String,
        val date: String,
        val description: String,
        val image: Int,
        val lang1: Double,
        val lang2: Double) : Serializable{

    fun getDay(): String{
        return date.substring(0,2);
    }
    fun getMonthShort(): String{
        return date.substring(0,2);
    }

}