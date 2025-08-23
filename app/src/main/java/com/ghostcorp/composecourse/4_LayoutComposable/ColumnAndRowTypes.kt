package com.ghostcorp.composecourse.`4_LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample() {

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text("Lazycolumn preferred for the list")

        LazyColumn(
            modifier = Modifier.fillMaxWidth().height(200.dp).background(Color.LightGray)
        ) {
            items(100) { index ->
                Text(
                    text = "Item $index",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.White),
                    )
            }
        }
    }

}

@Composable
fun LazyRowExample() {

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text("Lazycolumn preferred for the list")

        LazyRow(
            modifier = Modifier.fillMaxWidth().height(200.dp).background(Color.LightGray)
        ) {
            items(100) { index ->
                Text(
                    text = "Item $index",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.White),
                )
            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun LazyColumnExamplePreview() {
    LazyRowExample()
}
