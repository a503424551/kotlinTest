package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     /* val chartView = ChartView(this)
        setChartView(chartView)
        setContentView(chartView)*/


       setContentView(R.layout.activity_main)
        val chartView = findViewById<ChartView>(R.id.cv)
       setChartView(chartView)

    }

    private fun setChartView(chartView :ChartView){
        val chartView = chartView;
        var list = mutableListOf<chartBean>()
        var max = 600
        for (i in 0..10) {
            var chartView = chartBean("", (0..max).random(), "小米")
            list.add(chartView)
        }
        chartView.setChatBeans(list)
        chartView.setYData(6, max.toFloat())
        chartView.postInvalidate()
    }
}