package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var itemAdapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecycler(getListItem())

    }

    private fun getListItem() : MutableList<String>{
        val list = mutableListOf<String>()
        for (i in 0..30){
            list.add("Item: $i")
        }
        return list
    }

    private fun setUpRecycler(list: MutableList<String>) {
        itemAdapter = ItemAdapter(list)
        binding.rcvItem.apply {
            adapter = itemAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)

            val divider = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
            addItemDecoration(divider)
            val itemTouchHelper = ItemTouchHelper(createItemTouchHelperCallback())
            itemTouchHelper.attachToRecyclerView(binding.rcvItem)
        }
    }

    private fun createItemTouchHelperCallback(): ItemTouchHelper.Callback {
        return object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        ){
            override fun onMove(
                recyclerView: RecyclerView,
                dragged: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                val fromPosition = dragged.absoluteAdapterPosition
                val toPosition  = target.absoluteAdapterPosition
                itemAdapter.moveItem(fromPosition, toPosition )
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.absoluteAdapterPosition
                itemAdapter.removeItem(position)
            }
        }
    }
}