package com.ghostcorp.composecourse.`15_PullToRefresh`

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch



@Composable
fun PullToRefreshScreen () {

    val scope = rememberCoroutineScope()

    var isRefreshing by remember {
        mutableStateOf(false)
    }

    var items by remember {
        mutableStateOf(List(20){"item $it"})
    }

    fun refreshItem() {
        scope.launch {
            isRefreshing = true
            delay(2000)
            items = items.shuffled()
            isRefreshing = false
        }
    }

}

/*
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshIndicatorSample(
    items:List<String>,
    isRefreshing:Boolean,
    onRefresh:() -> Unit,
    modifier: Modifier = Modifier
) {
    val state = rememberPullToRefreshState()
    PullToRefreshBox(
        isRefreshing = isRefreshing,
        onRefresh = onRefresh,
        modifier = modifier,
        indicatr
    ) {
        LazyColumn(Modifier.fillMaxSize()) {
            items(items) { item ->
                ListItem(
                    headlineContent = { Text(text = item) }
                )
            }
        }
    }
}*/
