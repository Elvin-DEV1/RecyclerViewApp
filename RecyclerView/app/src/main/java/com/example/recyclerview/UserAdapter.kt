package com.example.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemUserBinding

class UserAdapter(
    private var listUser : List<User>?
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        if (listUser!=null){
            return listUser!!.size // !! chắc chắn biến không null
        }
        return 0
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = listUser?.get(position)
        if (user != null) {
            holder.bind(user)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(userList: List<User>){
        this.listUser = userList
        notifyDataSetChanged()
    }

    inner class UserViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(user: User){
                with(binding){
                    imgUser.setImageResource(user.resourceImage.toInt())
                    tvName.text = user.name
                }
            }
    }
}