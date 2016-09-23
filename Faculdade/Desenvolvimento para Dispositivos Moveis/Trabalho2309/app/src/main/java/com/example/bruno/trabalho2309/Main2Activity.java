package com.example.bruno.trabalho2309;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textMedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textMedia = (TextView)findViewById(R.id.textMedia);

        Intent pegaTela = getIntent();

        Bundle parametros = pegaTela.getExtras();
        textMedia.setText(String.valueOf(parametros.getFloat("media")));

        Button btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
