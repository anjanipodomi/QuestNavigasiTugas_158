package com.example.questnavigasi.view
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.questnavigasi.R
import com.example.questnavigasi.ui.theme.Dongker

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
            Image(
                painter = painterResource(id = R.drawable.logotgspam6),
                contentDescription = null,
                modifier = Modifier.size(120.dp)
            )
            Text("MOBILE APP", color = Dongker, fontSize = 18.sp)
            Text("2025", color = Dongker, fontSize = 18.sp)

            Spacer(modifier = Modifier.height(48.dp))
            Text("Anjani Dihapsari", color = Dongker)
            Text("20230140158", color = Dongker)

            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { navController.navigate("listPeserta") },
                colors = ButtonDefaults.buttonColors(containerColor = Dongker)
            ) {
                Text("Masuk", color = androidx.compose.ui.graphics.Color.White)
            }
        }
    }
}