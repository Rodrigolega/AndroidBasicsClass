package com.rodrigolega.androidbasicsclass.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rodrigolega.androidbasicsclass.ui.ui.navigation.AppNavigation
import com.rodrigolega.androidbasicsclass.ui.ui.theme.AndroidBasicsClassTheme

/** Entry point activity. Hosts [AppNavigation] inside [AndroidBasicsClassTheme]. */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicsClassTheme {
                AppNavigation()
            }
        }
    }
}
