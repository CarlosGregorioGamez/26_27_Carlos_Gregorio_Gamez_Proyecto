package com.example.proyectofinal.components


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Componente por defecto para una barra de busqueda
 *
 * @param search recoje el texto de busqueda introducido por el usuario
 * @param onSearch
 */
@Composable
fun SearchComponent(search: String, onSearch: (String) -> Unit) {

    Box(
        modifier = Modifier
            .width(width = 300.dp)
            .height(height = 30.dp),
        contentAlignment = Alignment.Center
    )
    {
        TextField(
            value = search,
            onValueChange = onSearch,
            leadingIcon =  {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Buscar"
                )
            }
        )
    }
}

@Preview
@Composable
fun SearchComponentPreview() {
    SearchComponent (
        search = "Busqueda",
        onSearch = {

        }
    )
}