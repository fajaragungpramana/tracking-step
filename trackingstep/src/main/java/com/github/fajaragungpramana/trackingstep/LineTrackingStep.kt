package com.github.fajaragungpramana.trackingstep

import android.content.Context
import android.graphics.Color
import android.graphics.DashPathEffect
import android.graphics.Paint
import android.view.View
import android.view.ViewGroup

abstract class LineTrackingStep(context: Context) : View(context) {

    internal var lineWidth = 4
    internal var lineColor = Color.GREEN

    internal var isDashed = false

    internal var mPaintLine: Paint
        get() {
            field.let {
                it.color = lineColor
                it.strokeWidth = lineWidth.toFloat()
                if (isDashed) it.pathEffect = DashPathEffect(floatArrayOf(10f, 5f), 0f)
            }
            return field
        }

    init {
        mPaintLine = Paint(Paint.ANTI_ALIAS_FLAG)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(lineWidth, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

}