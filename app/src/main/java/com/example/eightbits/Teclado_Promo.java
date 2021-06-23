package com.example.eightbits;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

public class Teclado_Promo extends AppCompatActivity {

    ImageButton botaoAbrirHome, botaoVoltar, botaoAbrirInfo, botaoAbrirCat, teclado1, teclado2, teclado3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_teclado_promo);

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
                Intent it= new Intent(getApplicationContext(),MainActivity.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Teclado_Promo.this, it, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo4);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Teclado_Promo.this, it, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat4);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Teclado_Promo.this, it, animacao.toBundle());
            }
        });

        teclado1=findViewById(R.id.btnTecOf1);
        teclado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/produto/89171/teclado-mecanico-gamer-redragon-kumara-led-vermelho-switch-outemu-blue-pt-k552-2-pt-blue-?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hoRY_EF4scMZ14jf1-mMyJ1DV6cU-pxFZX7DvTmc2ZsBWPt_QeU18aAmJOEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado2=findViewById(R.id.btnTecOf2);
        teclado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=128030&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hu_RVh4dJWVXt41EdgTqTi6P92hvcaiMLkbVB8txOLCBseMLihypMaAqWDEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado3=findViewById(R.id.btnTecOf3);
        teclado3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=130432&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hwqavsJfnSujV6clKgqGcUz9maojAe3F_aJIz2CzgcGYwIrwIeJI0aAvKeEALw_wcB");
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
