package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton botaoAbrirInfo, botaoAbrirCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        botaoAbrirInfo=findViewById(R.id.btnInfo);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInfo=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, telaInfo, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCat=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, telaCat, animacao.toBundle());
            }
        });
    }
}