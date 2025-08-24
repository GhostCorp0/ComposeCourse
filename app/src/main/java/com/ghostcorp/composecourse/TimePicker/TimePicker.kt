package com.ghostcorp.composecourse.TimePicker

import android.icu.util.Calendar
import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TimePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickerEx() {

    var showDialog by remember { mutableStateOf(false) }

    var selectedTime by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = if (selectedTime.isEmpty()) "No Time Selected" else "Selected Time: $selectedTime")

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    showDialog = true
                }
            ) {

                Text("Open Time Picker")

            }
        }

        if (showDialog) {
            AdvanceTimePicker(
                onConfirm = { timePickerState ->
                    selectedTime = String .format("%02d:%02d",timePickerState.hour,timePickerState.minute)
                    showDialog = false
                },
                onDismiss = {
                     showDialog = true
                }
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdvanceTimePicker(
    onConfirm: (TimePickerState) -> Unit,
    onDismiss: () -> Unit
) {

    val currentTime = Calendar.getInstance()
    val timePickerState = rememberTimePickerState(
        initialHour = currentTime.get(Calendar.HOUR_OF_DAY),
        initialMinute = currentTime.get(Calendar.MINUTE),
        is24Hour = true
    )

    var showDialog by remember { mutableStateOf(false) }

    val toggleIcon = if (showDialog) {
        Icons.Default.Edit
    } else {
        Icons.Default.Close
    }

    AdvanceTimePickerDialog(
        onDismiss = {onDismiss()},
        onConfirm = {
            onConfirm(timePickerState)
        },
        toggle = {
            IconButton(onClick = {showDialog = !showDialog}) {
                Icon(imageVector = toggleIcon, contentDescription = "Time  Picker")
            }
        },
    ){
        if(showDialog) {
            TimePicker(state = timePickerState)
        }else {
            TimeInput(state = timePickerState)
        }

    }

}

@Composable
fun AdvanceTimePickerDialog(
    title: String? = "Select Time",
    onDismiss: () -> Unit,
    onConfirm: () -> Unit,
    toggle: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {

        Surface(
            shape = MaterialTheme.shapes.extraLarge,
            tonalElevation = 6.dp,
            modifier = Modifier
                .width(IntrinsicSize.Min)
                .height(IntrinsicSize.Min)
                .background(
                    shape = MaterialTheme.shapes.extraLarge,
                    color = MaterialTheme.colorScheme.surface
                )
        ) {

            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                if (title != null) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp),
                        text = title,
                        style = MaterialTheme.typography.labelMedium,

                        )
                }

                content()

                Row(modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth()) {

                    toggle()

                    Spacer(modifier = Modifier.weight(1f))

                    TextButton(onClick = onConfirm) {
                        Text("Cancel")
                    }

                    TextButton(onClick = onDismiss) {
                        Text("Ok")
                    }

                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TimePickerExPreview() {
    TimePickerEx()
}