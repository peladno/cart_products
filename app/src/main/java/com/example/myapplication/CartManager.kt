package com.example.myapplication

object CartManager {
    private val cartItems = mutableListOf<data>()

    fun getCartItems(): List<data> {
        return cartItems
    }

    fun addToCart(cartItem: data) {
        cartItems.add(cartItem)
    }

    fun clearCart() {
        cartItems.clear()
    }
}
