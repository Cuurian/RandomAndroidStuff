package com.cordova.andres.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ln = (LinearLayout) findViewById(R.id.linearLayout1);
        print(ln, "Relación de Materias Primer Semestre Ingeniería en Software", 28, 85, 0, 0);
        print(ln, "Introduccion al Campo Profesional", 24, 71, 16, 84);
        print(ln, "Comunicacion Oral y Escrita", 24, 71, 16, 84);
        print(ln, "Aprendizaje y Gestión del Conocimiento", 24, 71, 16, 84);
        print(ln, "Tecnologias de la Informacion y la Comunicacion", 24, 71, 16, 84);
        print(ln, "Matematicas Básicas", 24, 71, 16, 84);
        print(ln, "Diseño de Algoritmos", 24, 71, 16, 84);
        print(ln, "Inglés I", 24, 71, 16, 84);
        print(ln, "Relación de Materias Segundo Semestre Ingeniería en Software", 28, 85, 0, 0);
        print(ln, "Matematicas Computacionales", 24, 71, 16, 84);
        print(ln, "Metodología de la Investigación", 24, 71, 16, 84);
        print(ln, "Probabilidad y Estadistica", 24, 71, 16, 84);
        print(ln, "Programación Estructurada", 24, 71, 16, 84);
        print(ln, "Sistemas de Información", 24, 71, 16, 84);
        print(ln, "Interacción Humano-Computadora", 24, 71, 16, 84);
        print(ln, "Inglés II", 24, 71, 16, 84);
        print(ln, "Relación de Materias Tercer Semestre Ingeniería en Software", 28, 85, 0, 0);
        print(ln, "Investigacion de Operaciones", 24, 71, 16, 84);
        print(ln, "Estructuras de Datos", 24, 71, 16, 84);
        print(ln, "Electronica Basica", 24, 71, 16, 84);
        print(ln, "Herramientas Computacionales", 24, 71, 16, 84);
        print(ln, "Programacion Orientada a Objetos", 24, 71, 16, 84);
        print(ln, "Fundamentos de Base de datos", 24, 71, 16, 84);
        print(ln, "Inglés III", 24, 71, 16, 84);
        print(ln, "Relación de Materias Cuarto Semestre Ingeniería en Software", 28, 85, 0, 0);
        print(ln, "Fundamentos de Ingenieria de software", 24, 71, 16, 84);
        print(ln, "Bases de datos", 24, 71, 16, 84);
        print(ln, "Programacion avanzada de bases de datos", 24, 71, 16, 84);
        print(ln, "Arquitectura de Computadoras", 24, 71, 16, 84);
        print(ln, "Inglés IV", 24, 71, 16, 84);
    }
    public void print(LinearLayout TextoLayOut3, String Texto3, int size, int R, int G, int B)
    {
        TextView tv3 = new TextView(this);
        tv3.setTextSize(size);
        tv3.setTextColor(Color.argb(255,R,G,B));
        tv3.setText(Texto3);
        TextoLayOut3.addView(tv3);
    }
}


