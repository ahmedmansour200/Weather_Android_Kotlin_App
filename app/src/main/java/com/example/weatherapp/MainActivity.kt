package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.android.volley.toolbox.Volley.*
import com.example.weatherapp.model.Main
import com.example.weatherapp.model.Weather
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    val apiKay = "b526519e3bcfed3dda0ff4a570e31427"
    val gson = Gson()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_search)

        button.setOnClickListener{
            getWeather()
            findViewById<EditText>(R.id.search_input).text.clear()
        }
    }

    private fun getWeather() {
        val searchInput = findViewById<EditText>(R.id.search_input)
        try {
            if(searchInput.text.isNotEmpty()){
                var fullURL =
                    "https://api.openweathermap.org/data/2.5/weather?q=${searchInput.text}&units=metric&appid=$apiKay"
                val queue = Volley.newRequestQueue(this)
                val stringRequest = StringRequest(
                    com.android.volley.Request.Method.POST, fullURL,{ response ->
                        var result = gson.fromJson(response , Weather::class.java)
                        findViewById<TextView>(R.id.temp).text = result.main.temp.toInt().toString()+" ْ C"
                        findViewById<TextView>(R.id.status).text = result.weather[0].description.toString()
                        findViewById<TextView>(R.id.temp_min).text = "Min Temp: " + result.main.temp_min + "ْ C"
                        findViewById<TextView>(R.id.temp_max).text = "Max Temp: " + result.main.temp_max + " ْ C"
                        findViewById<TextView>(R.id.address).text = result.name + ", " + result.sys.country
                       },{
                        Toast.makeText(this,"Error in city name", Toast.LENGTH_SHORT).show()
                        println(it.message)
                    }
                )
                queue.add(stringRequest)
            }else {
                Toast.makeText(this,"Enter the city name", Toast.LENGTH_SHORT).show()
            }
        }catch (err:Exception){

        }
    }
}