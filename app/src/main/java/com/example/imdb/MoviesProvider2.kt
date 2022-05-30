package com.example.imdb

import com.example.imdb.ui.search.MoviesList

class MoviesProvider2 {
    companion object {
        val moviesList = listOf<MoviesList>(
            MoviesList(
                "Queen of the South",
                "2016",
                "Alice Braga, Hemky Madera",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
            )
        )
    }
}