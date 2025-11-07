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
        Row{
            Button(
                onClick = { navController.navigate("homePage") },
                colors = ButtonDefaults.buttonColors(containerColor = Dongker),
                modifier = Modifier.padding(end = 8.dp)
            ) {
                Text("Beranda", color = androidx.compose.ui.graphics.Color.White)
            }
            Button(
                onClick = { navController.navigate("formulir") },
                colors = ButtonDefaults.buttonColors(containerColor = Dongker)
            ) {
                Text("Formulir", color = androidx.compose.ui.graphics.Color.White)
            }
        }
    }
}

@Composable
fun PesertaCard(nama: String, gender: String, status: String, alamat: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Nama Lengkap: $nama", color = Dongker, fontWeight = FontWeight.Bold)
            Text("Jenis Kelamin: $gender", color = Dongker)
            Text("Status: $status", color = Dongker)
            Text("Alamat: $alamat", color = Dongker)
        }
    }
}