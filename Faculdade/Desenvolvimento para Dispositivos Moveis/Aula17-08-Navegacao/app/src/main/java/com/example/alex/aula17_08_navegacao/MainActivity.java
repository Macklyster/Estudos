package com.example.alex.aula17_08_navegacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText)findViewById(R.id.edtNome);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //criando o caminho para abrir a segunda tela
                Intent tela = new Intent(MainActivity.this, Tela2Activity.class);

                //criando objeto que recebera os parametros
                Bundle parametros = new Bundle();

                //adicionando o nome do campo Nome nos parametros
                parametros.putString("nome",edtNome.getText().toString());

                //adicionando o parametro no caminho
                tela.putExtras(parametros);

                //abrindo a segunda tela com os parametros
                startActivity(tela);
            }
        });
    }
}
