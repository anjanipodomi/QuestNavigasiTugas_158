package com.example.questnavigasi.view
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