package com.lm.android.study.materialdesignstudy;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class SubActivity extends ActionBarActivity {
    public static final String TAG = "TouchEvent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "SubActivity dispatchTouchEvent " + "DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "SubActivity dispatchTouchEvent " + "MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "SubActivity dispatchTouchEvent " + "UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "SubActivity dispatchTouchEvent " + "CANCEL");
                break;
        }
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "SubActivity dispatchTouchEvent Return " + b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "SubActivity onTouchEvent " + "DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "SubActivity onTouchEvent " + "MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "SubActivity onTouchEvent " + "UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "SubActivity onTouchEvent " + "CANCEL");
                break;
        }
        boolean b = super.onTouchEvent(event);
        Log.d(TAG, "SubActivity onTouchEvent Return " + b);
        return b;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }
}
