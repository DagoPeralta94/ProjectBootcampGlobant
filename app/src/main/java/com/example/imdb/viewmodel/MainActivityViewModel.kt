package com.example.imdb.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val txtUserVM : MutableLiveData<String> = MutableLiveData()
    val txtPasswordVM : MutableLiveData<String> = MutableLiveData()

    fun getCurrentInformation(){
        txtUserVM
        txtPasswordVM
    }

    fun getTxtInformation(
        nameLogin: String,
        passwordLogin: String
    ){
        txtUserVM.value = "Hola ${nameLogin}"
        txtPasswordVM.value = "Tu contra es ${passwordLogin}"
    }
}