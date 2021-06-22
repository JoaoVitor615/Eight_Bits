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

    ImageButton botaoAbrirHome, botaoVoltar, botaoAbrirInfo, botaoAbrirCat,
            headset1, headset2, headset3, headset4, headset5, headset6, headset7, headset8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela__headset);

        botaoVoltar=findViewById(R.id.btnVoltar);
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

        headset1=findViewById(R.id.btnMouse1);
        headset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.submarino.com.br/produto/2154989114?loja=37788947000119&epar=bp_pl_00_go_g35169&opn=XMLGOOGLE&WT.srch=1&acc=d47a04c6f99456bc289220d5d0ff208d&i=5f322fb649f937f625326d98&o=5f7850e9f8e95eac3daaf9c4&gclid=Cj0KCQjw5auGBhDEARIsAFyNm9HsT8jFbAhp1-5VSPV7gbvzqIYJ9msDl6wXMHg_6bpA8Xz3fcxPgWIaAn1XEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        headset2=findViewById(R.id.btnMouse2);
        headset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=100273&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6h7ArObWq9m3SYarSjRNDhZF6QipK1BIQStuhaBh1MHV1RXQErJF8oaArgOEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        headset3=findViewById(R.id.btnHeadset3);
        headset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.com.br/HyperX-STINGER-HX-HSCSC2-BK-WW-Pequeno/dp/B083Q6Q41G/ref=asc_df_B083Q6Q41G/?tag=googleshopp00-20&linkCode=df0&hvadid=393528102708&hvpos=&hvnetw=g&hvrand=16327734715695036937&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-898159447421&psc=1");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        headset4=findViewById(R.id.btnHeadset4);
        headset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=134027&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jgbDw2KzGjFP4wwioWE2c4p67est9fQGhzFISqYiUD943CamOWVP0aAlljEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        headset5=findViewById(R.id.btnHeadset5);
        headset5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=93168&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gV-eInXTkGZH9WoGPy2FNlTP5fKt50w_G6xFtwrKQ-DpIW4lMNvSYaAm3qEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        headset6=findViewById(R.id.btnHeadset6);
        headset6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=104952&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hFQeZ7TS8krMLsicz0qu_WYNPFX1zCJx5n9UBGG1Kx5njfe9vYlzUaAv4KEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        headset7=findViewById(R.id.btnHeadset7);
        headset7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=87352&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jDZUhjYPjo14HMVRH89LhFdK_svtPFgvqXMvl6WlK-chw1IiLo7HIaAnnMEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        headset8=findViewById(R.id.btnHeadset8);
        headset8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=70078&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6id2JFuFRlnu09eFpuYUrNBw7GatQrEK2rfSyD3-lAaozwxWzNTljYaArVWEALw_wcB");
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