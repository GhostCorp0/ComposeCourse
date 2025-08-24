package com.ghostcorp.composecourse.TopAppBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample() {

    TopAppBar(
        title = {
            Column(){
                Row(modifier = Modifier.fillMaxWidth().height(22.dp)){
                    Text(text ="HOme",color = Color.Blue, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null, modifier =
                    Modifier.size(30.dp).padding(top = 6.dp))
                }
                Text(text ="This is location delhi",color = Color.Blue, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        },
        actions = {

        },
        navigationIcon = {

        },
        colors = TopAppBarDefaults.topAppBarColors(Color.White)

    )
}

@Preview(showSystemUi = true)
@Composable
fun TopAppBarExamplePreview() {
    TopAppBarExample()
}