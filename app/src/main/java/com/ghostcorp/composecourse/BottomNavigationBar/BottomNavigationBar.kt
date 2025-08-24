/*
package com.ghostcorp.composecourse.BottomNavigationBar

import androidx.collection.mutableIntSetOf
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(val name:String,val icon:ImageVector,val unselectedIcon:ImageVector)

@Composable
fun BottomNavigationBarEx () {

    val selectedItem by remember { mutableIntStateOf(0) }

    var bottomNavItem = listOf(
        BottomNavItem(
            name = "Home",
            icon = Icons.Default.Home,
            unselectedIcon = Icons.Outlined.Home
        ),

        BottomNavItem(
            name = "WishList",
            icon = Icons.Default.Favorite,
            unselectedIcon = Icons.Outlined.Favorite
        ),

        BottomNavItem(
            name = "Cart",
            icon = Icons.Default.ShoppingCart,
            unselectedIcon = Icons.Outlined.ShoppingCart
        ),

        BottomNavItem(
            name = "Profile",
            icon = Icons.Default.Person,
            unselectedIcon = Icons.Outlined.Person
        )
    )

    Scaffold(
        bottomBar = {
            Surface(modifier = Modifier.fillMaxWidth().padding(
                bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding())
            ) {
               BottomAppBar(item) {  }
            }
        }
    ) { innerPadding ->

    }

}*/
