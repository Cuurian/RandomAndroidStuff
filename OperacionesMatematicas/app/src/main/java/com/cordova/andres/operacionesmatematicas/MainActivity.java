package com.cordova.andres.operacionesmatematicas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double A = 10.50;
    double B = 20.50;
    double C = A + B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Texto Utilizando TextView
        TextView mensaje = (TextView) findViewById(R.id.myTextView);
        mensaje.setText("\n Tabla de la funcion seno en un rango del 0 al 10:");
        mensaje.setTextSize(18);
        mensaje.setTextColor(Color.argb(255,0,0,255));

        //Texto Utilizando metodo Print
        LinearLayout TextoLayout = (LinearLayout) findViewById(R.id.myLinearLayout);

        //fish = 🐟
        for(int i=0; i<=100;i++)
        {
            double x = i/10.0;
            double sx = Math.sin(i);
            vomit(TextoLayout,"Seno ("+x+") = "+sx+"\uD83D\uDC1F") ;
        }

    }

    public void vomit(LinearLayout TextoLinearLayOut, String Texto)
    {
        TextView tv = new TextView(this);
        tv.setTextSize(25);
        tv.setTextColor(Color.argb(255,0,0,255));
        tv.setText (Texto);
        TextoLinearLayOut.addView(tv);
    }

}
