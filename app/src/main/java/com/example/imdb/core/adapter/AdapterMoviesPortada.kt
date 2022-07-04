package com.example.imdb.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.core.ModelDataPortadaMovies
import com.example.imdb.R

class AdapterMoviesPortada(private val listPortadaMovie: List<ModelDataPortadaMovies>) : RecyclerView.Adapter<ViewHolderMoviesPortada>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMoviesPortada {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolderMoviesPortada(layoutInflater.inflate(R.layout.item_portada_movie, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderMoviesPortada, position: Int) {
        val item = listPortadaMovie[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listPortadaMovie.size
}