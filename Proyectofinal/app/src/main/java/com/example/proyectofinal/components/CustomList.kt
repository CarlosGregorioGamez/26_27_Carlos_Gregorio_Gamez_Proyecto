package com.example.proyectofinal.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectofinal.data.Product


/**
 * Componente que define una lista reutilizable (posible que tenga otra lista similar mas especifica)
 *
 * @param detalles define una lista de elementos
 */
@Composable
fun CustomList(product: List<Product>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        product.forEach {
            Product(
                name = "",
                quantity = 0,
                price = 0.0,
                imageUrl = "",
                isFavorite = false
            )
        }
    }
}

@Preview
@Composable
fun ListaPreview() {
    val products = listOf(
        Product(
            name = "Cerveza",
            quantity = 2,
            price = 1.7,
            imageUrl = "",
            isFavorite = false
        )
    )
    CustomList(products)
}