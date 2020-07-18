package com.harvdev.mynotesroom.ui

import android.content.Context
import android.webkit.ConsoleMessage
import android.widget.Toast


fun Context.toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()