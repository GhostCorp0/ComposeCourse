package com.ghostcorp.composecourse.`16_SearchBar`

import android.text.TextUtils.replace
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text2.input.TextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SearchScreen() {

    var textFieldState = remember { TextFieldState() }
    var searchResults by remember { mutableStateOf(listOf <String>()) }

    val onSearch : (String) -> Unit = { query ->
        searchResults = listOf(
            "result1 for $query",
            "result2 for $query",
            "result3 for $query",
        )
    }

    SimpleSearchTextField(
        textFieldState = textFieldState,
        onSearch = onSearch,
        searchResults = searchResults
    )

}

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun SimpleSearchTextField(
    textFieldState: TextFieldState,
    onSearch: (String) -> Unit,
    searchResults: List<String>,
    modifier: Modifier = Modifier
) {

    var expanded by rememberSaveable { mutableStateOf(false) }

    Box(modifier.fillMaxSize().padding(16.dp).semantics {
        isTraversalGroup = true
    }) {
        SearchBar(
            modifier = Modifier.align(Alignment.TopCenter).semantics { isTraversalGroup = true },
            query = textFieldState.text.toString(),
            onQueryChange = {
                textFieldState.edit {
                    replace(0, length, it)
                }
                onSearch(it)
            },
            onSearch = {
                onSearch(textFieldState.text.toString())
                expanded = false
            },
            placeholder = { Text("Search") },
            active = expanded,
            onActiveChange = { expanded = it },
            enabled = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            },
            trailingIcon = {
                if (expanded) {
                    Icon(
                        modifier = Modifier.clickable {
                            if (textFieldState.text.isNotEmpty()) {
                                textFieldState.edit {
                                    replace(0, length, "")
                                }
                            } else {
                                expanded = false
                            }
                        },
                        imageVector = Icons.Default.Close,
                        contentDescription = "Clear or close"
                    )
                }
            },
            shape = SearchBarDefaults.inputFieldShape,
            colors = SearchBarDefaults.colors(),
            tonalElevation = SearchBarDefaults.TonalElevation,
            shadowElevation = SearchBarDefaults.ShadowElevation,
            windowInsets = SearchBarDefaults.windowInsets,
            interactionSource = remember { MutableInteractionSource() }
        ) {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                searchResults.forEach { result ->
                    ListItem(
                        headlineContent = { Text(result) },
                        modifier = Modifier.clickable {
                            textFieldState.edit {
                                replace(0, length, result)
                            }
                            expanded = false
                        }.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SearchScreenPreview() {
    SearchScreen()
}






