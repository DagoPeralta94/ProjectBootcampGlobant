package com.example.imdb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtRegister.setOnClickListener { goingToRegister() }
        binding.login1.setOnClickListener { goingToNavigation() }

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