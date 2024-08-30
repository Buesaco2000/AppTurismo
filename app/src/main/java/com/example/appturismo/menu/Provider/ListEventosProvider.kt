package com.example.appturismo.menu.Provider

class ListEventosProvider {
    companion object {
        val eventosList = listOf<ListEventosView>(
            ListEventosView(
                "Parque Caldas",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Catedralpopayan.jpg/220px-Catedralpopayan.jpg",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "Comentarios",
                "@drawable/comment"
            ),
            ListEventosView(
                "Puente Humilladero",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYnbaVJqCp1Tf8ehxjHNi0iFQ8qeEBxIMzaQ&s",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "Comentarios",
                "@drawable/comment"
            ),
            ListEventosView(
                "Pueblito Patojo",
                "https://media-cdn.tripadvisor.com/media/photo-s/08/d3/dd/82/rincon-payanes.jpg",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "@drawable/star_cali",
                "Comentarios",
                "@drawable/comment"
            )
        )
    }
}