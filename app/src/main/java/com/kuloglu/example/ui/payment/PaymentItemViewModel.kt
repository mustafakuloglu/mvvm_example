package com.kuloglu.example.ui.payment

import android.app.Application
import android.databinding.ObservableField
import com.kuloglu.example.core.BaseViewModel
import com.kuloglu.example.core.payment.BasePayment


class PaymentItemViewModel  (app: Application) : BaseViewModel(app) {
    lateinit var payment: BasePayment
    val name: ObservableField<String> = ObservableField()
    val icon: ObservableField<String> = ObservableField()

    fun init(item: BasePayment) {
        payment = item
        name.set(payment.getName())
        icon.set(payment.getIconPath())
    }
}