package com.example.imdb.ui.search.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.imdb.data.UserLogin
import com.example.imdb.data.UserProvider
import com.example.imdb.databinding.ActivityMainBinding
import com.example.imdb.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getCurrentInformation()
        //saveInformatio()

        binding.txtRegister.setOnClickListener { goingToRegister() }
        binding.login1.setOnClickListener { goingToNavigation() }


        /* Glide.with(this)
            .load(R.drawable.logo_google)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.imGoogle) */

    }

    private fun saveInformatio() {
        with(binding) {
            login1.setOnClickListener {
                viewModel.getTxtInformation(
                    "${txtUser.editText?.text}",
                    "${txtPassword.editText?.text}"
                )
            }
        }
        viewModel.txtInformation.observe(this, Observer {
            binding.txtInformation.text = it
        })
    }

    private fun goingToRegister() {

        val intent = Intent(this, Register::class.java).apply {
        }
        startActivity(intent)

    }

    private fun goingToNavigation() {

        val user0 = binding.txtUser.editText?.text.toString()
        val passw0 = binding.txtPassword.editText?.text.toString()

        var i = 0
        for (users in UserProvider.userList) {

            val user1 = UserProvider.userList[i].user
            val passw1 = UserProvider.userList[i].password

            if (user0 == user1 && passw1 == passw0) {
                val intent = Intent(this, HomeDashboard::class.java).apply {
                }
                startActivity(intent)
                break
            } else {
                i += 1
            }
        }
    }
}

