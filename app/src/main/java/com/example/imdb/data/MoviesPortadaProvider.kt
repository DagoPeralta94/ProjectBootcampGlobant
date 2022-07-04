package com.example.imdb.data

import com.example.imdb.core.ModelDataPortadaMovies

class MoviesPortadaProvider {
    companion object {
        val moviesListPortada = listOf<ModelDataPortadaMovies>(
            ModelDataPortadaMovies(
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                "Stranger Things",
                "Trailer Oficial"

            ),
        )
    }
}