package com.example.bruno.trabalho2309;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNome, edtNota1, edtNota2;
    Button btnMedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtNota1 = (EditText) findViewById(R.id.edtNota1);
        edtNota2 = (EditText) findViewById(R.id.edtNota2);
        btnMedia = (Button)findViewById(R.id.btnMedia);


        btnMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela1 = new Intent(MainActivity.this, Main2Activity.class);


                if(edtNome.getText().toString().isEmpty() || edtNota1.getText().toString().isEmpty() || edtNota2.getText().toString().isEmpty()){
                    Toast.makeText(getApplication(),"Preencha todos os campos!",Toast.LENGTH_LONG).show();
                    return;
                }

                float soma = (Float.parseFloat(edtNota1.getText().toString()) + Float.parseFloat(edtNota2.getText().toString()));
                float media = soma / 2;

                if(media >= 0 && media <= 10){

                    Bundle parametros = new Bundle();

                    parametros.putFloat("media", media);


                    tela1.putExtras(parametros);

                    startActivity(tela1);
                } else {
                    Toast.makeText(getApplication(),"Nota Errada",Toast.LENGTH_LONG).show();
                    return;
                }

            }
        });

    }
}
