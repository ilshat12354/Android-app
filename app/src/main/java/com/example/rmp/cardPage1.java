package com.example.rmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class cardPage1 extends AppCompatActivity {

    public float x1,x2,y1,y2;
    public static int MIN_DISTANCE = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_page1);
    }

    public void firstPageActivity(View v){
        Intent intent = new Intent(this, cardPage4.class);
        startActivity(intent);
    }

    public void startActivity(View v){
        Intent intent = new Intent(this, starting.class);
        startActivity(intent);
    }

    public boolean onTouchEvent(MotionEvent touchEvent){
        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();

                float valueX = x2 - x1;
                float valueY = y2 - y1;

                if(Math.abs(valueX) > MIN_DISTANCE) {
                    if (x1 < x2) {
                        Intent i = new Intent(this, cardPage3.class);
                        startActivity(i);
                    } else if(x1 > x2){
                        Intent i = new Intent(this, cardPage2.class);
                        startActivity(i);
                    }
                }
                else if(Math.abs(valueY) > MIN_DISTANCE) {
                    if (y1 > y2) {
                        Intent i = new Intent(this, cardPage4.class);
                        startActivity(i);
                    }
                }
        }
        return false;
    }
}