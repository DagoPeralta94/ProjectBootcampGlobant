package com.example.imdb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.imdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtRegister.setOnClickListener { goingToRegister() }
        binding.login1.setOnClickListener { goingToNavigation() }

        Glide.with(this)
            .load(R.drawable.logo_apple)
            .into(binding.imApple)
        Glide.with(this)
            .load(R.drawable.logo_facebook)
            .into(binding.imFacebook)
        Glide.with(this)
            .load(R.drawable.logo_google)
            .into(binding.imGoogle)

    }
    private fun goingToRegister(){
        val intent = Intent(this, Register::class.java).apply {

        }
        startActivity(intent)
    }

    private fun goingToNavigation(){
        val intent = Intent(this, NavigationActivity::class.java).apply {

        }
        startActivity(intent)
    }

}