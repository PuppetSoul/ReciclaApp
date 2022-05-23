package com.example.reciclaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainClube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_clube);

        getSupportActionBar().hide();
    }
}
