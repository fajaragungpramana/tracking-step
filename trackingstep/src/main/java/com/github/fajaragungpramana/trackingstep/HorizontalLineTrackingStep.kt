package com.github.fajaragungpramana.trackingstep

import android.content.Context
import android.graphics.Canvas

class HorizontalLineTrackingStep(context: Context) : LineTrackingStep(context) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawLine(0F, 0F, width.toFloat(), 0F, mPaintLine)
    }

}