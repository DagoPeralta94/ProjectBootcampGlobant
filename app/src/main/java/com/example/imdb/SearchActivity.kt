package com.example.imdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imdb.adapter.AdapterMovies
import com.example.imdb.databinding.ActivityMainBinding
import com.example.imdb.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        binding.rcMovies.layoutManager = LinearLayoutManager(this)
        binding.rcMovies.adapter = AdapterMovies(MoviesProvider2.moviesList)
    }
}