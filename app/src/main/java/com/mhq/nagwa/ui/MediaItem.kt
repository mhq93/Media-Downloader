package com.mhq.nagwa.ui

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MediaItem (
    @SerialName("id")
    val mediaItemId: Int,
    @SerialName("type")
    val mediaItemType: String,
    @SerialName("url")
    val mediaItemUrl: String,
    @SerialName("name")
    val mediaItemName: String
)