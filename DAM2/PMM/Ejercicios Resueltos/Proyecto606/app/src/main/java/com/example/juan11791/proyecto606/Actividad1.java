package com.example.juan11791.proyecto606;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity
{
    private TextView tv1;
    private String nombre, genero;
    private int edad;
    private float salario;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        tv1 = (TextView)findViewById(R.id.tv1);
        nombre = getIntent().getStringExtra("Nombre");
        genero = getIntent().getStringExtra("Género");
        edad = getIntent().getIntExtra("Edad", 0);
        salario = getIntent().getFloatExtra("Salario", 0);

        tv1.setText(nombre + " es " + genero + " de " + edad + " años de edad, con un salario de " + salario + "€");
    }
}
