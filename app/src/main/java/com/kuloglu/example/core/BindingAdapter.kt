package com.kuloglu.example.core

import android.support.v7.widget.RecyclerView
import android.databinding.BindingAdapter
import android.net.Uri
import android.widget.ImageView
import com.squareup.picasso.Picasso

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("app:set_list")
    fun setList(recyclerView: RecyclerView, list: List<Nothing>) {
        val adapter = recyclerView.adapter as BaseAdapter<*>
        list.let {
            adapter.submitList(null)
            adapter.submitList(it)
        }
    }

    @JvmStatic
    @BindingAdapter("app:setImage")
    fun bindSetImageToImageView(view: ImageView, url: String?) {
        if (url != null && !url.isEmpty()) {
            Picasso
                    .get()
                    .load(Uri.parse(url))
                    .fit()
                    .centerCrop()
                    .into(view)
        }
    }



}