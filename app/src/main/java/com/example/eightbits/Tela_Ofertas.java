package com.example.eightbits;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

public class Tela_Ofertas extends AppCompatActivity {

    ImageButton botaoVoltar, botaoAbrirHome, botaoAbrirInfo, botaoAbrirCat,
    oferta1, oferta2, oferta3, oferta4, oferta5, oferta6, oferta7, oferta8, oferta9, oferta10, oferta11, oferta12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_ofertas);

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
                ActivityCompat.startActivity(Tela_Ofertas.this, it, animacao.toBundle());
            }
        });

        botaoAbrirInfo=findViewById(R.id.btnInfo4);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Ofertas.this, it, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat4);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCat=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Tela_Ofertas.this, telaCat, animacao.toBundle());
            }
        });

        //LINKS PARA OS SITES DOS PRODUTOS

        oferta1=findViewById(R.id.btnOf1);
        oferta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://m.kabum.com.br/produto/100273/headset-gamer-logitech-g332-stereo-drivers-50-mm-multi-plataforma-981-000755?codigo=100273&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6h7ArObWq9m3SYarSjRNDhZF6QipK1BIQStuhaBh1MHV1RXQErJF8oaArgOEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta2=findViewById(R.id.btnOf2);
        oferta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.com.br/HyperX-STINGER-HX-HSCSC2-BK-WW-Pequeno/dp/B083Q6Q41G/ref=asc_df_B083Q6Q41G/?tag=googleshopp00-20&linkCode=df0&hvadid=393528102708&hvpos=&hvnetw=g&hvrand=16327734715695036937&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-898159447421&psc=1");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta3=findViewById(R.id.btnOf3);
        oferta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://m.kabum.com.br/produto/130218/monitor-lg-led-27-4k-uhd-ips-hdmi-displayport-amd-radeon-freesync-altura-ajust-vel-vesa-27mu58p-b-awz?codigo=130218&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gu8SkQgZ2-65k4uNadEydeXHdazyReI63K_jMTdR0jZ64_Csudxk0aApNmEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta4=findViewById(R.id.btnOf4);
        oferta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://m.kabum.com.br/produto/114412/monitor-gamer-ozone-dsp24-240-24-full-hd-freesync-g-sync-240-hz-1-ms-frameless-ozdsp24fhd240-fless?codigo=114412&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gcaDaqggi5DelG9hxi2zMW8oHoOI_nevhqYz848C5Bhm1yGTtrvmkaAm0xEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta5=findViewById(R.id.btnOf5);
        oferta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.americanas.com.br/produto/1737430161?sellerid=10576972000182&opn=YSMESP&WT.srch=1&epar=bp_pl_00_go_pc_gamer&acc=e789ea56094489dffd798f86ff51c7a9&i=55ef65d06ed24cafb524c7c9&o=5ecfb02ff8e95eac3df06a31&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jlM1BIXb7NmtOfDl9uzKNVAn-yzzvVcFsXisVArgnWtFNK-wxrjFwaAjUMEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta6=findViewById(R.id.btnOf6);
        oferta6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=111960&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6gjE8WXaH3K9bG0bt1fnobHy0s0qHbcoMjAfdRqiIOGmNRD57KqpBgaAoHsEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta7=findViewById(R.id.btnOf7);
        oferta7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=117217&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6iEn5Z2OW7VB-RuIYUXuMdRb4YKGnqn28C0HTHhxQUMF1JppYnUQwcaAkynEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta8=findViewById(R.id.btnOf8);
        oferta8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=109788&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jEdI2M_81EG27wgUZa4BhFkfZZtj3LnH5rkugzAR7fehT2w5VhxNoaAqi_EALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta9=findViewById(R.id.btnOf9);
        oferta9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=130216&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jvxYEp0DC8-hcELXwrRLtCwKwDjuzt1MlP-wZdtjOchXM1-53w3SEaAsB_EALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta10=findViewById(R.id.btnOf10);
        oferta10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/produto/89171/teclado-mecanico-gamer-redragon-kumara-led-vermelho-switch-outemu-blue-pt-k552-2-pt-blue-?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hoRY_EF4scMZ14jf1-mMyJ1DV6cU-pxFZX7DvTmc2ZsBWPt_QeU18aAmJOEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta11=findViewById(R.id.btnOf11);
        oferta11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kabum.com.br/cgi-local/site/produtos/descricao_ofertas.cgi?codigo=128030&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6hu_RVh4dJWVXt41EdgTqTi6P92hvcaiMLkbVB8txOLCBseMLihypMaAqWDEALw_wcB");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(Intent.createChooser(it, "Escolha o aplicativo"));
            }
        });

        oferta12=findViewById(R.id.btnOf12);
        oferta12.setOnClickListener(new View.OnClickListener() {
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
