package com.example.appturismo.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListEventosView

class ListEventosViewAdapter(private val eventosList: List<ListEventosView>) : RecyclerView.Adapter<ListEventosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListEventosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ListEventosViewHolder(layoutInflater.inflate(R.layout.item_listview, parent, false))
    }

    override fun onBindViewHolder(holder: ListEventosViewHolder, position: Int) {
        val item = eventosList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = eventosList.size
}