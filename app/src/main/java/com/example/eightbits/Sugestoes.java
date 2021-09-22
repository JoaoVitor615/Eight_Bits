package com.example.eightbits;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;

public class Sugestoes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sugestoes);

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        EditText editText = (EditText) findViewById(R.id.edittextSug);
        CharSequence dadosSug = editText.getText();
        outState.putCharSequence("DadoSalvo", dadosSug);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        CharSequence dadosSalvos = savedInstanceState.getCharSequence("DadoSalvo");
        EditText myEditText = (EditText)findViewById(R.id.edittextSug);
        myEditText.setText(dadosSalvos);
    }
}