package com.phucdv.githubuser2024.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val RETROFIT: Retrofit by lazy {
    Retrofit.Builder()
        .client(OkHttpClient())
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

val GITHUB_USER: GithubUserApi by lazy {
    RETROFIT.create(GithubUserApi::class.java)
}