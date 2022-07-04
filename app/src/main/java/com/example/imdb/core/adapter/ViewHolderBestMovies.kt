package com.example.imdb.core.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imdb.core.ModelDataBestMovies
import com.example.imdb.databinding.ItemMoviesBestSelectedBinding

class ViewHolderBestMovies(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemMoviesBestSelectedBinding.bind(view)

    fun render(listModelBestMovies: ModelDataBestMovies) {
        with(binding) {
            Glide.with(ivPortadaSelect.context).load(listModelBestMovies.urlPhotoBestMovies)
                .into(ivPortadaSelect)
            txScore.text = listModelBestMovies.scoreBestMovies
            txTitleMovieSelect.text = listModelBestMovies.titleBestMovies
        }
    }
}