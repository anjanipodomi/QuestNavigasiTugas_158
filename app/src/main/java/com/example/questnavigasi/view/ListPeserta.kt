package com.example.questnavigasi.view

@Composable
fun ListPeserta(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("List Daftar Peserta", color = Dongker, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))
        PesertaCard("Mohammad Zidan", "Laki-laki", "Lajang", "Manado")
        Spacer(modifier = Modifier.height(10.dp))
        PesertaCard("Meidina Yasmin", "Perempuan", "Kawin", "Yogyakarta")

        Spacer(modifier = Modifier.height(40.dp))

    }
}