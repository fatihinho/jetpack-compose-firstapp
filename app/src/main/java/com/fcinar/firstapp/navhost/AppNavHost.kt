package com.fcinar.firstapp.navhost

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fcinar.firstapp.screens.AboutScreen
import com.fcinar.firstapp.screens.HomeScreen

enum class Destinations(val route: String) {
    HOME("home"),
    ABOUT("about")
}

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = Destinations.HOME.route
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Destinations.HOME.route) {
            HomeScreen()
        }
        composable(Destinations.ABOUT.route) {
            AboutScreen()
        }
    }
}