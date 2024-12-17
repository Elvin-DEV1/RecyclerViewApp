package com.example.recyclerview.book

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemBookBinding

class BookAdapter(private val list: List<Book>?) :
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val binding = ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookViewHolder(binding)
    }

    override fun getItemCount(): Int {
        if (list!=null){
            return list.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = list?.get(position)
        if (book!= null){
            holder.bind(book)
        }
    }

    inner class BookViewHolder(private val binding: ItemBookBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book) {
            with(binding) {
                imgBook.setImageResource(book.resourceImage)
                tvBook.text = book.name
            }
        }
    }
}