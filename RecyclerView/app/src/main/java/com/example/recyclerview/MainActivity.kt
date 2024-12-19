package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.category.Category
import com.example.recyclerview.category.CategoryAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.user.User
import com.example.recyclerview.user.UserAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userAdapter: UserAdapter
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerViews()

    }

    private fun getListUser(): List<User> {
        return listOf(
            User(R.drawable.anh_1, "anh 1"),
            User(R.drawable.anh_2, "anh 2"),
            User(R.drawable.anh_3, "anh 3"),
            User(R.drawable.anh_manutd, "anh manutd"),
            User(R.drawable.anh_1, "anh 1"),
            User(R.drawable.anh_2, "anh 2"),
            User(R.drawable.anh_3, "anh 3"),
            User(R.drawable.anh_manutd, "anh manutd"),
            User(R.drawable.anh_1, "anh 1"),
            User(R.drawable.anh_2, "anh 2"),
            User(R.drawable.anh_3, "anh 3"),
            User(R.drawable.anh_manutd, "anh manutd"),
            User(R.drawable.anh_1, "anh 1"),
            User(R.drawable.anh_2, "anh 2"),
            User(R.drawable.anh_3, "anh 3"),
            User(R.drawable.anh_manutd, "anh manutd"),
            User(R.drawable.anh_1, "anh 1"),
            User(R.drawable.anh_2, "anh 2"),
            User(R.drawable.anh_3, "anh 3"),
            User(R.drawable.anh_manutd, "anh manutd"),
            User(R.drawable.anh_1, "anh 1"),
            User(R.drawable.anh_2, "anh 2"),
            User(R.drawable.anh_3, "anh 3"),
            User(R.drawable.anh_manutd, "anh manutd")
        )
    }

    private fun getListCategory(): List<Category> {
        return listOf(
            Category(R.drawable.anh_1, "anh 1"),
            Category(R.drawable.anh_2, "anh 2"),
            Category(R.drawable.anh_3, "anh 3"),
            Category(R.drawable.anh_manutd, "anh manutd"),
            Category(R.drawable.anh_1, "anh 1"),
            Category(R.drawable.anh_2, "anh 2"),
            Category(R.drawable.anh_3, "anh 3"),
            Category(R.drawable.anh_manutd, "anh manutd"),
            Category(R.drawable.anh_1, "anh 1"),
            Category(R.drawable.anh_2, "anh 2"),
            Category(R.drawable.anh_3, "anh 3"),
            Category(R.drawable.anh_manutd, "anh manutd"),
            Category(R.drawable.anh_1, "anh 1"),
            Category(R.drawable.anh_2, "anh 2"),
            Category(R.drawable.anh_3, "anh 3"),
            Category(R.drawable.anh_manutd, "anh manutd"),
            Category(R.drawable.anh_1, "anh 1"),
            Category(R.drawable.anh_2, "anh 2"),
            Category(R.drawable.anh_3, "anh 3"),
            Category(R.drawable.anh_manutd, "anh manutd"),
            Category(R.drawable.anh_1, "anh 1"),
            Category(R.drawable.anh_2, "anh 2"),
            Category(R.drawable.anh_3, "anh 3"),
            Category(R.drawable.anh_manutd, "anh manutd")
        )
    }

    private fun setupRecyclerViews() {
        categoryAdapter = CategoryAdapter(getListCategory())
        userAdapter = UserAdapter(getListUser())

        binding.rcvCategory.apply {
            adapter = categoryAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            isNestedScrollingEnabled = false
        }

        binding.rcvUser.apply {
            adapter = userAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            isNestedScrollingEnabled = false
        }
    }
}