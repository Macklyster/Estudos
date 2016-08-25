package com.example.bruno.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView campoResultado;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        campoResultado = (TextView)findViewById(R.id.campoResultado);

        Intent tela2 = getIntent();
        if (tela2 != null){
            Bundle resultado = tela2.getExtras();
            if (resultado != null){
                campoResultado.setText(String.valueOf(resultado.getFloat("resultado")));
            }
        }
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
