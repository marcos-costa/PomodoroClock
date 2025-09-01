package com.example.pomodoroclock.presentation.ui.timerScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.tooling.preview.devices.WearDevices
import com.example.pomodoroclock.presentation.theme.PomodoroClockTheme
import com.example.pomodoroclock.presentation.ui.timerScreen.components.Buttons
import com.example.pomodoroclock.presentation.ui.timerScreen.components.CyclesCounter
import com.example.pomodoroclock.presentation.ui.timerScreen.components.ProgressBar
import com.example.pomodoroclock.presentation.ui.timerScreen.components.Timer

@Composable
fun TimerScreen(time: String) {
    PomodoroClockTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF1b4965)
                ),
            contentAlignment = Alignment.Center
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Timer("30:00")
                Spacer(Modifier.size(10.dp))
                CyclesCounter(4, 2)
                Spacer(Modifier.size(10.dp))
                Buttons({}, {})
            }
            ProgressBar(activityTime = 25*60, restTime = 5*60, actualTime = 27*60)
        }
    }
}

@Preview(device = WearDevices.SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    PomodoroClockTheme {
        TimerScreen("30:00")
    }
}