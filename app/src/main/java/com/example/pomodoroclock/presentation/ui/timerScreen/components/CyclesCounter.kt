package com.example.pomodoroclock.presentation.ui.timerScreen.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CyclesCounter(total: Int, finished: Int) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1..finished) {
            Canvas(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                drawCircle(
                    radius = 7.dp.toPx(),
                    color = Color.White
                )
            }
        }
        for (i in 1..(total - finished)) {
            Canvas(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                drawCircle(
                    color = Color.White,
                    radius = 6.dp.toPx(),
                    style = Stroke(width = 2.dp.toPx())
                )
            }
        }
    }
}


@Preview()
@Composable
fun CyclesCounterPreview() {
    CyclesCounter(4, 2)
}