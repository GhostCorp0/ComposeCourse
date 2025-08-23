package com.ghostcorp.composecourse.`3_CoreComponents`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ghostcorp.composecourse.R

@Composable
fun ImageSample() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        val colors = remember {
            Brush.sweepGradient(
                listOf(Color.Blue, Color.Cyan, Color.Yellow, Color.Green, Color.Cyan, Color.Magenta)
            )
        }
        
        val borderWidth = 4.dp


        Image(
            painter = painterResource(id =  R.drawable .ic_image),
            contentDescription = "Sampl eImage",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(300.dp).
                border(BorderStroke(borderWidth,colors)),
            alignment = Alignment.Center,
            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
                setToSaturation(0f)
            })


        )

    }

}


@Preview(showSystemUi = true)
@Composable
fun ImagePreview() {
    ImageSample()
}