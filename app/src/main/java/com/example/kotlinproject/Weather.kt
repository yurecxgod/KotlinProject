package com.example.kotlinproject

data class Weather(val city: City = getDefaultCity(),
                   val temperature: Int = 0,
                   val feelsLike: Int = 0)

fun getDefaultCity() = City(cityName = "Georgia, Tbilisi", lat = 18.4317, lon = 535.075)
