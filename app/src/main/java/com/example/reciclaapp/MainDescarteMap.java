package com.example.reciclaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainDescarteMap extends AppCompatActivity {

    private Button BtnDuvida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_descarte_map);

        getSupportActionBar().hide();

        BtnDuvida = findViewById(R.id.BtnDuvida);

        BtnDuvida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DescarteDuvidas.class);
                startActivity(intent);
            }
        });
    }
}
