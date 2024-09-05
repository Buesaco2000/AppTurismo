package com.example.appturismo.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListLugaresView

class ListLugaresViewAdapter(private val lugaresList: List<ListLugaresView>) :
    RecyclerView.Adapter<ListLugaresViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListLugaresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  ListLugaresViewHolder(layoutInflater.inflate(R.layout.item_lugares, parent, false))
    }

    override fun onBindViewHolder(holder: ListLugaresViewHolder, position: Int) {
        val item = lugaresList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = lugaresList.size
}