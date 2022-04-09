package com.example.rmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class starting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
    }

    public void startActivity(View v) {
        Intent intent = new Intent(this, cardPage1.class);
        startActivity(intent);
    }
}