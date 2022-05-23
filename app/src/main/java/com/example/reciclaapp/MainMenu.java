package com.example.reciclaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    private String tipoPessoa;

    private Button BtnMainDescarteMap;
    private Button BtnMainClube;
    private Button BtnMainTrilha;
    private Button btnMainAnuncios;
    private Button btnTrilhaSeguranca;
    private TextView TextMENU;

    private Bundle dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        getSupportActionBar().hide();

        dados = getIntent().getExtras();

        tipoPessoa = dados.getString("tipoPessoa");

        BtnMainDescarteMap = findViewById(R.id.BtnMainDescarteMap);
        BtnMainClube       = findViewById(R.id.BtnMainClube);
        BtnMainTrilha      = findViewById(R.id.BtnMainTrilha);
        btnMainAnuncios    = findViewById(R.id.btnMainAnuncios);
        btnTrilhaSeguranca = findViewById(R.id.btnTrilhaSeguranca);
        TextMENU           = findViewById(R.id.TextMENU);

        if (tipoPessoa.equals("CPF")) {
            btnMainAnuncios.setVisibility(View.INVISIBLE);
            btnTrilhaSeguranca.setVisibility(View.INVISIBLE);

            TextMENU.setText("Menu CPF");
        } else if (tipoPessoa.equals("CNPJ")) {
            BtnMainClube.setVisibility(View.INVISIBLE);
            btnTrilhaSeguranca.setVisibility(View.INVISIBLE);

            TextMENU.setText("Menu CNPJ");
        } else {
            btnMainAnuncios.setVisibility(View.INVISIBLE);

            TextMENU.setText("Menu Coletor");
        }

        BtnMainDescarteMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainDescarteMap.class);

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));

                startActivity(intent);
            }
        });

        BtnMainClube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainClube.class);

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));

                startActivity(intent);
            }
        });

        btnMainAnuncios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainClube.class);

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));

                startActivity(intent);
            }
        });

        BtnMainTrilha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstTrilhaEscolher.class);

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));

                startActivity(intent);
            }
        });

        btnTrilhaSeguranca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstTrilhaEscolher.class);

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));

                startActivity(intent);
            }
        });
    }
}
