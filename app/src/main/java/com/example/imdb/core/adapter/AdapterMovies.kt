package com.example.imdb.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imdb.core.ModelDataClass
import com.example.imdb.R
import com.example.imdb.core.holder.ViewHolderMovies

class AdapterMovies(private val listMovies: List<ModelDataClass>): RecyclerView.Adapter<ViewHolderMovies>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovies {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolderMovies(layoutInflater.inflate(R.layout.item_movies, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderMovies, position: Int) {
        val item = listMovies[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listMovies.size

}