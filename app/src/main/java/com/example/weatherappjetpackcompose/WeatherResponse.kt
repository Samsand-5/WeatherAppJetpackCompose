package com.example.weatherappjetpackcompose

data class WeatherResponse(
    val name:String,
    val main:Main
)

data class Main(
    val temp:Float,
    val humidity:Int
)
