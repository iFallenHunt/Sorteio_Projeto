package com.example.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sortearNumero(View view) {

        TextView texto = findViewById(R.id.textoResultado);
        Random random = new Random();
        int aleatorio = random.nextInt(11);
        texto.setText("Número: " + aleatorio);


    }

}