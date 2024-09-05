package com.example.appturismo.menu.Provider

import com.example.appturismo.R

class ListExperienciaLugaresProvider {
    companion object {
        val experienciasList = listOf<ListExperienciasLugaresview>(
            ListExperienciasLugaresview(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Catedralpopayan.jpg/220px-Catedralpopayan.jpg",
                "Parque Caldas",
                R.drawable.favorite_border,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali
            ),
            ListExperienciasLugaresview(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYnbaVJqCp1Tf8ehxjHNi0iFQ8qeEBxIMzaQ&s",
                "Puente Humilladero ",
                R.drawable.favorite_border,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali
            ),
            ListExperienciasLugaresview(
                "https://media-cdn.tripadvisor.com/media/photo-s/08/d3/dd/82/rincon-payanes.jpg",
                "Pueblito Patojo",
                R.drawable.favorite_border,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali
            ),
            ListExperienciasLugaresview(
                "https://www.proclamadelcauca.com/wp-content/uploads/2020/09/El-Morro-de-Tulcan-en-Popayan-es-Patrimonio-Arqueologico-de-la-Nacion.jpg",
                "El Morro",
                R.drawable.favorite_border,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali,
                R.drawable.star_cali
            ),
        )
    }
}