package com.kuloglu.example.ui.payment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kuloglu.example.R
import com.kuloglu.example.core.BaseActivity
import com.kuloglu.example.databinding.ActivityPaymentBinding
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity: BaseActivity<PaymentActivityViewModel, ActivityPaymentBinding>(PaymentActivityViewModel::class.java) {
    override fun getLayoutRes()=R.layout.activity_payment

    override fun initViewModel(viewModel: PaymentActivityViewModel) {
        binding.viewModel = viewModel    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         viewModel.init(intent.extras.getString("country"))
        payments.adapter = PaymentAdapter()
    }

}
