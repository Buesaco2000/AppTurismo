package com.example.appturismo.menu.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListEventosView

class ListEventosViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nameTitle = view.findViewById<TextView>(R.id.tvName)
    val image = view.findViewById<ImageView>(R.id.ivImage)
    val stars1 = view.findViewById<ImageView>(R.id.ivStar1)
    val stars2 = view.findViewById<ImageView>(R.id.ivStar2)
    val stars3 = view.findViewById<ImageView>(R.id.ivStar3)
    val stars4 = view.findViewById<ImageView>(R.id.ivStar4)
    val stars5 = view.findViewById<ImageView>(R.id.ivStar5)
    val description = view.findViewById<TextView>(R.id.tvDescription)
    val comment = view.findViewById<ImageView>(R.id.ivComment)

    fun render(listViewModel: ListEventosView) {
        nameTitle.text = listViewModel.name
        description.text = listViewModel.description
        Glide.with(image.context).load(listViewModel.image).into(image)
    }
}