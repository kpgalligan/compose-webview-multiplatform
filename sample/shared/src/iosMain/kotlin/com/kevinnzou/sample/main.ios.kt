package com.kevinnzou.sample

import androidx.compose.ui.window.ComposeUIViewController
import co.touchlab.kermit.Logger

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController {
    Logger.v { "Verbose" }
    Logger.d { "Debug" }
    Logger.i { "Info" }
    Logger.w { "Warn" }
    Logger.e { "Error" }
    WebViewApp()
}