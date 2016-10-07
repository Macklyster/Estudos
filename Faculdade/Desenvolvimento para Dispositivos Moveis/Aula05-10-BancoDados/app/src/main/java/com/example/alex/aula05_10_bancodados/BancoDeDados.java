package com.example.alex.aula05_10_bancodados;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alex on 05/10/16.
 */
public class BancoDeDados {
    SQLiteDatabase bancoDados;
    Cursor cursor;

    public void abrirBanco(Context context){
        if(bancoDados != null) {
            if(bancoDados.isOpen() == false) {
                //Caso o banco não exista, cria, e depois abre o banco de dados
                bancoDados = context.openOrCreateDatabase("dbAula.db", SQLiteDatabase.OPEN_READWRITE, null);
            }
            return;
        }

        //comando para criar a tabela caso a mesma não exista
        String sql = "CREATE TABLE IF NOT EXISTS tbAluno (id INTEGER PRIMARY KEY, nome TEXT, ra TEXT)";

        //executando o comando SQL
        bancoDados.execSQL(sql);

        if(existeColuna(bancoDados, "tbAluno", "cidade") == false){
            bancoDados.execSQL("ALTER TABLE tbAluno ADD COLUMN cidade TEXT");
        }
    }

    private boolean existeColuna(SQLiteDatabase banco, String tabela, String coluna){
        try{
            //buscando a estrutura da tabela
            Cursor cursor = banco.rawQuery("SELECT * FROM tabela LIMIT 0", null);

            //verificando se a coluna existe na tabela
            return (cursor.getColumnIndex(coluna) != -1);

        }catch(Exception e){
            return false;
        }
    }

    public void fecharBanco(){

        //verifica se o banco está instanciado, se sim, fecha a conexão.
        if(bancoDados != null) {
            bancoDados.close();
        }

    }

    public void inserirAluno(String nome, String ra, String cidade){
        String sql = "INSERT INTO tbAluno (nome, ra, cidade) VALUES (" + "'" +nome + "','" + ra + "','" + cidade + "'" + ")";

        bancoDados.execSQL(sql);
    }

    public void excluirAluno(String ra){
        String sql = " DELETE FROM tbAluno WHERE ra = '" + ra + "'";
        bancoDados.execSQL(sql);
    }

    public ArrayList<HashMap<String, String>> buscarAlunos(String nome, String ra, String cidade){
        String condicao = "";
        String operador = "";

        //se o nome não está vazio monta a condição de filtro do nome
        if(nome.isEmpty() == false){
            condicao += operador + "nome = '" + nome + "'";
            operador = "AND";
        }

        //se o RA não está vazio monta a condição de filtro do RA
        if(ra.isEmpty() == false){
            condicao += operador + "nome = '" + nome + "'";
            operador = "AND";
        }

        //se o cidade não está vazio monta a condição de filtro do cidade
        if(cidade.isEmpty() == false){
            condicao += operador + "nome = '" + nome + "'";
            operador = "AND";
        }

        cursor = bancoDados.query("tbAluno", new String[] {"nome", "ra", "cidade"}, null, null, null,"nome ASC", null);

        return retornaLista(cursor);
    }

    private ArrayList<HashMap<String, String>> retornaLista(Cursor cursor){
        ArrayList<HashMap<String, String>> retorno = new ArrayList<HashMap<String, String>>();
        if(cursor.getCount() > 0){
            //move o cursor para o primeiro registro
            cursor.moveToFirst();

            for(int i = 0; i< cursor.getCount(); i++){
                HashMap<String, String> item = new HashMap<String, String>();

                //buscando o valor do cursor e adicionando no HashMap
                item.put("nome", cursor.getString(cursor.getColumnIndex("nome")));
                item.put("ra", cursor.getString(cursor.getColumnIndex("ra")));
                item.put("cidade", cursor.getString(cursor.getColumnIndex("cidade")));

                retorno.add(item);

                //movendo o cursor para o proximo registro
                cursor.moveToNext();
            }
        }
        return retorno;
    }
}
