package com.example.kotlintest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.DashPathEffect
import android.graphics.Paint
import android.view.View


class ChartView(context: Context?) : View(context) {
    var  ymaxValue=100f
    var  yValue=0f
    var yLinesHeight=0f
    var yLinesNumber=5//Y轴刻度线条数
    var  paintXY=Paint()
    val marg = 50f//整个view 距离父控件距离
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        setBackgroundColor(Color.GRAY)
        paintXY.setColor(Color.WHITE)
        paintXY.strokeWidth=6f

        canvas?.drawLine(marg, marg, marg, height - marg, paintXY)//画Y轴
        canvas?.drawLine(marg, height - marg, width - marg, height - marg, paintXY)//画X轴

        paintXY.strokeWidth=1f
        yLinesHeight=(height-marg*2)/(yLinesNumber)
        yValue=ymaxValue/5
        for (i in 0 until yLinesNumber){
            canvas?.drawLine(marg, marg + yLinesHeight * i, width - marg, marg + yLinesHeight * i, paintXY)
            canvas?.drawText((ymaxValue-yValue*i).toString(),10f,(marg + yLinesHeight * i)+5f,paintXY)
        }


    }
}