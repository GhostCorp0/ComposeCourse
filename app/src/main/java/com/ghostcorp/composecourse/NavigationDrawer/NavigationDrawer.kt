package com.ghostcorp.composecourse.NavigationDrawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailedDrawerExample() {

    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed
    )

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Column(modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .verticalScroll(
                        rememberScrollState()
                    )) {

                    Text("Drawer Title")

                    HorizontalDivider()

                    Text("Content Of Drawer")
                }

                NavigationDrawerItem(label = { Text("Item 1") }, selected = false, onClick = {})

                NavigationDrawerItem(label = { Text("Item 2") }, selected = false, onClick = {})

                NavigationDrawerItem(label = { Text("Item 3") }, selected = false, onClick = {})


            }
        },
        drawerState = drawerState
    ) {

        Scaffold(topBar = {
            TopAppBar(title = { Text(" NavigationDrawer") },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            scope.launch {
                                if (drawerState.isClosed) {
                                    drawerState.open()
                                } else {
                                    drawerState.close()
                                }
                            }
                        }
                    )
                    { }
                })

        }
        ) {innerPadding ->

        }


    }

}

@Preview(showSystemUi = true)
@Composable
fun DetailedDrawerExamplePreview() {
    DetailedDrawerExample()
}