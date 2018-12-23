/**
    ColorPickerNative
    Copyright (C) Simon Raichl 2018
    MIT License
*/

package com.velociraptorcze.colorpicker

import android.content.Context
import android.webkit.WebView
import android.widget.Toast

class Session(private val window: WebView, private val app: Context) : ISession {

    override val url : String = "file:///android_asset/core/colorpicker.html"
    override val jsEnabled = true

    init {
        run()
    }

    override fun run() {
        window.settings.javaScriptEnabled = jsEnabled
        try {
            window.loadUrl(url)
        }
        catch (e: Exception) {
            Toast.makeText(app, "Something went wrong - $e", Toast.LENGTH_SHORT).show()
        }
    }
}