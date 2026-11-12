package com.example.proyectofinal.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectofinal.ui.theme.ProyectoFinalTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponent(
    topBarTitle: String,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(text = topBarTitle)
        },
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}


@Preview
@Composable
fun TopBarComponentPreview() {
    ProyectoFinalTheme {
        TopBarComponent(topBarTitle = "Proyecto final")
    }
}