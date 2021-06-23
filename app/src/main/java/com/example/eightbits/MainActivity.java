package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton botaoAbrirInfo, botaoAbrirCat, botaoRazer, botaoHyperx, monitor1, monitor2;
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

        botaoRazer=findViewById(R.id.btnRazer);
        botaoRazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInfo=new Intent(getApplicationContext(),Razer.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, telaInfo, animacao.toBundle());
            }
        });

        botaoHyperx=findViewById(R.id.btnHyperx);
        botaoHyperx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInfo=new Intent(getApplicationContext(),Hyperx.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, telaInfo, animacao.toBundle());
            }
        });

        monitor1=findViewById(R.id.btnMonitor_Home1);
        monitor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=111960&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gjE8WXaH3K9bG0bt1fnobHy0s0qHbcoMjAfdRqiIOGmNRD57KqpBgaAoHsEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor2=findViewById(R.id.btnMonitor_Home2);
        monitor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.americanas.com.br/produto/1737430161?sellerid=10576972000182&opn=YSMESP&WT.srch=1&epar=bp_pl_00_go_pc_gamer&acc=e789ea56094489dffd798f86ff51c7a9&i=55ef65d06ed24cafb524c7c9&o=5ecfb02ff8e95eac3df06a31&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jlM1BIXb7NmtOfDl9uzKNVAn-yzzvVcFsXisVArgnWtFNK-wxrjFwaAjUMEALw_wcB");
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