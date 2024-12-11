package com.example.roomcronoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roomcronoapp.views.AddView
import com.example.roomcronoapp.views.EditorView
import com.example.roomcronoapp.views.HomeView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }
        composable("AddView"){
            AddView(navController)
        }
        composable("EditorView"){
            EditorView(navController)
        }
    }
}