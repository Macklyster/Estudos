package com.example.alex.aula28_09_json;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alex on 28/09/16.
 */
public class BuscarDadosWeb extends AsyncTask<String, Void, ArrayList<HashMap<String,String>>> {

    @Override
    protected ArrayList<HashMap<String, String>> doInBackground(String... strings) {
        ArrayList<HashMap<String, String>>  listaDados = new ArrayList<HashMap<String, String>>();

        try{

            //criando o objeto com a url enviada via parametro
            URL url = new URL(strings[0]);

            //criando uma conexao com a url
            URLConnection conexao = url.openConnection();

            //carregando na memoria o conteudo da url
            InputStreamReader stream = new InputStreamReader(conexao.getInputStream());
            BufferedReader buffer = new BufferedReader(stream);

            //criando um objeto string nulo, para receber os dados da url
            String linha;

            //o readLine le o conteudo da linha do retorno da url e seta o cursor para a proxima linha
            while((linha = buffer.readLine()) != null) {
                //criando um array do JSON com a linha retornada da url
                JSONArray ja = new JSONArray(linha);

                for(int i = 0; i < ja.length(); i++){
                    //carregando o registro do JSON do array em um obj
                    JSONObject obj = (JSONObject)ja.get(i);

                    HashMap<String, String> dados = new HashMap<String, String>();
                    dados.put("cod", obj.getString("cod"));
                    dados.put("nome", obj.getString("nome"));
                    dados.put("img", obj.getString("img"));

                    //adicionando o dicionario criado na lista de retorno
                    listaDados.add(dados);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return listaDados;
    }
}
