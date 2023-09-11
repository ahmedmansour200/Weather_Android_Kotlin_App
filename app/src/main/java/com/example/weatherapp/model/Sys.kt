package com.example.weatherapp.model

import com.google.gson.annotations.SerializedName


data class Sys (
  val type: Byte,
  val id: Short,
  val country: String,
  val sunrise: Int,
  val sunset: Int,
)