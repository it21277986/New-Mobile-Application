package com.example.newsapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel: ViewModel() {

    private val newsName = MutableLiveData<String>()

    fun getNewsName():LiveData<String> {
        return newsName
    }

    fun setNewsName(name: String) {
        newsName.value = name
    }
}