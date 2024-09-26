package com.phucdv.githubuser2024.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("login")
    @Expose
    val userName: String,
    @SerializedName("avatar_url")
    @Expose
    val avatarUrl: String
)