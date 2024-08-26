package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    // Añadir CustomLazyColumn dentro del Scaffold
                    CustomLazyColumn()
                }
            }
        }
    }
}

@Composable
fun CustomLazyColumn() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(10) { index ->
            Text(
                text = "Item #$index",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp)
            )
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "!",
        modifier = modifier
    )
}

// para una vista previa
@Preview(showBackground = true)
@Composable
fun CustomLazyColumnPreview() {
    Lab04Theme {
        CustomLazyColumn()
    }
}
