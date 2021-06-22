package com.example.eightbits;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

public class Tela_Teclado extends AppCompatActivity {

    ImageButton botaoVoltar, botaoAbrirHome, botaoAbrirInfo, botaoAbrirCat,
    teclado1, teclado2, teclado3, teclado4, teclado5, teclado6, teclado7, teclado8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_teclado);

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
                ActivityCompat.startActivity(Tela_Teclado.this, telaHome, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo4);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInfo=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Teclado.this, telaInfo, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat4);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCat=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Teclado.this, telaCat, animacao.toBundle());
            }
        });

        //LINKS PARA OS SITES DOS PRODUTOS

        teclado1=findViewById(R.id.btnTeclado1);
        teclado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=92590&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hw9yXaRJmP1VQqG7BAHSm6lMDByVSWhHKMT2SedJ-ziDwITv3x69kaAoKAEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado2=findViewById(R.id.btnTeclado2);
        teclado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=107334&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6g0dZXNCdWvVZUgID3N2q82Ri4npclbStClWA5HZ7rDEtguZyunFQQaAqhMEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado3=findViewById(R.id.btnTeclado3);
        teclado3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/produto/113078/teclado-mecanico-gamer-redragon-dark-avenger-k568w-rgb-switch-outemu-mk2-blue-abnt2-branco-k568w-rgb-blue-?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6h4KOl59GzcZMM8lM7P2wxs1CEBZn4y6gc35WzOMiZPv6zHxeUXInoaAgqQEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado4=findViewById(R.id.btnTeclado4);
        teclado4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/produto/89171/teclado-mecanico-gamer-redragon-kumara-led-vermelho-switch-outemu-blue-pt-k552-2-pt-blue-?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hoRY_EF4scMZ14jf1-mMyJ1DV6cU-pxFZX7DvTmc2ZsBWPt_QeU18aAmJOEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado5=findViewById(R.id.btnTeclado5);
        teclado5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=88958&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jbQLKcC-2zkSvk4lrzIOy63YX-3nc_newaMB5NqSssw2pbjZeCs7kaAsuyEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado6=findViewById(R.id.btnTeclado6);
        teclado6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=128030&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hu_RVh4dJWVXt41EdgTqTi6P92hvcaiMLkbVB8txOLCBseMLihypMaAqWDEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado7=findViewById(R.id.btnTeclado7);
        teclado7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=130432&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hwqavsJfnSujV6clKgqGcUz9maojAe3F_aJIz2CzgcGYwIrwIeJI0aAvKeEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        teclado8=findViewById(R.id.btnTeclado8);
        teclado8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/produto/100626/teclado-gamer-dazz-rapid-fire-revolution-rainbow-abnt2-625203?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gRVX3cHwRqe6Mdq8eleWhQ0xhmz763yEud7P4aZvvd7dQwsP6z0L0aArmrEALw_wcB");
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
