package com.ghostcorp.composecourse.`6_Cards`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCardExample() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                10.dp
            ),
            modifier = Modifier.size(width = 200.dp, height = 100.dp)
        ) {

            Text("This is elevated part", textAlign = TextAlign.Center)

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ElevatedCardExamplePreview() {
    ElevatedCardExample()
}