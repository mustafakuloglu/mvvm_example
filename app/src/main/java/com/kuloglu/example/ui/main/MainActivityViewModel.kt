package com.kuloglu.example.ui.main

import android.app.Application
import android.content.Intent
import com.kuloglu.example.App
import com.kuloglu.example.core.BaseViewModel
import com.kuloglu.example.ui.payment.PaymentActivity

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
    fun payTr() {
        startPaymentActivity("tr")
    }

    fun payEn() {
        startPaymentActivity("en")
    }

    private fun startPaymentActivity(country:String)
    {
        val intent = Intent(getApplication<App>(), PaymentActivity::class.java)
        intent.putExtra("country",country)
        getApplication<App>().startActivity(intent)
    }

}