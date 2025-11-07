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
        ) {
            composable(Screen.homePage.name) { HomePage(navController) }
            composable(Screen.listPeserta.name) { ListPeserta(navController) }
            composable(Screen.formulir.name) { FormulirPendaftaran(navController) }
        }
    }
}