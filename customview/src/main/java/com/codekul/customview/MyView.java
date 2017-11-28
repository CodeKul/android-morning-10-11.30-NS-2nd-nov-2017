package com.codekul.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by aniruddha on 16/11/17.
 */

public class MyView extends android.support.v7.widget.AppCompatEditText {

    private Paint paint;
    private float cx, cy;


    public MyView(Context context) {
        super(context);

        initPaint();
        // code

    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initPaint();
        // xml
    }

    private void initPaint() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(1.5f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(cx, cy, 50, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        cx = event.getX();
        cy = event.getY();

        invalidate();

        return true;
    }
}
