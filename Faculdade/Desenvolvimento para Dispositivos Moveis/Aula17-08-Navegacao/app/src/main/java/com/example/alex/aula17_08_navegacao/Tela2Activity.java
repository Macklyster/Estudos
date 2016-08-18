package com.example.alex.aula17_08_navegacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        campoNome = (TextView)findViewById(R.id.campoNome);

        //buscando o caminho (Intent) vindo da tela Main
        Intent tela = getIntent();

        if(tela != null){
          //buscando os parametros que vieram da tela Main
            Bundle parametros = tela.getExtras();
            if(parametros != null){
                //carregamento no campo da tela o parametro NOME
                campoNome.setText(parametros.getString("nome"));
            }
        }
    }
}
