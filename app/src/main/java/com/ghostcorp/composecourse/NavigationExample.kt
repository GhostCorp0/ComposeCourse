/*
package com.ghostcorp.composecourse

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class User(
    val id: Int,
    val name: String,
    val email: String
)

@Composable
fun NavigationExample() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            AnimatedNavigationBar(
                selectedIndex = getCurrentRouteIndex(navController),
                onItemSelected = { index ->
                    when (index) {
                        0 -> navController.navigate("home") {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                        1 -> navController.navigate("profile") {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                        2 -> navController.navigate("settings") {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }
                }
            ) {
                AnimatedNavigationBarItem(
                    icon = { Text("🏠") },
                    title = { Text("Home") },
                    selected = getCurrentRouteIndex(navController) == 0
                )
                AnimatedNavigationBarItem(
                    icon = { Text("👤") },
                    title = { Text("Profile") },
                    selected = getCurrentRouteIndex(navController) == 1
                )
                AnimatedNavigationBarItem(
                    icon = { Text("⚙️") },
                    title = { Text("Settings") },
                    selected = getCurrentRouteIndex(navController) == 2
                )
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("home") {
                HomeScreen()
            }
            composable("profile") {
                ProfileScreen()
            }
            composable("settings") {
                SettingsScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Screen",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Example of KotlinX Serialization
        val user = User(1, "John Doe", "john@example.com")
        val json = Json.encodeToString(User.serializer(), user)

        Text("Serialized User: $json")

        Spacer(modifier = Modifier.height(16.dp))

        // Deserialize example
        val deserializedUser = Json.decodeFromString(User.serializer(), json)
        Text("Deserialized User: ${deserializedUser.name}")
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Profile Screen",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("This is the profile screen with animated navigation!")
    }
}

@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Settings Screen",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("This is the settings screen with animated navigation!")
    }
}

private fun getCurrentRouteIndex(navController: NavHostController): Int {
    return when (navController.currentDestination?.route) {
        "home" -> 0
        "profile" -> 1
        "settings" -> 2
        else -> 0
    }
}
*/
