package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

private const val ARG_PARAM1 = "name"
private const val ARG_PARAM2 = "url"
private const val ARG_PARAM3 = "price"

class ItemDetailFragment : Fragment() {

    private var name: String? = null
    private var url: String? = null
    private var price: String? = null

    private val cartItems = mutableListOf<data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(ARG_PARAM1)
            url = it.getString(ARG_PARAM2)
            price = it.getString(ARG_PARAM3)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_detail, container, false)
        initView(view)
        return view
    }

    @SuppressLint("SetTextI18n")
    private fun initView(view: View) {
        val nameTextView = view.findViewById<TextView>(R.id.name_detail)
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val addButton = view.findViewById<Button>(R.id.button_detail)
        val priceText = view.findViewById<TextView>(R.id.price_detail)

        nameTextView.text = name
        priceText.text = "$ $price"

        Glide.with(requireContext())
            .load(url)
            .into(imageView)

        addButton.setOnClickListener {

            val cartItem = data(url ?: "", name ?: "", price ?: "")
            CartManager.addToCart(cartItem)


        }


    }


    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ItemDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}