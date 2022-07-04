package com.example.imdb.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.core.ModelDataBestMovies
import com.example.imdb.R
import com.example.imdb.core.holder.ViewHolderBestMovies

class AdapterBestMovies(val moviesBestList: List<ModelDataBestMovies>) : RecyclerView.Adapter<ViewHolderBestMovies>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderBestMovies {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolderBestMovies(layoutInflater.inflate(R.layout.item_movies_best_selected, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderBestMovies, position: Int) {
        val item = moviesBestList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = moviesBestList.size
}