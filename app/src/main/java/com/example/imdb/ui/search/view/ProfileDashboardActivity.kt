package com.example.imdb.ui.search.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imdb.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_dashboard)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.botton_navigation)

        bottomNavigationView.selectedItemId = R.id.profile2

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.play2 -> {
                    startActivity(Intent(applicationContext, PlayDashboardActivity::class.java))
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.profile2 -> return@OnNavigationItemSelectedListener true
                R.id.home2 -> {
                    startActivity(Intent(applicationContext, HomeDashboardActivity::class.java))
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.search2 -> {
                    startActivity(Intent(applicationContext, SearchActivity::class.java))
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
