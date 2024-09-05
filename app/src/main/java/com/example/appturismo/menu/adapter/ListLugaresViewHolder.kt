package com.example.appturismo.menu.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListLugaresView

class ListLugaresViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nameTitle = view.findViewById<TextView>(R.id.tvName1)
    val image = view.findViewById<ImageView>(R.id.ivImage1)

    fun render(listViewModel: ListLugaresView) {
        nameTitle.text = listViewModel.name
        Glide.with(image.context).load(listViewModel.image).into(image)
    }
}