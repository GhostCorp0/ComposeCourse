package com.ghostcorp.composecourse.Scaffold

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {

     var presses by remember { mutableStateOf(0) }

     Scaffold(
         topBar = {
             TopAppBar(
                 colors = TopAppBarColors(
                     containerColor = MaterialTheme.colorScheme.primaryContainer,
                     titleContentColor = MaterialTheme.colorScheme.primary,
                     scrolledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                     navigationIconContentColor = MaterialTheme.colorScheme.primaryContainer,
                     actionIconContentColor = MaterialTheme.colorScheme.error,
                 ),
                 title = { Text("Top App Bar") }
             ) 
         },
         bottomBar = {
             BottomAppBar(
                 containerColor = MaterialTheme.colorScheme.primaryContainer,
                 contentColor = MaterialTheme.colorScheme.primary,
             ) {
                 Text("Bottom App Bar")
              }
         },
         floatingActionButton = {
             FloatingActionButton(
                 onClick = {
                     presses++
                 }
             ) {
                 Text("I've been clicked $presses times")
             }
         }

     ) { innerPadding ->


     }

}

@Preview(showSystemUi = true)
@Composable
fun ScaffoldExamplePreview() {
    ScaffoldExample()
}

