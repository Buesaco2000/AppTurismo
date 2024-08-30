package com.example.appturismo.menu.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appturismo.menu.ListLugaresView
import com.example.appturismo.R

class ListLugaresViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val nameTitle = view.findViewById<TextView>(R.id.tvName)
    val image = view.findViewById<ImageView>(R.id.ivImage)

    fun render(listViewModel: ListLugaresView){
        nameTitle.text = listViewModel.name
    }
}