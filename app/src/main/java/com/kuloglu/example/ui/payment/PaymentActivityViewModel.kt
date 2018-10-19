package com.kuloglu.example.ui.payment

import android.app.Application
import android.databinding.ObservableArrayList
import android.databinding.ObservableList
import com.kuloglu.example.core.BaseViewModel
import com.kuloglu.example.core.payment.BasePayment
import com.kuloglu.example.core.payment.PaymentProvider

class PaymentActivityViewModel(app: Application) : BaseViewModel(app) {
    var country = ""

    val paymentMethods: ObservableList<BasePayment> = ObservableArrayList()


    fun init(country: String) {
        this.country = country
        fillPaymentMethods()
    }

    private fun fillPaymentMethods() {
        paymentMethods.addAll(PaymentProvider().getPaymentList(country))
    }
    fun doubleClick(){
        fillPaymentMethods()
    }

}