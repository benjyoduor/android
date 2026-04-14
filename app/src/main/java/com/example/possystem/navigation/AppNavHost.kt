package com.example.possystem.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.possystem.ui.theme.screens.register.RegisterScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import com.example.possystem.ui.theme.screens.dashboard.Dashboard
import com.example.possystem.ui.theme.screens.login.LoginScreen


@Composable
fun AppNavHost(navController: NavHostController = rememberNavController(),
               startDestination: String = ROUTE_REGISTER) {
    NavHost(navController = navController, startDestination = startDestination) {
            composable(ROUTE_REGISTER) {
            RegisterScreen(navController)}
            composable(ROUTE_LOGIN) {
                LoginScreen(navController)
                }
            composable(ROUTE_DASHBOARD) {
                Dashboard(navController)
            }

    }
}



