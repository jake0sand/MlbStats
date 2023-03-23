package com.jakey.compose.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatSide(
    @Json(name = "code")
    val code: String = "",
    @Json(name = "description")
    val description: String = ""
)