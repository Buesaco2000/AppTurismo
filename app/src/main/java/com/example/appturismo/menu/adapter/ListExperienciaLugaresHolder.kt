package com.example.appturismo.menu.adapter

import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListExperienciasLugaresview


class ListExperienciaLugaresHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nameTitle = view.findViewById<TextView>(R.id.title)
    val favorite = view.findViewById<FrameLayout>(R.id.favorito)
    val image = view.findViewById<ImageView>(R.id.imageView)
    val stars1 = view.findViewById<ImageView>(R.id.estrella1)
    val stars2 = view.findViewById<ImageView>(R.id.estrella2)
    val stars3 = view.findViewById<ImageView>(R.id.estrella3)
    val stars4 = view.findViewById<ImageView>(R.id.estrella4)
    val stars5 = view.findViewById<ImageView>(R.id.estrella5)

    fun render(listViewModel: ListExperienciasLugaresview) {
        nameTitle.text = listViewModel.name
        Glide.with(image.context).load(listViewModel.image).into(image)
        favorite.setBackgroundResource(listViewModel.favorite)
        stars1.setImageResource(listViewModel.star1)
        stars2.setImageResource(listViewModel.star2)
        stars3.setImageResource(listViewModel.star3)
        stars4.setImageResource(listViewModel.star4)
        stars5.setImageResource(listViewModel.star5)
    }

}