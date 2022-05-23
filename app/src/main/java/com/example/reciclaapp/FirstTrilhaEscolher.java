package com.example.reciclaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstTrilhaEscolher extends AppCompatActivity {

    private ImageView imageTrilha1;
    private ImageView imageTrilha2;
    private ImageView imageTrilha3;

    private TextView textDescricao1;
    private TextView textDescricao2;
    private TextView textDescricao3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_trilha_escolher);

        getSupportActionBar().hide();

        imageTrilha1 = findViewById(R.id.imageTrilha1);
        imageTrilha2 = findViewById(R.id.imageTrilha2);
        imageTrilha3 = findViewById(R.id.imageTrilha3);

        textDescricao1 = findViewById(R.id.textDescricao1);
        textDescricao2 = findViewById(R.id.textDescricao2);
        textDescricao3 = findViewById(R.id.textDescricao3);

        imageTrilha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstTrilhaVideo.class);

                Bundle dados = getIntent().getExtras();

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));
                intent.putExtra("texto", textDescricao1.getText());

                startActivity(intent);
            }
        });

        imageTrilha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstTrilhaVideo.class);

                Bundle dados = getIntent().getExtras();

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));
                intent.putExtra("texto", textDescricao2.getText());

                startActivity(intent);
            }
        });

        imageTrilha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstTrilhaVideo.class);

                Bundle dados = getIntent().getExtras();

                intent.putExtra("tipoPessoa", dados.getString("tipoPessoa"));
                intent.putExtra("texto", textDescricao3.getText());

                startActivity(intent);
            }
        });
    }
}
