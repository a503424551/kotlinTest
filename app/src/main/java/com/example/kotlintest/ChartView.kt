package com.example.kotlintest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class ChartView(context: Context?) : View(context) {
    var  paintXY=Paint()
    val marg = 50f//整个view 距离父控件距离
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        setBackgroundColor(Color.GRAY)
        paintXY.setColor(Color.WHITE)
        paintXY.strokeWidth=2f

        canvas?.drawLine(marg, marg, marg,height- marg,paintXY)//画Y轴
        canvas?.drawLine(marg,height-marg,width-marg,height-marg,paintXY)//画X轴
    }
}