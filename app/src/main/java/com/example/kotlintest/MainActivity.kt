package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val chartView= ChartView(this);
        var list= mutableListOf<chartBean>()
        var max=600
        for ( i in 0..10){
           var chartView=chartBean("",(0..max).random(),"小米")
            list.add(chartView)
        }
        chartView.setChatBeans(list)
        chartView.setYData(7,max.toFloat())
        setContentView(chartView)
    }
}