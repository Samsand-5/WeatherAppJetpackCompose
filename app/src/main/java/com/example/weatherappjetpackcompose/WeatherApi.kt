package com.example.weatherappjetpackcompose

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    suspend fun getWeather(
        @Query("q") city:String,
        @Query("appid") apiKey:String,
        @Query("units") units:String ="metric"
    ): WeatherResponse

    companion object{
        private const val BASE_URL="https://api.openweathermap.org/data/2.5/"
    }
}