package com.ghostcorp.composecourse.BottomNavigationBar

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

data class BottomBarItem(
    val name: String,
    val route: String,
    val icon: ImageVector
)

/*
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarExample() {
    val navController = rememberNavController()
    var selectedItem by remember { mutableStateOf(0) }
    
    val items = listOf(
        BottomBarItem("Home", "home", Icons.Default.Home),
        BottomBarItem("Search", "search", Icons.Default.Search),
        BottomBarItem("Favorites", "favorites", Icons.Default.Favorite),
        BottomBarItem("Profile", "profile", Icons.Default.Person)
    )

    Scaffold(
        bottomBar = {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
                    )
            ) {
                AnimatedNavigationBar(
                    selectedIndex = selectedItem,
                    onItemSelected = { index ->
                        selectedItem = index
                        navController.navigate(items[index].route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                ) {
                    items.forEachIndexed { index, item ->
                        AnimatedNavigationBarItem(
                            icon = { Icon(item.icon, contentDescription = item.name) },
                            title = { Text(item.name) },
                            selected = selectedItem == index
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        // Content area
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            when (selectedItem) {
                0 -> HomeContent()
                1 -> SearchContent()
                2 -> FavoritesContent()
                3 -> ProfileContent()
            }
        }
    }
}
*/

@Composable
fun HomeContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Home Screen",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Welcome to the home screen!",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun SearchContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search",
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Search Screen",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Search for something here!",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun FavoritesContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Favorites",
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Favorites Screen",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Your favorite items will appear here!",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun ProfileContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Profile",
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Profile Screen",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Manage your profile settings here!",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
