package com.example.pomodoroclock.presentation.ui.timerScreen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Text

@Composable
fun Timer(time: String) {
    Text(
        textAlign = TextAlign.Center,
        color = Color(0xFFFFFFFF),
        text = time,
        fontSize = 40.sp
    )
}

@Preview
@Composable
fun TimerPreview() {
    Timer("30:00")
}