package com.example.questnavigasi.view
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
enum class Screen {
    homePage,
    listPeserta,
    formulir
}

@Composable
fun DataApp(navController: NavHostController = rememberNavController()) {
    Scaffold { padding ->
        NavHost(
            navController = navController,
            startDestination = Screen.homePage.name,
            modifier = Modifier.padding(padding)
        ) {
            composable(Screen.homePage.name) { HomePage(navController) }
            composable(Screen.listPeserta.name) { ListPeserta(navController) }
            composable(Screen.formulir.name) { FormulirPendaftaran(navController) }
        }
    }
}