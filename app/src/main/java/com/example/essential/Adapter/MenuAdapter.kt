package com.example.essential.Adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.essential.databinding.ActivityMainBinding

class MenuAdapter(var conext:Context):
 RecyclerView.Adapter<MenuAdapter.VH>(){

    inner class VH(var binding: ActivityMainBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        TODO("Not yet implemented")
    }
}