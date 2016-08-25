package com.example.bruno.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSoma, btnSubtracao, btnMultiplica, btnDivisao;
    EditText edtNum1, edtNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSoma = (Button)findViewById(R.id.btnSoma);
        btnSubtracao = (Button)findViewById(R.id.btnSubtracao);
        btnMultiplica = (Button)findViewById(R.id.btnMultiplica);
        btnDivisao = (Button)findViewById(R.id.btnDivisao);
        edtNum1 = (EditText)findViewById(R.id.edtNum1);
        edtNum2 = (EditText)findViewById(R.id.edtNum2);



        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(MainActivity.this, Tela2Activity.class);
                Bundle resultado = new Bundle();
                float soma = (Float.parseFloat(edtNum1.getText().toString()) + Float.parseFloat(edtNum2.getText().toString()));
                resultado.putFloat("resultado", soma);

                tela2.putExtras(resultado);
                startActivity(tela2);
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(MainActivity.this, Tela2Activity.class);
                Bundle resultado = new Bundle();
                float subtracao = (Float.parseFloat(edtNum1.getText().toString()) - Float.parseFloat(edtNum2.getText().toString()));
                resultado.putFloat("resultado", subtracao);

                tela2.putExtras(resultado);
                startActivity(tela2);
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(MainActivity.this, Tela2Activity.class);
                Bundle resultado = new Bundle();
                float multiplica = (Float.parseFloat(edtNum1.getText().toString()) * Float.parseFloat(edtNum2.getText().toString()));
                resultado.putFloat("resultado", multiplica);

                tela2.putExtras(resultado);
                startActivity(tela2);
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(MainActivity.this, Tela2Activity.class);
                Bundle resultado = new Bundle();
                float divisao = (Float.parseFloat(edtNum1.getText().toString()) / Float.parseFloat(edtNum2.getText().toString()));
                resultado.putFloat("resultado", divisao);

                tela2.putExtras(resultado);
                startActivity(tela2);
            }
        });
    }
}
