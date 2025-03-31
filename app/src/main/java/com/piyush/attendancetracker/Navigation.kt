package com.piyush.attendancetracker

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.piyush.attendancetracker.screens.AboutMeScreen
import com.piyush.attendancetracker.screens.SubjectScreen


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "subjects") {
        composable("subjects") {
            SubjectScreen(navController)
        }
        composable("about") {
            AboutMeScreen(navController)
        }
    }
}
