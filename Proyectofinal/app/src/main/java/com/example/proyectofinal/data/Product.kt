package com.example.proyectofinal.data

data class Product(
val id: Int,
val name: String,
val category: String,
val quantity: String,
val price: Double,
val imageUrl: String,
val isFavorite: Boolean = false
)
