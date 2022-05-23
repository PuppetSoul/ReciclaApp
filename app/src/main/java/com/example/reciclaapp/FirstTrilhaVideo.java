package com.example.reciclaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstTrilhaVideo extends AppCompatActivity {

    private Button btnAvancar;
    private String tipoPessoa;
    private String Texto;

    private TextView textoVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_trilha_video);

        getSupportActionBar().hide();

        Bundle dados = getIntent().getExtras();

        btnAvancar = findViewById(R.id.BtnAvancar);
        textoVideo = findViewById(R.id.textoVideo);

        tipoPessoa = dados.getString("tipoPessoa");
        Texto = dados.getString("texto");

        if (!Texto.equals("")) {
            textoVideo.setText(Texto);
        }

        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainMenu.class);

                Bundle dados = getIntent().getExtras();

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));

                startActivity(intent);
            }
        });
    }
}
