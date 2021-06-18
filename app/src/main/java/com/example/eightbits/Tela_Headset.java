package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tela_Headset extends AppCompatActivity {

    ImageButton botaoAbrirHome, botaoVoltar, botaoAbrirInfo, botaoAbrirCat, headset1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela__headset);

        botaoVoltar=findViewById(R.id.btnVoltar2);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        botaoAbrirHome=findViewById(R.id.btnHome5);
        botaoAbrirHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaHome= new Intent(getApplicationContext(),MainActivity.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Headset.this, telaHome, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo4);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInfo=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Headset.this, telaInfo, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat4);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCat=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Headset.this, telaCat, animacao.toBundle());
            }
        });


        //LINKS PARA OS SITES DOS PRODUTOS
        headset1=findViewById(R.id.btnHeadset1);
        headset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.submarino.com.br/produto/2154989114?loja=37788947000119&epar=bp_pl_00_go_g35169&opn=XMLGOOGLE&WT.srch=1&acc=d47a04c6f99456bc289220d5d0ff208d&i=5f322fb649f937f625326d98&o=5f7850e9f8e95eac3daaf9c4&gclid=Cj0KCQjw5auGBhDEARIsAFyNm9HsT8jFbAhp1-5VSPV7gbvzqIYJ9msDl6wXMHg_6bpA8Xz3fcxPgWIaAn1XEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.mover_direita, R.anim.fade_out);
    }
}