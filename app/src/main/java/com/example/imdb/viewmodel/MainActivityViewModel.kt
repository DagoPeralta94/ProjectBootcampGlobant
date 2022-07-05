package com.example.imdb.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val txtInformation : MutableLiveData<String> = MutableLiveData()

    fun getCurrentInformation(){
        txtInformation
    }

    fun getTxtInformation(
        nameLogin: String,
        passwordLogin: String
    ){
        txtInformation.value = "El usuario es $nameLogin y la contraseña es $passwordLogin"
    }
}