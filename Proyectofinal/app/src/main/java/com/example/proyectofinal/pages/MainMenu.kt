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
                    search = TODO(),
                    onSearch = TODO()
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
        emptyList()
    )
}