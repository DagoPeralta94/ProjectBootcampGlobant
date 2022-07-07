package com.example.imdb.ui.search.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imdb.R
import com.example.imdb.core.adapter.AdapterMovies
import com.example.imdb.data.MoviesProvider2
import com.example.imdb.databinding.ActivitySearchBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class SearchActivity : AppCompatActivity() {



    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.botton_navigation)

        bottomNavigationView.selectedItemId = R.id.search2

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.play2 -> {
                    startActivity(Intent(applicationContext, PlayDashboardActivity::class.java))
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.search2 -> return@OnNavigationItemSelectedListener true
                R.id.home2 -> {
                    startActivity(Intent(applicationContext, HomeDashboardActivity::class.java))
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.profile2 -> {
                    startActivity(Intent(applicationContext, ProfileDashboardActivity::class.java))
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }

    fun initRecyclerView(){
        binding.rcMovies.layoutManager = LinearLayoutManager(this)
        binding.rcMovies.adapter = AdapterMovies(MoviesProvider2.moviesList)
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}