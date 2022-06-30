package com.example.imdb.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imdb.ModelDataPortadaMovies
import com.example.imdb.databinding.ItemPortadaMovieBinding

class ViewHolderMoviesPortada(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemPortadaMovieBinding.bind(view)

    fun render (listModelPortada: ModelDataPortadaMovies){
        with(binding){
            Glide.with(ivPortadaFragment.context).load(listModelPortada.urlPhotoPortadaFragment).into(ivPortadaFragment)
            Glide.with(ivPortadaHomeMovie.context).load(listModelPortada.urlPhotoPortadaMovie).into(ivPortadaHomeMovie)
            txTitleMoviePortada.text = listModelPortada.titleMoviePortada
            txDescriptionMoviePortada.text = listModelPortada.descriptionMoviePortada
        }

    }
}