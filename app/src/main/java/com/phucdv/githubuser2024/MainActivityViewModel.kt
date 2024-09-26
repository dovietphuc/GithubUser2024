package com.phucdv.githubuser2024

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.phucdv.githubuser2024.api.GITHUB_USER
import com.phucdv.githubuser2024.models.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {

    private val _users = MutableStateFlow<List<User>>(emptyList())
    val user = _users.asStateFlow()

    init {
        viewModelScope.launch {
            _users.value = withContext(Dispatchers.IO) {
                GITHUB_USER.getUsers().execute().body() ?: emptyList()
            }
        }
    }
}