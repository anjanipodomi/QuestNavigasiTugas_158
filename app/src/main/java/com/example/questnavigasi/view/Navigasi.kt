package com.example.questnavigasi.view

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
        )
}