package com.example.kotlintest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View


class ChartView : View {

    constructor(mContext: Context) : super(mContext) {

    }

    constructor(mContext: Context, mAttributeSet: AttributeSet) : super(mContext, mAttributeSet) {

    }



    var charWidth=50f//柱状的宽度
    var chartsMarg=30f//柱状间的间隔距离
    var chartCount=4;//x轴柱状个数
    var  ymaxValue=500f//Y轴坐标最大值
    var  yValue=0f//yz轴刻度间的坐标值，随Y轴最大值变化
    var yLinesHeight=0f//y轴刻度间的长度
    var yLinesNumber=5//Y轴刻度线条数
    var  paintXY=Paint()
    val marg = 50f//整个view 距离父控件距离
    var  list= mutableListOf<chartBean>()

    fun setChatBeans(lists :MutableList<chartBean>) {
            this.list=lists;
    }

    fun setYData(yLinesNumber :Int ,ymaxValue:Float){
            this.yLinesNumber=yLinesNumber
        this.ymaxValue=ymaxValue
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        setBackgroundColor(Color.GRAY)
        if(list.size>0){
            notifyView(canvas)
        }



    }

    private fun notifyView(canvas: Canvas?) {
        paintXY.setColor(Color.WHITE)
        paintXY.strokeWidth = 6f

        canvas?.drawLine(marg, marg, marg, height - marg, paintXY)//画Y轴
        canvas?.drawLine(marg, height - marg, width - marg, height - marg, paintXY)//画X轴

        paintXY.strokeWidth = 1f
        yLinesHeight = (height - marg * 2) / (yLinesNumber)
        yValue = ymaxValue / yLinesNumber
        for (i in 0 until yLinesNumber) {
            canvas?.drawLine(
                marg,
                marg + yLinesHeight * i,
                width - marg,
                marg + yLinesHeight * i,
                paintXY
            )
            canvas?.drawText(
                (ymaxValue - yValue * i).toInt().toString(),
                10f,
                (marg + yLinesHeight * i) + 5f,
                paintXY
            )
        }


        for (c in list) {
            var i = list.indexOf(c) + 1

            var charRealHeigthValue = c.xValue

            val fl = (height - marg * 2) * (charRealHeigthValue / ymaxValue)
            var charRealHeigth = (height - marg * 2) - fl + marg
            canvas?.drawRect(
                marg + chartsMarg * i + charWidth * (i - 1),
                charRealHeigth,
                marg + chartsMarg * i + charWidth * i,
                height - marg,
                paintXY
            )
            canvas?.drawText(
                c.xName,
                marg + chartsMarg * i + charWidth * (i - 1) + 15,
                height - marg + 20,
                paintXY
            )
            canvas?.drawText(
                charRealHeigthValue.toString(),
                marg + chartsMarg * i + charWidth * (i - 1) + 15,
                charRealHeigth - 5,
                paintXY
            )
        }
    }
}
class chartBean (var  displayXValue :String,var xValue:Int,var xName:String){



}