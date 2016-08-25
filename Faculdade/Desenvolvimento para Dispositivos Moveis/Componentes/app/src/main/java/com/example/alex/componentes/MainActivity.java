package com.example.alex.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //declarando a imagem e o botão do activity_main
    ImageView imagem;
    ToggleButton botao;
    SeekBar barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vinculando os objetos da tela com os do java
        imagem = (ImageView)findViewById(R.id.imageView);
        botao = (ToggleButton)findViewById(R.id.toggleButton);
        barra = (SeekBar)findViewById(R.id.seekBar);

        //definição dos valores padrão
        barra.setMax(255);
        barra.setProgress(255);
        botao.setChecked(true);

        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //passando o valor atual da barra para o Alpha da imagem
                imagem.setAlpha(barra.getProgress());
                botao.setChecked(barra.getProgress() > 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //adicionando o evento Listener do click do botão
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(botao.isChecked()){
                    imagem.setAlpha(255);
                    barra.setProgress(255);
                }
                else{
                    imagem.setAlpha(0);
                    barra.setProgress(0);
                }
            }
        });
    }
}
