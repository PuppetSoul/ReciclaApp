package com.example.reciclaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DescarteDuvidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descarte_duvidas);

        getSupportActionBar().hide();
    }
}
