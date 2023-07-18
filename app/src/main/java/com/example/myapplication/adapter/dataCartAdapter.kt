package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data

class dataCartAdapter(private val dataList: List<data>) : RecyclerView.Adapter<dataCartViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataCartViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.cart_item, parent, false)
        return dataCartViewHolder(view)
    }

    override fun onBindViewHolder(holder: dataCartViewHolder, position: Int) {
        val data = dataList[position]
        holder.render(data)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
