package com.example.pz5blipi.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = GreenAccent,
    background = DarkBackground,
    surface = GreenAccent,
    onPrimary = White,
    onBackground = White
)

private val LightColorScheme = lightColorScheme(
    primary = GreenAccent,
    background = DarkBackground,
    surface = GreenAccent,
    onPrimary = White,
    onBackground = White
)

@Composable
fun PZ5BlipiTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}