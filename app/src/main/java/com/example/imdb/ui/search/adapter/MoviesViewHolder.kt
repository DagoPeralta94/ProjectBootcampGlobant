package com.example.imdb.ui.search.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.R
import com.example.imdb.ui.search.MoviesList

class MoviesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.tvMovieName)
    val age = view.findViewById<TextView>(R.id.tvMovieAge)
    val description = view.findViewById<TextView>(R.id.tvMovieDescription)
    val moviesPhoto = view.findViewById<ImageView>(R.id.ivMovies)

    fun render(moviesListModel: MoviesList){
        name.text = moviesListModel.name
        age.text = moviesListModel.age
        description.text = moviesListModel.description

    }
}