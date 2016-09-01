package com.example.alex.aula_threads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button btnCarregar;
    ImageView imgLogo;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCarregar = (Button)findViewById(R.id.button);
        imgLogo = (ImageView)findViewById(R.id.imageView);

        btnCarregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler = new Handler();

                MinhaThread minhaThread = new MinhaThread();

                minhaThread.start();
            }
        });
    }

    private class MinhaThread extends Thread{
        private void downloadImagem(){
            try {
                //criando url com endereço de imagem
                URL url = new URL("http://www.alfaumuarama.com.br/estrutura/img/logoGrupo.png");

                //baixando a imagem e salvando na memoria (stream)
                InputStream stream = url.openConnection().getInputStream();

                //criando um bitmap com o retorno da URL
                Bitmap bmp = BitmapFactory.decodeStream(stream);

                //adicionando o BMP dentro do ImageView
                imgLogo.setImageBitmap(bmp);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run(){
            handler.post(new Runnable() {
                @Override
                public void run() {
                    downloadImagem();
                    Toast.makeText(MainActivity.this, "Fim da Thread/Download", Toast.LENGTH_LONG).show();

                    //Atualizando a imagem na tela
                    imgLogo.invalidate();
                }
            });
        }
    }
}
