package com.example.proyectofinal.pages

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectofinal.components.CustomList
import com.example.proyectofinal.components.SearchComponent
import com.example.proyectofinal.data.Product

@Composable
fun MainMenu(products: List<Product>) {

    Scaffold() {

        innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
        ) {
            item {
                SearchComponent(
                    search = "",
                    onSearch = {

                    }
                )
            }

            item {
                CustomList(
                    product = products
                )
            }
        }
    }
}

@Preview
@Composable
fun MainMenuPreview(){
    MainMenu(
        products = listOf(
            Product(
                name = "Leche entera",
                quantity = 1,
                price = 1.05,
                imageUrl = "leche.png",
                isFavorite = true
            ),
            Product(
                name = "Pan de molde",
                quantity = 2,
                price = 1.45,
                imageUrl = "pan.png"
            ),
            Product(
                name = "Tomate triturado",
                quantity = 3,
                price = 0.95,
                imageUrl = "tomate.png",
                isFavorite = true
            )
        )
    )
}