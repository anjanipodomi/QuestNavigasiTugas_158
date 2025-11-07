package com.example.questnavigasi.view
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.questnavigasi.ui.theme.Dongker


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
            Spacer(modifier = Modifier.height(12.dp))
            Text("Jenis Kelamin", color = Dongker)
            Row {
                listOf("Laki-laki", "Perempuan").forEach {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(selected = gender == it, onClick = { gender = it })
                        Text(it)
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("Status Perkawinan", color = Dongker)
            Row {
                listOf("Janda", "Lajang", "Duda").forEach {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(selected = status == it, onClick = { status = it })
                        Text(it)
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedTextField(
                value = alamat,
                onValueChange = { alamat = it },
                label = { Text("Alamat") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { navController.navigate("homePage") },
                    colors = ButtonDefaults.buttonColors(containerColor = Dongker)
                ) {
                    Text("Beranda", color = androidx.compose.ui.graphics.Color.White)
                }
                Button(
                    onClick = { showDialog = true },
                    colors = ButtonDefaults.buttonColors(containerColor = Dongker)
                ) {
                    Text("Submit", color = androidx.compose.ui.graphics.Color.White)
                }
            }
        }
        //Pop Up
        if (showDialog) {
            CustomDialog(
                onDismiss = { showDialog = false },
                nama = nama,
                gender = gender,
                status = status,
                alamat = alamat
            )
        }
    }
}

@Composable
fun CustomDialog(
    onDismiss: () -> Unit,
    nama: String,
    gender: String,
    status: String,
    alamat: String
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        confirmButton = {
            TextButton(onClick = { onDismiss() }) {
                Text("OK", color = Dongker)
            }
        },
        title = { Text("Data Berhasil Disimpan", color = Dongker) },
        text = {
            Column {
                Text("Nama: $nama")
                Text("Jenis Kelamin: $gender")
                Text("Status: $status")
                Text("Alamat: $alamat")
            }
        }
    )
}