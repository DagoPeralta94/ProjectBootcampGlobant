package com.example.imdb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                   overridePendingTransition(0,0)
                   return@OnNavigationItemSelectedListener true
               }
               R.id.home2 -> return@OnNavigationItemSelectedListener true
               R.id.play2 -> {
                   startActivity(Intent(applicationContext, PlayDashboard::class.java))
                   overridePendingTransition(0,0)
                   return@OnNavigationItemSelectedListener true
               }
               R.id.profile2 -> {
                   startActivity(Intent(applicationContext, ProfileDashboard::class.java))
                   overridePendingTransition(0,0)
                   return@OnNavigationItemSelectedListener true
               }
           }
            false
        })
    }
    override fun onStop() {
        super.onStop()
        finish()
    }
}