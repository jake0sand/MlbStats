package com.jakey.compose.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PrimaryPosition(
    @Json(name = "abbreviation")
    val abbreviation: String = "",
    @Json(name = "code")
    val code: String = "",
    @Json(name = "name")
    val name: String = "",
    @Json(name = "type")
    val type: String = ""
)