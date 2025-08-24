package com.ghostcorp.composecourse.CheckBox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.fastForEachIndexed

@Composable
fun CheckBoxExample() {

    val childCheckedStates = remember {
         mutableStateListOf(false,false,false)
    }

    val parentState = when {
        childCheckedStates.all { it } -> ToggleableState.On
        childCheckedStates.none() -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        )  {
            Text("Select All")

            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    childCheckedStates.fastForEachIndexed { index,_ ->

                        childCheckedStates[index] = newState

                    }
                }
            )
        }

        childCheckedStates.fastForEachIndexed { index, isChecked ->

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text("Option ${index + 1}")

                Checkbox(
                    checked = isChecked,
                    onCheckedChange = {
                        childCheckedStates[index] = it
                    }
                )
            }
        }
    }

    if(childCheckedStates.all {it}) {
         Text("All option Selected")
    }
}

@Preview(showSystemUi = true)
@Composable
fun CheckBoxExamplePreview() {
    CheckBoxExample()
}