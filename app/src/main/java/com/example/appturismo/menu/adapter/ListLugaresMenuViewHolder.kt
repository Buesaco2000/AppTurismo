package com.example.appturismo.menu.adapter

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListLugaresMenuView

class ListLugaresMenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nameTitle = view.findViewById<TextView>(R.id.tvName2)
    val image = view.findViewById<ImageView>(R.id.imageView1)
    val calificacion = view.findViewById<TextView>(R.id.calificacion)
    val button = view.findViewById<Button>(R.id.buttonV)
    val stars = view.findViewById<ImageView>(R.id.start)

    fun render(listViewModel: ListLugaresMenuView) {
        nameTitle.text = listViewModel.name
        Glide.with(image.context).load(listViewModel.image).into(image)
        calificacion.text = listViewModel.calificacion
        button.text = listViewModel.button
        stars.setImageResource(listViewModel.stars)
    }
}