package com.example.eightbits.webviews_midias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.eightbits.R;

public class WebView_Instagram extends AppCompatActivity {

    private WebView webviewInsta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_web_view__instagram);

        webviewInsta=findViewById(R.id.WVInstagram);
        webviewInsta.loadUrl("https://www.instagram.com/eightbitsoficial/");


    }
}