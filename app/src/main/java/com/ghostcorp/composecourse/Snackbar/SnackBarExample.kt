package com.ghostcorp.composecourse.Snackbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch


@Composable
fun SnackBarExample() {

    val scope = rememberCoroutineScope()

    val snackBarHostState = remember{SnackbarHostState()}


    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text =  { Text ("Show snackbar") },
                icon ={ Icon(Icons.Default.Search, contentDescription = "kdnd") },
                onClick = {
                     scope.launch {
                         val result = snackBarHostState.showSnackbar(
                             message = "SnackBar",
                             actionLabel = "Undo",
                             duration = SnackbarDuration.Indefinite
                         )

                         when(result) {
                             SnackbarResult.ActionPerformed -> {

                             }

                             SnackbarResult.Dismissed ->{

                             }
                         }
                     }
                }
            )
        },

    ) { innerPadding ->

    }
}

@Preview(showSystemUi = true)
@Composable
fun SnackBarExamplePreview() {
    SnackBarExample()
}