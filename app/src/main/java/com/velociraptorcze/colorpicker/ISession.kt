/**
    ColorPickerNative
    Copyright (C) Simon Raichl 2018
    MIT License
*/

package com.velociraptorcze.colorpicker

interface ISession {
    val url : String
    val jsEnabled : Boolean
    fun run()
}