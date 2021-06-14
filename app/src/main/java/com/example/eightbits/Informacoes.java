package com.example.eightbits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Informacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_informacoes);
    }
}