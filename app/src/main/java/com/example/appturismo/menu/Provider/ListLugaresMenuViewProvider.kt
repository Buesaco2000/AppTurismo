package com.example.appturismo.menu.Provider

import com.example.appturismo.R

class ListLugaresMenuViewProvider {
    companion object {
        val lugaresMenuList = listOf<ListLugaresMenuView>(
            ListLugaresMenuView(
                "Parque Caldas",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fsk.pinterest.com%2Fpin%2F484629609882895830%2F&psig=AOvVaw30h86EeIEae1jCUOx_9wNr&ust=1724957527217000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCOC6l9mtmIgDFQAAAAAdAAAAABAI",
                "4.5",
                "Visitar",
                R.drawable.star_cali
            ),
            ListLugaresMenuView(
                "Puente Humilladero",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYnbaVJqCp1Tf8ehxjHNi0iFQ8qeEBxIMzaQ&s",
                "4.5",
                "Visitar",
                R.drawable.star_cali
            ),
            ListLugaresMenuView(
                "Pueblito Patojo",
                "https://media-cdn.tripadvisor.com/media/photo-s/08/d3/dd/82/rincon-payanes.jpg",
                "4.5",
                "Visitar",
                R.drawable.star_cali
            ),
            ListLugaresMenuView(
                "El Morro",
                "https://www.proclamadelcauca.com/wp-content/uploads/2020/09/El-Morro-de-Tulcan-en-Popayan-es-Patrimonio-Arqueologico-de-la-Nacion.jpg",
                "4.5",
                "Visitar",
                R.drawable.star_cali
            )
        )
    }
}