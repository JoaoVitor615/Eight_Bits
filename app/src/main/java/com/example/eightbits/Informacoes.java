package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.eightbits.webviews_midias.WebView_Instagram;

public class Informacoes extends AppCompatActivity {

    ImageButton botaoAbrirHome, botaoAbrirCat, botaoInsta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_informacoes);

        botaoAbrirHome=findViewById(R.id.btnHome2);
        botaoAbrirHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaHome= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(telaHome);
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat2);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCat=new Intent(getApplicationContext(), activity_cat.class);
                startActivity(telaCat);
            }
        });


        //Botões de mídia
        botaoInsta=findViewById(R.id.btnInsta);
        botaoInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInsta=new Intent(getApplicationContext(), WebView_Instagram.class);
                startActivity(telaInsta);
            }
        });
    }
}