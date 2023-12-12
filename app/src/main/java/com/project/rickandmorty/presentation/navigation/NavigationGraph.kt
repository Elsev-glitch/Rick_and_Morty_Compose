package com.project.rickandmorty.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.project.rickandmorty.presentation.characters.CharactersScreen
import com.project.rickandmorty.presentation.episodes.EpisodesScreens
import com.project.rickandmorty.presentation.locations.LocationsScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Destinations.Characters.route) {
        composable(Destinations.Characters.route) {
            CharactersScreen()
        }
        composable(Destinations.Locations.route) {
            LocationsScreen()
        }
        composable(Destinations.Episodes.route) {
            EpisodesScreens()
        }
    }
}