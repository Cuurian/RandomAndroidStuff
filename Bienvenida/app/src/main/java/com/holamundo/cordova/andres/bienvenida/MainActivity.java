package com.holamundo.cordova.andres.bienvenida;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView1 = (TextView) findViewById(R.id.myTextView1);
        myTextView1.setText("Mi primer Mensaje enviado desde JAVA");
        myTextView1.setTextColor(Color.argb(255,0,0,0));
        TextView myTextView2 = (TextView) findViewById(R.id.myTextView2);
        myTextView2.setText("Mi segundo Mensaje enviado desde JAVA");
        myTextView2.setTextColor(Color.argb(255,255,0,0));
        TextView myTextView3 = (TextView) findViewById(R.id.myTextView3);
        myTextView3.setText(" \uD83D\uDEBD \uD83D\uDEBD \uD83D\uDEBD ");
        myTextView3.setTextColor(Color.argb(255,0,0,0));
        TextView myTextView4 = (TextView) findViewById(R.id.myTextView4);
        myTextView4.setText("卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐卐");
        myTextView4.setTextColor(Color.argb(255,0,0,255));

        TextView tv = new TextView(this);
        tv.setTextSize(5);
        tv.setTextColor(Color.argb(255,104,86,0));
        tv.setText("\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F\uD83D\uDC1F");
        LinearLayout TextoLayout = (LinearLayout) findViewById(R.id.myLinearLayout);
        TextoLayout.addView(tv);



        print((LinearLayout) findViewById(R.id.myLinearLayout),"\uD83D\uDC1F");
        LinearLayout TextoLayout2 = (LinearLayout) findViewById(R.id.myLinearLayout);
        print(TextoLayout2,"\uD83D\uDEBD 1");
        print(TextoLayout2,"\uD83D\uDEBD 2");
        print(TextoLayout2,"\uD83D\uDEBD 3");
        print(TextoLayout2,"\uD83D\uDEBD 4");

        LinearLayout TextoLayout3 = (LinearLayout) findViewById(R.id.myLinearLayout);
        print3(TextoLayout3,"卐", 16, 255,0,0);
        print3(TextoLayout3,"卐", 18, 0,255,0);
        print3(TextoLayout3,"卐", 20, 0,0,255);
        print3(TextoLayout3,"卐", 22, 255, 255, 0);
        print3(TextoLayout3,"卐", 24, 255,0,255);
        print3(TextoLayout3,"卐", 26, 0,255,255);
        print3(TextoLayout3,"\uD83D\uDC1F", 60, 0,255,255);

        Switch xdxd = (Switch) findViewById(R.id.xd);

    }

    public void print(LinearLayout TextoLayout1, String Texto1)
    {
        TextView tv1 = new TextView(this);
        tv1.setTextSize(25);
        tv1.setTextColor(Color.BLACK );
        tv1.setText(Texto1);
        TextoLayout1.addView(tv1);
    }

    public void print3(LinearLayout TextoLayOut3, String Texto3, int size, int R, int G, int B)
    {
        TextView tv3 = new TextView(this);
        tv3.setTextSize(size);
        tv3.setTextColor(Color.argb(255,R,G,B));
        tv3.setText(Texto3);
        TextoLayOut3.addView(tv3);
    }
}
