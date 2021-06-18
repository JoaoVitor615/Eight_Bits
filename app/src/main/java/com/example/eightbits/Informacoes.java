package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Informacoes extends AppCompatActivity {

    ImageButton botaoAbrirHome, botaoAbrirCat, botaoInsta, botaoFace, botaoTel;
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
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Informacoes.this, telaHome, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat2);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCat=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Informacoes.this, telaCat, animacao.toBundle());
            }
        });

        //Botões de mídia

        botaoInsta=findViewById(R.id.btnInsta);
        botaoInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/eightbitsoficial/");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, getString(R.string.chooseInsta)));
            }
        });

        botaoFace=findViewById(R.id.btnFace);
        botaoFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, getString(R.string.chooseInsta)));
            }
        });

        botaoTel=findViewById(R.id.btnTel);
        botaoTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:123456789");
                Intent it = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(it);
            }
        });


    }



    public void abrirTwitter(View view)
    {
        Uri uri_t = Uri.parse("https://www.twitter.com");
        Intent it_t = new Intent(Intent.ACTION_VIEW,uri_t);
        startActivity(Intent.createChooser(it_t, "Escolha o n"));
    }

    public void abrirMapa(View view)
    {
        Uri location= Uri.parse("geo:0,0?q=Etec+Professor+Basilides+de+Godoy");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void enviarEmail(View view) throws UnsupportedEncodingException {

        String uriText =
                "mailto:eightbits.supqorte@gmail.com" +
                        "?subject=" + URLEncoder.encode("", "utf-8") +
                        "&body=" + URLEncoder.encode("", "utf-8");
        Uri uri = Uri.parse(uriText);
        Intent it = new Intent(Intent.ACTION_SENDTO);
        it.setData(uri);
        startActivity(Intent.createChooser(it, getString(R.string.chooseEmail)));
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.mover_direita, R.anim.fade_out);
    }
}