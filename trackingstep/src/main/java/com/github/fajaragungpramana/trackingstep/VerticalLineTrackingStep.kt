package com.github.fajaragungpramana.trackingstep

import android.content.Context
import android.graphics.Canvas

class VerticalLineTrackingStep(context: Context) : LineTrackingStep(context) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawLine(0F, 0F, 0F, height.toFloat(), mPaintLine)
    }

}