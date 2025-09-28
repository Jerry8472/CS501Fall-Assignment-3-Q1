package com.example.assignment3q1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.assignment3q1.ui.theme.Assignment3Q1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment3Q1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    layout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun layout(modifier: Modifier = Modifier){
    Row(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Green),
            contentAlignment = Alignment.Center
        ) {
            Text("25% of Row", color = Color.White, fontSize = 20.sp)
        }

        Column(
            modifier = Modifier
                .weight(3f)
                .fillMaxHeight()
                .background(Color.Blue)
        ) {
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Text("2/10", color = Color.White, fontSize = 20.sp)
            }
            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxWidth()
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text("3/10", color = Color.White, fontSize = 20.sp)
            }
            Box(
                modifier = Modifier
                    .weight(5f)
                    .fillMaxWidth()
                    .background(Color.Magenta),
                contentAlignment = Alignment.Center
            ) {
                Text("5/10", color = Color.White, fontSize = 20.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment3Q1Theme {
    }
}