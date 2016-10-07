package com.example.alex.aula05_10_bancodados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nome = "Marcos";
        String ra = "0123456789";
        String cidade = "Umuarama";

        BancoDeDados banco = new BancoDeDados();
        banco.abrirBanco(MainActivity.this);
        banco.inserirAluno(nome, ra, cidade);

        ArrayList<HashMap<String, String>>

        banco.fecharBanco();
    }
}
