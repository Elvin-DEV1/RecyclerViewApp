package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.book.Book
import com.example.recyclerview.category.Category
import com.example.recyclerview.category.CategoryAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupCategoryLRecycler(getListCategory())

    }

    private fun getListCategory(): MutableList<Category> {
        val listCategory = mutableListOf<Category>()

        val list = mutableListOf<Book>()
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))
        list.add(Book(R.drawable.anh_1, "anh 1"))
        list.add(Book(R.drawable.anh_2, "anh 2"))
        list.add(Book(R.drawable.anh_3, "anh 3"))
        list.add(Book(R.drawable.anh_manutd, "anh manutd"))

        listCategory.add(Category("Category 1", list))
        listCategory.add(Category("Category 2", list))
        listCategory.add(Category("Category 3", list))
        listCategory.add(Category("Category 4", list))
        listCategory.add(Category("Category 5", list))
        listCategory.add(Category("Category 6", list))
        listCategory.add(Category("Category 7", list))
        return listCategory
    }

    private fun setupCategoryLRecycler(list: MutableList<Category>) {
        categoryAdapter = CategoryAdapter(list)
        binding.rcvCategory.apply {
            adapter = categoryAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        }
    }
}