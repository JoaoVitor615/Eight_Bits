package com.example.eightbits;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Informacoes extends AppCompatActivity {
    public static final String PREFS_NAME = "memoria";
    SharedPreferences settings;
    int contador = 0;

    ImageButton botaoCoracao, botaoSugestoes, botaoAbrirHome, botaoAbrirCat, botaoInsta, botaoFace, botaoTel;
    TextView txtCoracao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        settings = getSharedPreferences(PREFS_NAME, 0);
        contador = settings.getInt( "contador", contador);
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_informacoes);

        botaoSugestoes = findViewById(R.id.btnSugestoes);
        botaoSugestoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(getApplicationContext(),Sugestoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Informacoes.this, it, animacao.toBundle());
            }
        });

        botaoAbrirHome=findViewById(R.id.btnHome2);
        botaoAbrirHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(getApplicationContext(),MainActivity.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Informacoes.this, it, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat2);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(Informacoes.this, it, animacao.toBundle());
            }
        });

        //Bot??es de m??dia

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
                Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100069735286308&viewas=100000686899395");
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

        //shared preferences

        settings = getSharedPreferences(PREFS_NAME, 0);
        contador = settings.getInt( "contador", contador);
        botaoCoracao = findViewById(R.id.btnCoracao);
        txtCoracao = findViewById(R.id.txtCoracao);
        contarLike();
        botaoCoracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                if(contador%2==1){
                    botaoCoracao.setImageResource(R.drawable.coracao_p);
                }
                else{
                    botaoCoracao.setImageResource(R.drawable.coracao_v);
                }
                contarLike();
                settings.edit().putInt("contador", contador).apply();
            }
        });
    }
    //Contar likes:)
    private void contarLike() {
        String s =Integer.toString(contador);
        txtCoracao.setText(s + " Likes");
    }


    public void abrirTwitter(View view)
    {
        Uri uri_t = Uri.parse("https://twitter.com/eightbits5");
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