package com.example.imdb.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imdb.ModelDataClass
import com.example.imdb.R

class ViewHolderMovies(view: View) : RecyclerView.ViewHolder(view){

    val photoUrl = view.findViewById<ImageView>(R.id.ivMovies)
    val titleMovie = view.findViewById<TextView>(R.id.tvMovieName)
    val movieAge = view.findViewById<TextView>(R.id.tvMovieAge)
    val movieDescription = view.findViewById<TextView>(R.id.tvMovieDescription)

    fun render(listModel: ModelDataClass){

        Glide.with(photoUrl.context).load(listModel.urlPhoto).into(photoUrl)
        titleMovie.text = listModel.titleMovie
        movieAge.text = listModel.dateMovie
        movieDescription.text = listModel.descriptionMovie

    }
}

