package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPaint.setColor(Color.WHITE);
        canvas.drawLine(50,70,50,370,mPaint);
        canvas.drawLine(50,370,750,370,mPaint);

        mPaint.setTextSize(14);
        canvas.drawText("Froyo",80,385,mPaint);
        canvas.drawText("GB",170,385,mPaint);
        canvas.drawText("IC S",260,385,mPaint);
        canvas.drawText("JB",350,385,mPaint);
        canvas.drawText("KitKat",440,385,mPaint);
        canvas.drawText("L",530,385,mPaint);
        canvas.drawText("M",620,385,mPaint);


        mPaint.setTextSize(22);
        canvas.drawText("直方图",365,450,mPaint);

        mPaint.setTextSize(10);
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(60,368,120,370,mPaint);
        canvas.drawRect(150,350,210,370,mPaint);
        canvas.drawRect(240,350,300,370,mPaint);
        canvas.drawRect(330,270,390,370,mPaint);
        canvas.drawRect(420,200,480,370,mPaint);
        canvas.drawRect(510,170,570,370,mPaint);
        canvas.drawRect(600,300,660,370,mPaint);
    }
}
