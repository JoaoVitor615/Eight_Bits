package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_cat extends AppCompatActivity {

    ImageButton botaoAbrirHome, botaoAbrirInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        getSupportActionBar().hide();

        botaoAbrirHome=findViewById(R.id.btnHome3);
        botaoAbrirHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaHome= new Intent(getApplicationContext(),MainActivity.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, telaHome, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo3);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInfo=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, telaInfo, animacao.toBundle());
            }
        });
    }
}