package com.kuloglu.example.core.payment

    class PaymentMasterCard: BasePayment {
        override fun getName()="MasterCard"
        override fun getIconPath()="https://cdn1.iconfinder.com/data/icons/credit-card-icons/512/master.png"

        override fun pay() {
        }

        override fun getInfo() {
        }

        override fun getAccountActivities() {
        }
    }