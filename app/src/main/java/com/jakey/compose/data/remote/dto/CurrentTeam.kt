package com.jakey.compose.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrentTeam(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "link")
    val link: String = ""
)