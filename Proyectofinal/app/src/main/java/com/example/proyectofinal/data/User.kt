package com.example.proyectofinal.data

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val profileImage: String? = null
)
