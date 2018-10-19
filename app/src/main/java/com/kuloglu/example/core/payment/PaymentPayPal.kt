package com.kuloglu.example.core.payment


class PaymentPayPal : BasePayment {
    override fun getName()="PayPal"
    override fun getIconPath()="https://png.pngtree.com/svg/20170829/paypal_1215293.png"

    override fun pay() {
    }

    override fun getInfo() {
    }

    override fun getAccountActivities() {
    }
}