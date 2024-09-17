package com.example.appturismo.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListLugaresMenuView

class ListLugaresMenuViewAdapter(private val lugaresMenuList: List<ListLugaresMenuView>) : RecyclerView.Adapter<ListLugaresMenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListLugaresMenuViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ListLugaresMenuViewHolder(layoutInflater.inflate(R.layout.item_lugares, parent, false))
    }

    override fun getItemCount(): Int = lugaresMenuList.size

    override fun onBindViewHolder(holder: ListLugaresMenuViewHolder, position: Int) {
        val item = lugaresMenuList[position]
        holder.render(item)
    }
}