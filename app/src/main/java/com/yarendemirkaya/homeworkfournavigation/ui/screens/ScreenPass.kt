package com.yarendemirkaya.homeworkfournavigation.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenPass() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainPage(navController) }
        composable("screenA") { ScreenA(navController) }
        composable("screenB") { ScreenB(navController) }
        composable("screenX") { ScreenX(navController) }
        composable("screenY") { ScreenY(navController) }
    }
}