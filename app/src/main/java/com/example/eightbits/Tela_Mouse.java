package com.example.eightbits;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;


public class Tela_Mouse extends AppCompatActivity {

    ImageButton  botaoVoltar, botaoAbrirHome, botaoAbrirInfo, botaoAbrirCat,
            mouse1, mouse2, mouse3, mouse4, mouse5, mouse6, mouse7, mouse8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_mouse);

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
                ActivityCompat.startActivity(Tela_Mouse.this, it, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo4);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Mouse.this, it, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat4);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Mouse.this, it, animacao.toBundle());
            }
        });

        //LINKS PARA OS SITES DOS PRODUTOS

        mouse1=findViewById(R.id.btnTecOf1);
        mouse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=117217&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6iEn5Z2OW7VB-RuIYUXuMdRb4YKGnqn28C0HTHhxQUMF1JppYnUQwcaAkynEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        mouse2=findViewById(R.id.btnTecOf2);
        mouse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.com.br/Mouse-Gamer-Logitech-G403-Hero/dp/B07W6PD7QJ/ref=asc_df_B07W6PD7QJ/?tag=googleshopp00-20&linkCode=df0&hvadid=381324120234&hvpos=&hvnetw=g&hvrand=5250766696835806525&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-882992992520&psc=1");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        mouse3=findViewById(R.id.btnMouse3);
        mouse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://produto.mercadolivre.com.br/MLB-1767181074-mouse-gamer-redragon-storm-m808-rgb-12400dpi-preto-_JM?matt_tool=70509262&matt_word=&matt_source=google&matt_campaign_id=12408848785&matt_ad_group_id=119017168518&matt_match_type=&matt_network=g&matt_device=c&matt_creative=500385009285&matt_keyword=&matt_ad_position=&matt_ad_type=pla&matt_merchant_id=227521027&matt_product_id=MLB1767181074&matt_product_partition_id=296321646450&matt_target_id=pla-296321646450&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hj7VpnL-LWNW2CpmA1ASgZnOM5Jpb1JpoVXepF_Wnbpu0PHgt1IX8aAq_rEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        mouse4=findViewById(R.id.btnMouse4);
        mouse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=109788&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jEdI2M_81EG27wgUZa4BhFkfZZtj3LnH5rkugzAR7fehT2w5VhxNoaAqi_EALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        mouse5=findViewById(R.id.btnMouse5);
        mouse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=98696&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6iIYIBjWlPBGzI2m5EeMiKt7alwT3cgcHFNTOHFQrAY24mE0kw5Vr4aAottEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        mouse6=findViewById(R.id.btnMouse6);
        mouse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=128205&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6i_2XmzP2PssK3Zs_Xgsjq4bCOpy5cwV1uQ0_4VOKQ9fyXr7En_tcgaAo5nEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        mouse7=findViewById(R.id.btnMouse7);
        mouse7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=94555&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hZ7AEotXl4-epq2S8f19NMsy4j3aBYVEqlgUA0pmx_mWrmAPQj2p4aAqVsEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        mouse8=findViewById(R.id.btnMouse8);
        mouse8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=130216&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jvxYEp0DC8-hcELXwrRLtCwKwDjuzt1MlP-wZdtjOchXM1-53w3SEaAsB_EALw_wcB");
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
