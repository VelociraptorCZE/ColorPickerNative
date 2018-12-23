/**
    ColorPickerNative
    Copyright (C) Simon Raichl 2018
    MIT License
*/

package com.velociraptorcze.colorpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main : AppCompatActivity(), IMain {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        initApp()
    }

    private fun initApp() {
        Session(findViewById(R.id.coreView), this)
    }
}
