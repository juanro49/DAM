package com.example.examens6.garciasanchezjuanroberto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addAlum(View view)
    {
        Intent i = new Intent(this, AddAlumnos.class);
        startActivity(i);
    }

    public void addNotas(View view)
    {
        Intent i = new Intent(this, AddNotas.class);
        startActivity(i);
    }

    public void notaMedia(View view)
    {
        Intent i = new Intent(this, NotaMedia.class);
        startActivity(i);
    }
}
