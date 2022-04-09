package com.example.rmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cardPage5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_page5);
    }

    public void startActivity(View v){
        Intent intent = new Intent(this, starting.class);
        startActivity(intent);
    }

    public void page2Activity(View v){
        Intent intent = new Intent(this, cardPage2.class);
        startActivity(intent);
    }

    public void page3Activity(View v){
        Intent intent = new Intent(this, cardPage3.class);
        startActivity(intent);
    }
}