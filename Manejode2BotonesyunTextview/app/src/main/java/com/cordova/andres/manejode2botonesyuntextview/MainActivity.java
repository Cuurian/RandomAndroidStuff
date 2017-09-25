package com.cordova.andres.manejode2botonesyuntextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Mensaje = (TextView)findViewById(R.id.MyTextView);
        Mensaje.setTextSize(30);
        Mensaje.setTextColor(Color.argb(255,255,0,0));
        Mensaje.setText("Ejemplo Que muestra Mensajes Enviados desde distintos Botones");

        Button Boton1 = (Button) findViewById(R.id.MyButton1);
        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mensaje.setText("Has presionado el Boton 1 \uD83D\uDC1F");
                Mensaje.setTextColor(Color.argb(255,0,0,255));
            }
        });

        Button Boton2 = (Button) findViewById(R.id.MyButton2);
        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mensaje.setText("Has presionado el Boton 2 \uD83C\uDF80");
                Mensaje.setTextColor(Color.argb(255,0,255,0));
            }
        });
    }
}
