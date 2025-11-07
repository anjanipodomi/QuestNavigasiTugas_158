package com.example.questnavigasi.view

enum class Screen {
    homePage,
    listPeserta,
    formulir
}

@Composable
fun DataApp(navController: NavHostController = rememberNavController())