package com.kuloglu.example.core.payment

class PaymentProvider {
    fun getPaymentList(countryCode:String):List<BasePayment>
    {
        val payments = mutableListOf<BasePayment>()

        if ("tr"==countryCode)
            payments.addAll(getTrPayments())
        else if ("en"==countryCode)
            payments.addAll(getEnPayments())
        return payments

    }

    private fun getTrPayments(): Collection<BasePayment> {
        val payments = mutableListOf<BasePayment>()

        payments.add(PaymentMasterCard())
        payments.add(PaymentBKMExpress())
        payments.add(PaymentTroy())

        return payments
    }

    private fun getEnPayments(): Collection<BasePayment> {
        val payments = mutableListOf<BasePayment>()

        payments.add(Payment3D())
        payments.add(PaymentMasterCard())
        payments.add(PaymentPayPal())

        return payments
    }
}