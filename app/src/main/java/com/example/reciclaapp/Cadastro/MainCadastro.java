package com.example.reciclaapp.Cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reciclaapp.FirstTrilhaEscolher;
import com.example.reciclaapp.MainActivity;
import com.example.reciclaapp.R;

public class MainCadastro extends AppCompatActivity {

    private Button BtnConfirmar;
    private Button BtnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastro);

        getSupportActionBar().hide();

        BtnConfirmar = findViewById(R.id.BtnConfirmar);
        BtnCancelar  = findViewById(R.id.BtnCancelar);

        BtnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });

        BtnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
