package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener sensorEventListener;
    int aparecer = 0;

    ImageButton botaoCompras, botaoAbrirInfo, botaoAbrirCat, botaoRazer, botaoHyperx, monitor1, monitor2, botaoPromoTec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
        sensor= sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if(sensor==null)
            finish();

        sensorEventListener=new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorevent) {
                float x = sensorevent.values[0];

                System.out.println("Valor GiroX" + x);

                if(x<-5 && aparecer == 0) {
                    aparecer++;
                    mensagem();
                } else if(x>-5 && aparecer == 1) {
                    aparecer++;
                }
                if(aparecer == 2) {
                    aparecer = 0;
                }

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {


            }
        };

        Start();

        botaoAbrirInfo=findViewById(R.id.btnInfo);
        botaoAbrirInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Informacoes.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, it, animacao.toBundle());
            }
        });

        botaoAbrirCat=findViewById(R.id.btnMenuCat);
        botaoAbrirCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(getApplicationContext(), activity_cat.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, it, animacao.toBundle());
            }
        });

        botaoCompras = findViewById(R.id.btnCompras);
        botaoCompras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(getApplicationContext(), Compras.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, it, animacao.toBundle());
            }
        });

        botaoPromoTec=findViewById(R.id.btnPromoTeclado);
        botaoPromoTec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(getApplicationContext(),Teclado_Promo.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, it, animacao.toBundle());
            }
        });

        botaoRazer=findViewById(R.id.btnRazer);
        botaoRazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(getApplicationContext(),Razer.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, it, animacao.toBundle());
            }
        });

        botaoHyperx=findViewById(R.id.btnHyperx);
        botaoHyperx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Hyperx.class);
                ActivityOptionsCompat animacao = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_esquerda, R.anim.fade_out);
                ActivityCompat.startActivity(MainActivity.this, it, animacao.toBundle());
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

    private void Start() {
        sensorManager.registerListener(sensorEventListener,sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }
    private void Stop() {
        sensorManager.unregisterListener(sensorEventListener);
    }
    @Override
    protected void onPause(){
        super.onPause();
        Stop();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Start();
    }
    private void mensagem(){
        Toast.makeText(this, getString(R.string.toastSensor), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.mover_direita, R.anim.fade_out);
    }
}