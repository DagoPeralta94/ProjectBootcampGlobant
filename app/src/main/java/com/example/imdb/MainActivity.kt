package com.example.imdb

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.request.RequestOptions
import com.example.imdb.databinding.ActivityMainBinding
import com.example.imdb.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtRegister.setOnClickListener { goingToRegister() }
        binding.login1.setOnClickListener { goingToNavigation() }

        /* Glide.with(this)
            .load(R.drawable.logo_google)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.imGoogle) */

    }

    private fun goingToRegister() {
        val intent = Intent(this, Register::class.java).apply {

        }
        startActivity(intent)
    }

    private fun goingToNavigation() {
        val intent = Intent(this, SearchActivity::class.java).apply {

        }
        startActivity(intent)
    }

}