package com.example.myapplication

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.data


class dataViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val item_name = view.findViewById<TextView>(R.id.textView)
    val item_image = view.findViewById<ImageView>(R.id.image_list_product)
    val item_button = view.findViewById<Button>(R.id.button_product_list)


    fun render(dataModel: data) {
        item_name.text = dataModel.name
        Glide.with(item_image.context).load(dataModel.url).into(item_image)
        item_button.setOnClickListener{}
    }

}