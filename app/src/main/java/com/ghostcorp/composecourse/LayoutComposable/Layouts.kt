package com.ghostcorp.composecourse.LayoutComposable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp)
            .background(Color.Blue)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("text 1 ")
        Text("text 2 ")
        Text("text 3 ")
        Text("text 4 ")
    }
}

@Composable
fun RowExample() {

    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Text("text 1 ")
        Text("text 2 ")
        Text("text 3 ")
        Text("text 4 ")
    }
}

@Composable
fun BoxSample() {

    Box(modifier = Modifier.size(200.dp).background(Color.Red), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.size(150.dp).background(Color.Blue)) {

        }
    }
}


/*@Composable
fun ConstraintLayoutExample() {

    Column {
        ConstraintLayout(
            modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.LightGray)
        ) {

            val (text1,text2,text3) = createRefs()

        }
    }

}*/

/*
@Preview(showSystemUi = true)
@Composable
fun ColumnExamplePreview() {
    ConstraintLayoutExample()
}*/
