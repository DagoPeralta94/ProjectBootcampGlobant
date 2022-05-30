package com.example.imdb

import com.example.imdb.ui.search.MoviesList

class MoviesProvider2 {
    companion object {
        val moviesList = listOf<ModelDataClass>(
            ModelDataClass(
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                "Queen of the South",
                "2016",
                "Alice Braga, Hemky Madera"

            ),
            ModelDataClass(
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                "Queen of the South2",
                "2015",
                "Alice Braga, Hemky Madera"

            ),
            ModelDataClass(
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                "Queen of the South3",
                "2017",
                "Alice Braga, Hemky Madera, adada dkajskdj ,a dajdka da"

            ),
            ModelDataClass(
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                "Queen of the South4",
                "2018",
                "Alice Braga, Hemky Madera"

            ),
            ModelDataClass(
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                "Queen of the South5",
                "2019",
                "Alice Braga, Hemky Madera"
            )
        )
    }
}