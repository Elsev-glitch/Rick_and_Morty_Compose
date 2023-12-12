package com.project.rickandmorty.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destinations(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {

    object Characters : Destinations(
        route = "characters_screen",
        title = "Персонажи",
        icon = Icons.Default.Person
    )

    object Locations : Destinations(
        route = "locations_screen",
        title = "Локации",
        icon = Icons.Default.LocationOn
    )

    object Episodes : Destinations(
        route = "episodes_screen",
        title = "Эпизоды",
        icon = Icons.Default.Check
    )
}