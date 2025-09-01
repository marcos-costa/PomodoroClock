package com.example.pomodoroclock.presentation.ui.timerScreen.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.tooling.preview.devices.WearDevices
import kotlin.math.max
import kotlin.math.min

@Composable
fun ProgressBar(activityTime: Int, restTime: Int, actualTime: Int) {
    Canvas(
        modifier = Modifier
            .padding(6.dp)
            .fillMaxSize()
    ) {
        drawArc(
            color = Color.LightGray,
            startAngle = 133f,
            sweepAngle = (270f * activityTime / (activityTime + restTime)),
            useCenter = false,
            style = Stroke(width = 4.dp.toPx(), cap = StrokeCap.Round)
        )
        drawArc(
            color = Color.Red,
            startAngle = 133f,
            sweepAngle = (270f * min(actualTime, activityTime) / (activityTime + restTime)),
            useCenter = false,
            style = Stroke(width = 4.dp.toPx(), cap = StrokeCap.Round)
        )


        drawArc(
            color = Color.LightGray,
            startAngle = 137f + (270f * activityTime / (activityTime + restTime)),
            sweepAngle = (270f * restTime / (activityTime + restTime)),
            useCenter = false,
            style = Stroke(width = 4.dp.toPx(), cap = StrokeCap.Round)
        )
        drawArc(
            color = Color.Blue,
            startAngle = 137f + (270f * activityTime / (activityTime + restTime)),
            sweepAngle = (270f * max(0, actualTime - activityTime) / (activityTime + restTime)),
            useCenter = false,
            style = Stroke(width = 4.dp.toPx(), cap = StrokeCap.Round)
        )
    }
}


@Preview(device = WearDevices.SMALL_ROUND)
@Composable
fun ProgressBarPreview() {
    ProgressBar(activityTime = 25*60, restTime = 5*60, actualTime = 27*60)
}