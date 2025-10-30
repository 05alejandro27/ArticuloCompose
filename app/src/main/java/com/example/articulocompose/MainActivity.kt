package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulocompose.ui.theme.ArticuloComposeTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticuloComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Imagen(
                        )
                        Titulo(
                            message = "JetPack Compose Tutorial"
                        )
                        Main1(
                            message = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and " +
                                    "accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs."
                        )
                        Main2(
                            message = "In this tutorial, you build a simple UI component with declarative functions. You call Compose " +
                                    "functions to say what elements you want and the Compose compiler does the rest. Compose is built around " +
                                    "Composable functions. These functions let you define your app\\'s UI programmatically because they let " +
                                    "you describe how it should look and provide data dependencies, rather than focus on the process of the " +
                                    "UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a " +
                                    "Composable function, you add the @Composable annotation to the function name."
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Imagen() {
    Image(
        painter = painterResource(R.drawable.bg_compose_background),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Titulo(message: String) {
    Text(
        text = message,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun Main1(message: String) {
    Text(
        text = message,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = Justify
    )
}

@Composable
fun Main2(message: String) {
    Text(
        text = message,
        modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp),
        textAlign = Justify
    )
}