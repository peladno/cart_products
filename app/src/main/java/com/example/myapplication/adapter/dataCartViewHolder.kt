package com.example.myapplication.adapter

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.data

class dataCartViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val item_name = view.findViewById<TextView>(R.id.detail_cart_item)
    val item_image = view.findViewById<ImageView>(R.id.image_cart_item)
    val item_price = view.findViewById<TextView>(R.id.price_cart_item)


    fun render(dataModel: data) {
        item_name.text = dataModel.name
        item_price.text = dataModel.price
        Glide.with(item_image.context).load(dataModel.url).into(item_image)

    }
}