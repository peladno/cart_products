package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data
import com.example.myapplication.dataViewHolder

class dataAdapter(
    private val data: List<data>,
    private val itemClickListener: ItemClickListener
) : RecyclerView.Adapter<dataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return dataViewHolder(
            layoutInflater.inflate(
               R.layout.item, parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: dataViewHolder, position: Int) {
        val item = data[position]
        holder.render(item)

        holder.item_button.setOnClickListener {
            itemClickListener.onItemClick(item)
        }

    }

    interface ItemClickListener {
        fun onItemClick(item: data)
    }
}
