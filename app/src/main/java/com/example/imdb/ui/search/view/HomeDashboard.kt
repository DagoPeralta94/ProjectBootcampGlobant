package com.example.imdb.ui.search.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imdb.R
import com.example.imdb.core.adapter.AdapterBestMovies
import com.example.imdb.core.adapter.AdapterMoviesPortada
import com.example.imdb.data.MoviesBestProvider
import com.example.imdb.data.MoviesPortadaProvider
import com.example.imdb.databinding.ActivityHomeDashboardBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeDashboard : AppCompatActivity() {

    private lateinit var binding: ActivityHomeDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.botton_navigation)

            bottomNavigationView.selectedItemId = R.id.home2

            bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.search2 -> {
                        startActivity(Intent(applicationContext, SearchActivity::class.java))
                        overridePendingTransition(0, 0)
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.home2 -> return@OnNavigationItemSelectedListener true
                    R.id.play2 -> {
                        startActivity(Intent(applicationContext, PlayDashboard::class.java))
                        overridePendingTransition(0, 0)
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.profile2 -> {
                        startActivity(Intent(applicationContext, ProfileDashboard::class.java))
                        overridePendingTransition(0, 0)
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            })

        initRecyclerView()
        }

    private fun initRecyclerView() {
        binding.rvPortadaMovie.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPortadaMovie.adapter = AdapterMoviesPortada(MoviesPortadaProvider.moviesListPortada)

        binding.rvBestSelections.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvBestSelections.adapter = AdapterBestMovies(MoviesBestProvider.moviesListBest)
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}