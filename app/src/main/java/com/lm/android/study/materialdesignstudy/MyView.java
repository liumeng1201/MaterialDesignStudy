package com.lm.android.study.materialdesignstudy;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by liumeng on 2015/4/27.
 */
public class MyView extends TextView {
    public static final String TAG = "TouchEvent";
    Paint paint = null;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyView dispatchTouchEvent " + "DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyView dispatchTouchEvent " + "MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyView dispatchTouchEvent " + "UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyView dispatchTouchEvent " + "CANCEL");
                break;
        }
        boolean b = super.dispatchTouchEvent(event);
        Log.d(TAG, "MyView dispatchTouchEvent Return " + b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyView onTouchEvent " + "DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyView onTouchEvent " + "MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyView onTouchEvent " + "UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyView onTouchEvent " + "CANCEL");
                break;
        }
        boolean b = super.onTouchEvent(event);
        Log.d(TAG, "MyView onTouchEvent Return " + b);
        return b;
    }
}
