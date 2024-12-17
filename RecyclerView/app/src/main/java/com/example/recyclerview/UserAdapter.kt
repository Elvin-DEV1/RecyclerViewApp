package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemUserBinding

class UserAdapter(
    private var list: List<User>?
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserAdapter.UserViewHolder, position: Int) {
        val user = list?.get(position)
        if (user != null) {
            holder.bind(user)
        }
    }

    override fun getItemCount(): Int {
        if (list != null) {
            return list!!.size
        }
        return 0
    }

    inner class UserViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            with(binding) {
                imgUser.setImageResource(user.resourceImage)
                txtName.text = user.name
            }
        }
    }
}