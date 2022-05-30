package com.example.imdb.ui.play

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlayViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Play Fragment"
    }
    val text: LiveData<String> = _text
}