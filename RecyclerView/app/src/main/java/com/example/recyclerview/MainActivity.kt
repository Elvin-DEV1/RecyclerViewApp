package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.User.User
import com.example.recyclerview.User.UserAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUserLRecycler(getListUser())
    }

    private fun getListUser(): MutableList<User> {
        val list = mutableListOf<User>()
        list.add(User(R.drawable.anh_1, "anh 1"))
        list.add(User(R.drawable.anh_2, "anh 2"))
        list.add(User(R.drawable.anh_3, "anh 3"))
        list.add(User(R.drawable.co_goc_manutd, "co goc manutd"))
        list.add(User(R.drawable.manutd, "manutd"))
        list.add(User(R.drawable.anh_manutd, "anh manutd"))
        list.add(User(R.drawable.anh_1, "anh 1"))
        list.add(User(R.drawable.anh_2, "anh 2"))
        list.add(User(R.drawable.anh_3, "anh 3"))
        list.add(User(R.drawable.co_goc_manutd, "co goc manutd"))
        list.add(User(R.drawable.manutd, "manutd"))
        list.add(User(R.drawable.anh_manutd, "anh manutd"))
        list.add(User(R.drawable.anh_1, "anh 1"))
        list.add(User(R.drawable.anh_2, "anh 2"))
        list.add(User(R.drawable.anh_3, "anh 3"))
        list.add(User(R.drawable.co_goc_manutd, "co goc manutd"))
        list.add(User(R.drawable.manutd, "manutd"))
        list.add(User(R.drawable.anh_manutd, "anh manutd"))
        list.add(User(R.drawable.anh_1, "anh 1"))
        list.add(User(R.drawable.anh_2, "anh 2"))
        list.add(User(R.drawable.anh_3, "anh 3"))
        list.add(User(R.drawable.co_goc_manutd, "co goc manutd"))
        list.add(User(R.drawable.manutd, "manutd"))
        list.add(User(R.drawable.anh_manutd, "anh manutd"))
        list.add(User(R.drawable.anh_1, "anh 1"))
        list.add(User(R.drawable.anh_2, "anh 2"))
        list.add(User(R.drawable.anh_3, "anh 3"))
        list.add(User(R.drawable.co_goc_manutd, "co goc manutd"))
        list.add(User(R.drawable.manutd, "manutd"))
        list.add(User(R.drawable.anh_manutd, "anh manutd"))
        list.add(User(R.drawable.anh_1, "anh 1"))
        list.add(User(R.drawable.anh_2, "anh 2"))
        list.add(User(R.drawable.anh_3, "anh 3"))
        list.add(User(R.drawable.co_goc_manutd, "co goc manutd"))
        list.add(User(R.drawable.manutd, "manutd"))
        list.add(User(R.drawable.anh_manutd, "anh manutd"))
        return list
    }

    private fun setupUserLRecycler(list: MutableList<User>) {
        userAdapter = UserAdapter(list)
        binding.rcvUser.apply {
            adapter = userAdapter
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        }
    }
}