package com.example.weatherapp.model

data class Weather (
    val coord: Coord,
    val weather: Array<AnyWeather>,
    val base: String,
    val main: Main,
    val visibility: Short,
    val wind: Wind,
    val clouds: Clouds,
    val dt: Int,
    val sys: Sys,
    val timezone: Short,
    val id: Int,
    val name: String,
    val cod: Short,
)