package com.example.juan11791.proyecto607;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        Bundle bundle = getIntent().getExtras();
        tv1 = (TextView)findViewById(R.id.tv1);
        nombre = bundle.getString("Nombre");
        genero = bundle.getString("Género");
        edad = bundle.getInt("Edad", 0);
        salario = bundle.getFloat("Salario", 0);

        tv1.setText(nombre + " es " + genero + " de " + edad + " años de edad, con un salario de " + salario + "€");
    }
}
