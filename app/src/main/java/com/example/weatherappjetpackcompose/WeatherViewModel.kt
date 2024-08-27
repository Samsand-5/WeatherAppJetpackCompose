package com.example.weatherappjetpackcompose

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class WeatherViewModel:ViewModel() {
    private val _weatherData = MutableStateFlow<WeatherResponse?>(null)
    val weatherData : StateFlow<WeatherResponse?> = _weatherData
    private val weatherApi = WeatherApi.create()
}