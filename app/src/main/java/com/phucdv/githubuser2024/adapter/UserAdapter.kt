package com.phucdv.githubuser2024.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.phucdv.githubuser2024.databinding.UserItemBinding
import com.phucdv.githubuser2024.models.User

class UserAdapter : Adapter<UserAdapter.UserViewHolder>() {

    var data: List<User> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class UserViewHolder(val binding: UserItemBinding) : ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.txtUsername.text = user.userName
            Glide.with(binding.imgAvatar)
                .load(user.avatarUrl)
                .circleCrop()
                .into(binding.imgAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(data[position])
    }
}