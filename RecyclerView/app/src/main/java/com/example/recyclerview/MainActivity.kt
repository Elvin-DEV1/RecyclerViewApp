package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        setUpRecycler(getListUser())
    }

    private fun getListUser(): List<User> {
        return listOf(
            User(R.drawable.anh_1, "anh 1", true),
            User(R.drawable.anh_2, "anh 2", true),
            User(R.drawable.anh_3, "anh 3", true),
            User(R.drawable.anh_manutd, "anh manutd", true),
            User(R.drawable.anh_1, "anh 1", true),
            User(R.drawable.anh_2, "anh 2", true),
            User(R.drawable.anh_3, "anh 3", true),
            User(R.drawable.anh_manutd, "anh manutd", true),
            User(R.drawable.anh_1, "anh 1", true),
            User(R.drawable.anh_2, "anh 2", true),
            User(R.drawable.anh_3, "anh 3", true),
            User(R.drawable.anh_manutd, "anh manutd", true),
            User(R.drawable.anh_1, "anh 1", true),
            User(R.drawable.anh_2, "anh 2", true),
            User(R.drawable.anh_3, "anh 3", true),
            User(R.drawable.anh_manutd, "anh manutd", true),
            User(R.drawable.anh_1, "anh 1", false),
            User(R.drawable.anh_2, "anh 2", false),
            User(R.drawable.anh_3, "anh 3", false),
            User(R.drawable.anh_manutd, "anh manutd", false),
            User(R.drawable.anh_1, "anh 1", false),
            User(R.drawable.anh_2, "anh 2", false),
            User(R.drawable.anh_3, "anh 3", false),
            User(R.drawable.anh_manutd, "anh manutd", false),
            User(R.drawable.anh_1, "anh 1", false),
            User(R.drawable.anh_2, "anh 2", false),
            User(R.drawable.anh_3, "anh 3", false),
            User(R.drawable.anh_manutd, "anh manutd", false),
            User(R.drawable.anh_1, "anh 1", false),
            User(R.drawable.anh_2, "anh 2", false),
            User(R.drawable.anh_3, "anh 3", false),
            User(R.drawable.anh_manutd, "anh manutd", false),
            User(R.drawable.anh_1, "anh 1", false),
            User(R.drawable.anh_2, "anh 2", false),
            User(R.drawable.anh_3, "anh 3", false),
            User(R.drawable.anh_manutd, "anh manutd", false)
        )
    }

    private fun setUpRecycler(list: List<User>) {
        userAdapter = UserAdapter(list)
        binding.rcvUser.apply {
            adapter = userAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        }
    }
}