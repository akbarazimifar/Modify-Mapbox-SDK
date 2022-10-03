package com.mapbox.services.android.navigation.testapp.example.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ExampleViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExampleViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ExampleViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}