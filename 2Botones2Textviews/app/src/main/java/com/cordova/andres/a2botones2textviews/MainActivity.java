package com.cordova.andres.a2botones2textviews;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Mensaje1 = (TextView)findViewById(R.id.Texto1);
        final TextView Mensaje2 = (TextView)findViewById(R.id.Texto2);
        Button Boton1 = (Button)findViewById(R.id.Boton1);
        Button Boton2 = (Button)findViewById(R.id.Boton2);
        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mensaje1.setText("Has presionado el Boton 1 \uD83D\uDC1F");
                Mensaje1.setTextColor(Color.argb(255,0,0,255));
            }
        });
        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mensaje2.setText("Has presionado el Boton 2 \uD83D\uDC1F");
                Mensaje2.setTextColor(Color.argb(255,0,0,255));
            }
        });
    }
}
