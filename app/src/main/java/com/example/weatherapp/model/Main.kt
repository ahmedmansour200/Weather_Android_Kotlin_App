package com.example.weatherapp.model

import com.google.gson.annotations.SerializedName


data class Main (
    val temp: Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Short,
    val humidity: Byte,
)