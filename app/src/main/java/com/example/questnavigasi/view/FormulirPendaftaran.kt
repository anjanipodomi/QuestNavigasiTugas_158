package com.example.questnavigasi.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormulirPendaftaran(navController: NavController) {
    var nama by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Formulir Pendaftaran",
                        color = androidx.compose.ui.graphics.Color.White
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Dongker)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(20.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                label = { Text("Nama Lengkap") },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}