package com.ghostcorp.composecourse.`4_LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Modifiers

// Modifiers are available in all the composable functions

@Composable
fun ModifierExample() {
    Box(
        modifier = Modifier.size(200.dp)
            .background(
                color = Color.Blue
            ),
        contentAlignment = Alignment.Center
    ) {

        Text("This is the jetpack", modifier = Modifier.background(color = Color.Yellow))

    }
}

@Preview(showSystemUi = true)
@Composable
fun ModifierExamplePreview() {
    ModifierExample()
}
