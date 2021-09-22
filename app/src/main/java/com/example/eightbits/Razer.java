package com.example.eightbits;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

public class Razer extends AppCompatActivity {

    ImageButton botaoVoltar,
    razer1, razer2, razer3, razer4, razerLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_razer);

        botaoVoltar=findViewById(R.id.btnVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //LINKS PARA OS SITES DOS PRODUTOS

        razer1=findViewById(R.id.btnRazer1);
        razer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.pichau.com.br/mouse-gamer-razer-naga-x-chroma-18000dpi-rz01-03590100-r3u1?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6iHk_aNtBKYAwLHCZgIlQ0CepefHQTtrorIa9MicBcVykxmkuRUl4caAvJ-EALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        razer2=findViewById(R.id.btnRazer2);
        razer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=104147&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hDBh4CqVzMvEZE-inoJtNMLMhFxEJ66LBv69PBu-Uh4CJGx9oL4zkaAvwvEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        razer3=findViewById(R.id.btnRazer3);
        razer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/produto/149298/mouse-gamer-razer-basilisk-v2-chroma-optical-switch-11-botoes-20000dpi-rz01-03160100-r3u1?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jrJ4SwRY_-IODn0B005l7LeV7QJnini0_oSSVdd0jL8CxidwLG-YwaAmlREALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        razer4=findViewById(R.id.btnRazer4);
        razer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=109815&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gRVEq2NkJcVsjr-NKdpNnFNweXfpM8GCmVAjSz8afRQ4KTnUOF-1gaAlexEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        razerLink=findViewById(R.id.btnRazerLink);
        razerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.razer.com/pc/gaming-mice");
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
