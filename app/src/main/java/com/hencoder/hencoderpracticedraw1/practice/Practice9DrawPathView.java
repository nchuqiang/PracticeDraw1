package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    Paint mPaint = new Paint();
    Path path = new Path();
    public Practice9DrawPathView(Context context) {
        super(context);
        initPath();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPath();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPath();
    }

    private void initPath() {
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
//        mPaint.setStrokeWidth(10);

        path.arcTo(300, 300, 400, 400, 150, 220, true);
        path.arcTo(400, 300, 500, 400, 180, 220, false);
        path.lineTo(400, 500);
        path.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(path,mPaint);
    }
}
