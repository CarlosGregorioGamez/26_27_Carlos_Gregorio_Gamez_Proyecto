package com.example.proyectofinal.data

data class Product(
    val name: String,
    val quantity: Int,
    val price: Double,
    val imageUrl: String,
    val isFavorite: Boolean = false
)
