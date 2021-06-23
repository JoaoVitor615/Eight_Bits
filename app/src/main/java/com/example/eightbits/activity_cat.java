package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_cat extends AppCompatActivity {

    ImageButton botaoAbrirHome, botaoAbrirInfo,
    botaoHeadset, botaoMouse, botaoTeclado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        getSupportActionBar().hide();

        botaoAbrirHome=findViewById(R.id.btnHome3);
        botaoAbrirHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(getApplicationContext(),MainActivity.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, it, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo3);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, it, animacao.toBundle());
            }
        });


        //BOTÕES DAS CATEGORIAS
        botaoHeadset=findViewById(R.id.btnHeadset);
        botaoHeadset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirCat = new Intent(getApplicationContext(), Tela_Headset.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, abrirCat, animacao.toBundle());
            }
        });

        botaoMouse=findViewById(R.id.btnMouse);
        botaoMouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirCat = new Intent(getApplicationContext(), Tela_Mouse.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, abrirCat, animacao.toBundle());
            }
        });

        botaoTeclado=findViewById(R.id.btnTeclado);
        botaoTeclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirCat = new Intent(getApplicationContext(), Tela_Teclado.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, abrirCat, animacao.toBundle());
            }
        });

        botaoTeclado=findViewById(R.id.btnMonitor);
        botaoTeclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirCat = new Intent(getApplicationContext(), Tela_Monitor.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, abrirCat, animacao.toBundle());
            }
        });

        botaoTeclado=findViewById(R.id.btnOferta);
        botaoTeclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirCat = new Intent(getApplicationContext(), Tela_Ofertas.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(activity_cat.this, abrirCat, animacao.toBundle());
            }
        });



    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.mover_direita, R.anim.fade_out);
    }
}