package com.example.recyclerview.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.book.BookAdapter
import com.example.recyclerview.databinding.ItemCategoryBinding

class CategoryAdapter(private val list: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = list[position]
        holder.bind(category)
    }

    inner class CategoryViewHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(category: Category) {
            with(binding) {
                tvCategory.text = category.nameCategory

                val bookAdapter = BookAdapter(category.books)
                binding.rcvBook.apply {
                    layoutManager = LinearLayoutManager(
                        binding.root.context,
                        RecyclerView.HORIZONTAL,
                        false
                    )
                    adapter = bookAdapter
                }
            }
        }
    }
}