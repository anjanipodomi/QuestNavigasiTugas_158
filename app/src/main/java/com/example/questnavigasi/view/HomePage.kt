package com.example.questnavigasi.view

@Composable
fun HomePage(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Selamat Datang", color = Dongker, fontSize = 24.sp)

            Spacer(modifier = Modifier.height(16.dp))
            Text("CARD-LST",
                color = Dongker, fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 1.sp,)
        }
    }
}