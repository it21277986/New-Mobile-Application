package com.example.newsapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.database.News

class MainActivity2Data: ViewModel() {
    private val _data = MutableLiveData<List<News>>()

    val data: LiveData<List<News>> = _data

    fun setData(data: List<News>) {
        _data.value = data
    }
}