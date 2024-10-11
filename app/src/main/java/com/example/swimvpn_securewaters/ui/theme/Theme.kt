package com.example.swimvpn_securewaters.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    background = GrayMain,
    onBackground = WhiteMain,
    primary = GrayMain,
    secondary = GrayDark,
    tertiary = DarkGreenIcons,

)

private val LightColorScheme = lightColorScheme(
    background = GrayMain,
    onBackground = WhiteMain,
    primary = GrayMain,
    secondary = GrayDark,
    tertiary = DarkGreenIcons,
)

@Composable
fun VPNTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        DarkColorScheme
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}