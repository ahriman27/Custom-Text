package com.dt.custom_text_vj

import android.content.Context
import android.graphics.Canvas
import android.widget.TextView


class CustomTextView(context: Context) : androidx.appcompat.widget.AppCompatTextView(context)
{
     init {
         setText("Hello")
     }
}