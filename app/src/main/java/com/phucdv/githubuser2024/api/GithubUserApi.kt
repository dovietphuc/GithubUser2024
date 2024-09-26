package com.phucdv.githubuser2024.api

import com.phucdv.githubuser2024.models.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubUserApi {

    @GET("users")
    fun getUsers() : Call<List<User>>

    @GET("users/{id}")
    fun getUser(@Path("id") id: Int) : Call<User>
}