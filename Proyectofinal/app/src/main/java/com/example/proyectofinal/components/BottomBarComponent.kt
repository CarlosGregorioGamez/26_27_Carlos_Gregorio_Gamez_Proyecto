
package com.example.proyectofinal.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BottomBarComponent(
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    val items = listOf(
        "Inicio",
        "Favoritos",
        "Mis carritos"
    )

    val icons = listOf(
        Icons.Default.Home,
        Icons.Default.Star,
        Icons.Default.ShoppingCart
    )

    NavigationBar {

        items.forEachIndexed { index, item ->

            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    onItemSelected(index)
                },
                icon = {
                    Icon(
                        imageVector = icons[index],
                        contentDescription = item
                    )
                },
                label = {
                    Text(text = item)
                }
            )
        }
    }
}

@Preview
@Composable
fun BottomBarComponentPreview() {
    BottomBarComponent(
        selectedItem = 0,
        onItemSelected = {

        }
    )
}