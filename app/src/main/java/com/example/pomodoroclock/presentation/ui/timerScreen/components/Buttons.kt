package com.example.pomodoroclock.presentation.ui.timerScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon

@Composable
fun Buttons(onClickConfig: () -> Unit, onClickPause: () -> Unit) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.size(35.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = Color.DarkGray
            ),
            onClick = {  }
        ) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Buscar"
            )
        }
        Spacer(modifier = Modifier.size(5.dp))
        Button(
            modifier = Modifier.size(35.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = Color.DarkGray
            ),
            onClick = {  }
        ) {
            Icon(
                imageVector = Icons.Default.Pause,
                contentDescription = "Buscar"
            )
        }
    }
}


@Preview
@Composable
fun ButtonsPreview() {
    Buttons({}, {})
}