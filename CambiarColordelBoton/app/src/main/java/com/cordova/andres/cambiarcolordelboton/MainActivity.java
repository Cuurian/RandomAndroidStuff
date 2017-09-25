package com.cordova.andres.cambiarcolordelboton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    TextView myTextView;
    Button myButton1,myButton2,myButton3;
    int i1=0;
    int i2=0;
    int i3=0;
    int incremento_Color = 5;
    int cantidad_Maxima_Color = 255;
    int red = cantidad_Maxima_Color;
    int green = cantidad_Maxima_Color;
    int blue = cantidad_Maxima_Color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (TextView)findViewById(R.id.CajaTexto);
        myTextView.setText("Presiona un boton para cambiar el Color");


        myButton1 = (Button)findViewById(R.id.b1);
        myButton2 = (Button)findViewById(R.id.b2);
        myButton3 = (Button)findViewById(R.id.b3);

        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1++;
                red= incremento_Color*i1%cantidad_Maxima_Color;
                ((TextView)view).setText("El Color: " + red + "," + green + "," + blue);
                view.setBackgroundColor(Color.rgb(red,green,blue));
            }
        });

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2++;
                green= incremento_Color*i2%cantidad_Maxima_Color;
                ((TextView)view).setText("El Color: " + red + "," + green + "," + blue);
                view.setBackgroundColor(Color.rgb(red,green,blue));
            }
        });

        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i3++;
                blue= incremento_Color*i3%cantidad_Maxima_Color;
                ((TextView)view).setText("El Color: " + red + "," + green + "," + blue);
                view.setBackgroundColor(Color.rgb(red,green,blue));
            }
        });
    }
}
