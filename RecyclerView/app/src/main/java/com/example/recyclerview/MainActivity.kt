package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var userAdapter: UserAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        setupUserLRecycler(getListUser())
    }


    private fun getListUser(): MutableList<User> {
        val list = mutableListOf<User>()

        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))
        list.add(User(R.drawable.anh_1.toString(), "anh 1"))
        list.add(User(R.drawable.anh_2.toString(), "anh 2"))
        list.add(User(R.drawable.anh_3.toString(), "anh 3"))
        list.add(User(R.drawable.anh_manutd.toString(), "anh manutd"))

        return list
    }

    private fun setupUserLRecycler(list: MutableList<User>) {
        userAdapter = UserAdapter(list)
        binding.rcvUser.apply {
            adapter = userAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 3)
        }
    }
}