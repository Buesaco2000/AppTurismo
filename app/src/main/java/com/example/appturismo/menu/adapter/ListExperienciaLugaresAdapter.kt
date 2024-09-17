package com.example.appturismo.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListExperienciasLugaresview

class ListExperienciaLugaresAdapter(private val experienciaList: List<ListExperienciasLugaresview>) :
    RecyclerView.Adapter<ListExperienciaLugaresHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListExperienciaLugaresHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ListExperienciaLugaresHolder(
            layoutInflater.inflate(
                R.layout.item_buscar,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = experienciaList.size

    override fun onBindViewHolder(holder: ListExperienciaLugaresHolder, position: Int) {
        val item = experienciaList[position]
        holder.render(item)
    }

}