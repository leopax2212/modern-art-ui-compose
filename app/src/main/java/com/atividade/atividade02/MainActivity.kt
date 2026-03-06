package com.atividade.atividade02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModernArtUI()
        }
    }
}

@Composable
fun ModernArtUI() {

    Row(
        modifier = Modifier.fillMaxSize()
    ) {

        // COLUNA ESQUERDA
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFF6F7FB6))
                    .border(6.dp, Color.Black)
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFD94F8A))
                    .border(6.dp, Color.Black)
            )
        }

        // COLUNA DIREITA
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFB61923))
                    .border(6.dp, Color.Black)
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFD9D9D9))
                    .border(6.dp, Color.Black)
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFF2F4696))
                    .border(6.dp, Color.Black)
            )
        }
    }
}