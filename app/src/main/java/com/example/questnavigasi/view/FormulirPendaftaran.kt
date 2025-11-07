package com.example.questnavigasi.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormulirPendaftaran(navController: NavController) {
    var nama by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }