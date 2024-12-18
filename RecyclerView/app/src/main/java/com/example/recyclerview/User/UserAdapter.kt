package com.example.recyclerview.User

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerview.databinding.ItemUserFeaturedBinding
import com.example.recyclerview.databinding.ItemUserNormalBinding

class UserAdapter(private val list: List<User>) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when (viewType) {
            Type.Featured.value -> {
                val binding = ItemUserFeaturedBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                UserFeaturedViewHolder(binding)
            }
            else -> {
                val binding = ItemUserNormalBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                UserNormalViewHolder(binding)
            }
        }
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = list[position]
        when (holder) {
            is UserFeaturedViewHolder -> holder.bind(user)
            is UserNormalViewHolder -> holder.bind(user)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (list[position].isFeatured) {
            Type.Featured.value
        } else {
            Type.Normal.value
        }
    }

    enum class Type(val value: Int) {
        Featured(1), Normal(2)
    }

    inner class UserFeaturedViewHolder(private val binding: ItemUserFeaturedBinding) :
        ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.apply {
                imgUserFeatured.setImageResource(user.resourceImage)
                tvUserFeatured.text = user.name
            }
        }
    }

    inner class UserNormalViewHolder(private val binding: ItemUserNormalBinding) :
        ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.apply {
                imgUserNormal.setImageResource(user.resourceImage)
                tvUserNormal.text = user.name
            }
        }
    }
}