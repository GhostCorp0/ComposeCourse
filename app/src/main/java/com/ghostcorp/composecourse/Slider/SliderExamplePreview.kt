package com.ghostcorp.composecourse.Slider

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ghostcorp.composecourse.SegmentedButton.SegmentedButtonExample

@Composable
fun SliderExample() {
    var sliderPosition by remember { mutableStateOf(0f) }
    Column {
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            colors = SliderDefaults.colors(
                thumbColor = MaterialTheme.colorScheme.secondary,
                activeTrackColor = MaterialTheme.colorScheme.secondary,
                inactiveTickColor = MaterialTheme.colorScheme.secondaryContainer
            ),
            steps = 1,
            valueRange = 0f..50f
        )
        Text(text = sliderPosition.toString())
    }
}

@Preview(showSystemUi = true)
@Composable
fun SliderExamplePreview() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        SliderExample()
    }
}