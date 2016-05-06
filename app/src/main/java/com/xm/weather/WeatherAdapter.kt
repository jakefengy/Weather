package com.xm.weather

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import java.util.*


class WeatherAdapter(ctx: Context, list: List<String>) : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

    var inflater = LayoutInflater.from(ctx);
    var weatherList = ArrayList<String>();

    init {
        weatherList.addAll(list);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = weatherList[position];
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int {
        return weatherList.size
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}