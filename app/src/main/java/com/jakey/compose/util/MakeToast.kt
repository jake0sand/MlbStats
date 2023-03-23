package com.jakey.compose.util

import android.content.Context
import android.widget.Toast

fun makeToast(context: Context, message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, "$message", length).show()
}