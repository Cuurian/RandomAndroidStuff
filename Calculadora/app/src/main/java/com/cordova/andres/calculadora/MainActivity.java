package com.cordova.andres.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView myTextView1, myTextView2;
    Button BotonIgual,Boton1,Boton2,Boton3,BotonSuma;
    Button Boton4,Boton5,Boton6,BotonResta;
    Button Boton7,Boton8,Boton9,BotonMultiplica;
    Button Boton0,BotonPunto,BotonC,BotonDivide;

    public double resultado,m1=0,m2=0;
    public char op1 = '+';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView1 = (TextView) findViewById(R.id.textView2);
        myTextView1.setText("");

        myTextView2 = (TextView) findViewById(R.id.TextViewResultado);
        myTextView2.setText("");

        Boton0 = (Button) findViewById(R.id.Boton0);
        Boton1 = (Button) findViewById(R.id.Boton1);
        Boton2 = (Button) findViewById(R.id.Boton2);
        Boton3 = (Button) findViewById(R.id.Boton3);
        Boton4 = (Button) findViewById(R.id.Boton4);
        Boton5 = (Button) findViewById(R.id.Boton5);
        Boton6 = (Button) findViewById(R.id.Boton6);
        Boton7 = (Button) findViewById(R.id.Boton7);
        Boton8 = (Button) findViewById(R.id.Boton8);
        Boton9 = (Button) findViewById(R.id.Boton9);
        BotonSuma = (Button) findViewById(R.id.BotonSuma);
        BotonResta = (Button) findViewById(R.id.BotonResta);
        BotonMultiplica = (Button) findViewById(R.id.BotonMultiplica);
        BotonIgual = (Button) findViewById(R.id.BotonIgual);
        BotonPunto = (Button) findViewById(R.id.BotonPunto);
        BotonC = (Button) findViewById(R.id.BotonC);
        BotonDivide = (Button) findViewById(R.id.BotonDiv);

        Boton0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("0");
            }
        });

        Boton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("1");
            }
        });

        Boton2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("2");
            }
        });

        Boton3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("3");
            }
        });

        Boton4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("4");
            }
        });

        Boton5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("5");
            }
        });

        Boton6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("6");
            }
        });

        Boton7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("7");
            }
        });

        Boton8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("8");
            }
        });

        Boton9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append("9");
            }
        });

        BotonPunto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView2.append(".");
            }
        });

        BotonC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView1.setText("");
                myTextView2.setText("");
                m1=0;
                op1='+';
            }
        });

        BotonSuma.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular('+');
            }
        });

        BotonResta.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular('-');
            }
        });

        BotonMultiplica.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular('*');
            }
        });

        BotonDivide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular('/');
            }
        });

        BotonIgual.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular('=');
            }
        });

    }

    public void Calcular(char op)
    {
        double resultado =m1;
        int reinicio=0;
        String Cadena = myTextView2.getText().toString();
        m2 = Double.parseDouble(Cadena);

        if (op1 == '+')
        {
            resultado = m1+m2;
        }else if (op1 == '-')
        {
            resultado = m1-m2;
        }else if (op1 == '*')
        {
            resultado = m1*m2;
        }
        else if (op1 == '/')
        {
            resultado = m1/m2;
        }

        m1 =resultado;
        op1=op;
        myTextView1.setText(""+m1);
        myTextView2.setText(""+reinicio);

        if(op == '=')
        {
            myTextView2.setText(""+m1);
        }
    }

}
