package com.cordova.andres.append;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView MiTexto = (TextView) findViewById(R.id.myTextView);
        MiTexto.setTextSize(15);
        MiTexto.setTextColor(Color.argb(255,0,0,0));
        MiTexto.setText("Texto Definido con Set TEXT");
        // Utilizacion del APPEND

        MiTexto.append("\n Primer Texto Definido con APPEND");
        MiTexto.append("\n Segundo Texto Definido con APPEND");
        MiTexto.append("\n Tercer Texto Definido con APPEND");

        MiTexto.append("\n \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F");
        MiTexto.append("\n \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F");
        MiTexto.append("\n \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F");
        MiTexto.append("\n \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F");
        MiTexto.append("\n \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F");
        MiTexto.append("\n \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F");
        MiTexto.append("\n \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F \uD83D\uDC1F");

    }
}
