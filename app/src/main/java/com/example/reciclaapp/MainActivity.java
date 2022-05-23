package com.example.reciclaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.reciclaapp.Cadastro.MainCadastro;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button BtnCadastrar;
    private RadioGroup RadioLogin;
    private RadioButton RadioCPF;
    private RadioButton RadioCNPJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btnLogin     = findViewById(R.id.BtnLogin);
        BtnCadastrar = findViewById(R.id.BtnCadastrar);
        RadioCPF     = findViewById(R.id.RadioCPF);
        RadioLogin   = findViewById(R.id.RadioLogin);
        RadioCNPJ    = findViewById(R.id.RadioCNPJ);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstTrilhaEscolher.class);

                if (RadioCPF.isChecked()) {
                    intent.putExtra("tipoPessoa", "CPF");
                } else if (RadioCNPJ.isChecked()) {
                    intent.putExtra("tipoPessoa", "CNPJ");
                } else {
                    intent.putExtra("tipoPessoa", "COLETOR");
                }

                startActivity(intent);
            }
        });

        BtnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainCadastro.class);

                startActivity(intent);
            }
        });
    }
}
