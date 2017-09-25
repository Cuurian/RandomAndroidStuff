package com.cordova.andres.mensajeportoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView msg = (TextView)findViewById(R.id.TextoAMostrar);
        msg.setTextSize(15);
        msg.setTextColor(Color.argb(255,255,0,0));
        msg.setText("Este es un ejemplo de la utilizacion de mensajes por medio de la propiedad TOAST");

        Button Boton1 = (Button)findViewById(R.id.Boton1);
        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast MensajeToast = Toast.makeText(getApplicationContext(),"\uD83D\uDC1F",Toast.LENGTH_SHORT);
                MensajeToast.show();
            }
        });

        Button Boton2 = (Button)findViewById(R.id.Boton2);
        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast MensajeToast2 = Toast.makeText(getApplicationContext(),"\uD83C\uDF80",Toast.LENGTH_SHORT);
                MensajeToast2.show();
            }
        });
    }
}
