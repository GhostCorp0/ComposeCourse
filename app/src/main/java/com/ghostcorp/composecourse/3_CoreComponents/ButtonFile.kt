package com.ghostcorp.composecourse.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TextButton


@Composable
fun FilledButtonSample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Button(onClick = {
            Toast.makeText(context,"Button is Clicked",Toast.LENGTH_SHORT).show()
         }) {
            Text("Filled Button")
        }
    }
}

@Composable
 fun TonalButton() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        FilledTonalButton(
            onClick = {
                Toast.makeText(context,"Button is Clicked",Toast.LENGTH_SHORT).show()
            },
        ) {
            Text("Tonal Button")
        }
    }
 }

@Composable
fun OutlinedButtonSample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        OutlinedButton(
            onClick = {
                //
        }) {
            Text("Outlined Button")
        }
    }
}

@Composable
fun ElevatedButtonSample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        ElevatedButton(
            onClick = {

            }
        ) {
            Text("Elevate Button ")
        }
    }
}

@Composable
fun TextButtonSample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        TextButton(
            onClick = {

            }
        ) {
            Text("Text Button")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun FilledButtonSamplePreview() {
    TextButtonSample()
}
