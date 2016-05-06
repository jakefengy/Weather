package com.xm.weather.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.xm.weather.R
import com.xm.weather.WeatherAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weather_list.layoutManager = LinearLayoutManager(this);

        var list = listOf("A", "B", "C", "D", "F", "G", "H", "I", "J", "K", "L");

        var adapter = WeatherAdapter(this, list);
        weather_list.adapter = adapter;

    }


}
