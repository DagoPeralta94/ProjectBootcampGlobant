package com.example.imdb.ui.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.R
import com.example.imdb.ui.search.MoviesList

class MoviesAdapter(private val moviesList:List<MoviesList>) : RecyclerView.Adapter<MoviesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MoviesViewHolder(layoutInflater.inflate(R.layout.item_movies, parent, false))
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val item = moviesList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = moviesList.size
}