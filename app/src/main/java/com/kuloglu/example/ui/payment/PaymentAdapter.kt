package com.kuloglu.example.ui.payment

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.kuloglu.example.App
import com.kuloglu.example.R
import com.kuloglu.example.core.BaseAdapter
import com.kuloglu.example.core.payment.BasePayment
import com.kuloglu.example.databinding.ItemPaymentBinding

class PaymentAdapter : BaseAdapter<BasePayment>(object : DiffUtil.ItemCallback<BasePayment>() {
    override fun areItemsTheSame(oldItem: BasePayment, newItem: BasePayment) = oldItem.getName() == newItem.getName()

    override fun areContentsTheSame(oldItem: BasePayment, newItem: BasePayment) = oldItem == newItem
}) {

    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {
        val viewModel = PaymentItemViewModel(parent.context.applicationContext as App)
        val binding = DataBindingUtil.inflate<ItemPaymentBinding>(LayoutInflater.from(parent.context), R.layout.item_payment, parent, false)
        binding.viewModel = viewModel
        return binding
    }

    override fun bind(binding: ViewDataBinding, position: Int) {
        (binding as ItemPaymentBinding).viewModel?.init( getItem(position))
    }
}