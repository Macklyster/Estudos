package com.example.alex.aula28_09_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String endereco = "http://wwww.marcosvendramini.com.br/Get/Estereogramas.aspx";

        ArrayList<HashMap<String, String>> listaDados;

        try {

            //chamando a classe para buscar e carregar os dados da url
            listaDados = new BuscarDadosWeb().execute(endereco).get();

            HashMap<String, String> item = listaDados.get(0);
            Toast.makeText(this, item.get("nome"), Toast.LENGTH_LONG).show();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
