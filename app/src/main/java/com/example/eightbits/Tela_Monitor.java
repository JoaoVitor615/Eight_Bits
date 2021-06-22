package com.example.eightbits;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

public class Tela_Monitor extends AppCompatActivity {


    ImageButton botaoVoltar, botaoAbrirHome, botaoAbrirInfo, botaoAbrirCat,
    monitor1, monitor2, monitor3, monitor4, monitor5, monitor6, monitor7, monitor8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_monitor);

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
                ActivityCompat.startActivity(Tela_Monitor.this, telaHome, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo4);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInfo=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Monitor.this, telaInfo, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat4);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCat=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Monitor.this, telaCat, animacao.toBundle());
            }
        });

        //LINKS PARA OS SITES DOS PRODUTOS

        monitor1=findViewById(R.id.btnMonitor1);
        monitor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=107267&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6ijruPSETQhNInUnqhBFK9b8OF-YfuB9fJ9d4lonElpAPFJjCpRIHQaAuCGEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor2=findViewById(R.id.btnMonitor2);
        monitor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=130218&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gu8SkQgZ2-65k4uNadEydeXHdazyReI63K_jMTdR0jZ64_Csudxk0aApNmEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor3=findViewById(R.id.btnMonitor3);
        monitor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=114412&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gcaDaqggi5DelG9hxi2zMW8oHoOI_nevhqYz848C5Bhm1yGTtrvmkaAm0xEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor4=findViewById(R.id.btnMonitor4);
        monitor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=103165&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hHUn0aX3kvTgqUKBTBwQZQ7_B5nLdXjob-ETa1GAX4JH98iCngU8caAuQJEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor5=findViewById(R.id.btnMonitor5);
        monitor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.americanas.com.br/produto/1737430161?sellerid=10576972000182&opn=YSMESP&WT.srch=1&epar=bp_pl_00_go_pc_gamer&acc=e789ea56094489dffd798f86ff51c7a9&i=55ef65d06ed24cafb524c7c9&o=5ecfb02ff8e95eac3df06a31&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jlM1BIXb7NmtOfDl9uzKNVAn-yzzvVcFsXisVArgnWtFNK-wxrjFwaAjUMEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor6=findViewById(R.id.btnMonitor6);
        monitor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=111960&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gjE8WXaH3K9bG0bt1fnobHy0s0qHbcoMjAfdRqiIOGmNRD57KqpBgaAoHsEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor7=findViewById(R.id.btnMonitor7);
        monitor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=73689&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6joj6CEaypzX86528vu9UIaOxnK8EC7-e1dK2br1Hr1iPyo0YL62CQaAoHZEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        monitor8=findViewById(R.id.btnMonitor8);
        monitor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=113015&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6iEl6y2EZ53rQ8VBAVqGyPbpT8hwZ09tpPoRTQA04QBEIZkZ4XaU-caAuGoEALw_wcB");
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
