package com.ghostcorp.composecourse.`3_CoreComponents`

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SimpleText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Hello Jetpack Compose",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(color = Color.Black, blurRadius = 10f)
            )
        )
    }
}

@Composable
fun ColorFulText() {
    val rainbowColors =
        listOf(Color.Blue, Color.Cyan, Color.Yellow, Color.Green, Color.Cyan, Color.Magenta)

    Text(text = buildAnnotatedString {
        append("Do not a llow people to  dim your shine \n")
        withStyle(
            SpanStyle(
                brush = Brush.linearGradient(
                    colors = rainbowColors
                )
            )
        ) {
            append("bec ause they are blinded..")
            append("\n tell them to put some sunglasses on")
        }
    })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ScrollableText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Text(
            text = "Hey this is aman singh experimenting with the jetpack compose",
            modifier = Modifier.basicMarquee(), fontSize = 50.sp
        )
    }
}

@Composable
fun EllipsisText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Text(
            text = "Hey this is aman singh experimenting with the jetpack compose".repeat(50),
            maxLines = 2,
            fontSize = 50.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview() {
    EllipsisText()
}
