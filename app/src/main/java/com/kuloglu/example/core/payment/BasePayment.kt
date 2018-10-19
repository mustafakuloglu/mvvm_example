package com.kuloglu.example.core.payment


interface BasePayment {

    fun getName():String

    fun getIconPath():String

    fun pay()

    fun getInfo()

    fun getAccountActivities()

}