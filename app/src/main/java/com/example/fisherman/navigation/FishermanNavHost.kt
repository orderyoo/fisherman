package com.example.fisherman.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun FishermanNavHost(
    navController: NavHostController,
    startDestination: String
){
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Routes.MapScreen.route) { }
        composable(Routes.MyMapScreen.route) { }
        composable(Routes.PointScreen.route) { }
        composable(Routes.TreckScreen.route) { }
        composable(Routes.AdditionalOptionsScreen.route) { }
    }
}