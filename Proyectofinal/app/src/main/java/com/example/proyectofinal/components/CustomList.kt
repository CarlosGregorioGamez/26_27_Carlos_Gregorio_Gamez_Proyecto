package com.example.proyectofinal.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class Product(var name: String, var family: String, var price: Float)

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
                family = "",
                price = 0f
            )
        }
    }
}

@Preview
@Composable
fun ListaPreview() {
    val products = listOf(
        Product(
            name = "cerveza",
            family = "refrescos",
            price = 1.23f
        )
    )
    CustomList(products)
}