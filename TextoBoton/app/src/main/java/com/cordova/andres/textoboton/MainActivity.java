package com.cordova.andres.textoboton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int p1 = 0;
    int p2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView msg = (TextView) findViewById(R.id.CajaTexto);
        msg.setTextSize(15);
        msg.setTextColor(Color.argb(255,255,0,0));
        msg.setText("Ejemplo que muestra texto en los botones");

        Button Boton1 = (Button)findViewById(R.id.Boton1);
        Button Boton2 = (Button)findViewById(R.id.Boton2);
        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               p1++;
                ((TextView)view).setText("Pulsaste el boton " + p1 + " Veces");
            }
        });
        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2++;
                ((TextView)view).setText("Pulsaste el boton " + p2 + " Veces");
            }
        });
    }
}
