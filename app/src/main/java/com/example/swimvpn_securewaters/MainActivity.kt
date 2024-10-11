package com.example.swimvpn_securewaters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.swimvpn_securewaters.navigation.AppNavigation
import com.example.swimvpn_securewaters.ui.theme.VPNTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VPNTheme {
                AppNavigation()
            }
        }
    }
}
