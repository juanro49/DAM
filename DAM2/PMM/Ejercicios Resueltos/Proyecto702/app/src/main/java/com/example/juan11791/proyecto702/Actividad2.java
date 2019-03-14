package com.example.juan11791.proyecto702;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    private TextView tv1;
    private int intentos = 0;
    SharedPreferences prefe;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        tv1 = (TextView)findViewById(R.id.tvIntentos);
        prefe = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        intentos = prefe.getInt("Intentos", 0);
    }

    @Override
    protected void onResume()
    {
        intentos--;
        super.onResume();
        tv1.setText("Le quedan " + intentos + " intentos");
    }

    @Override
    protected void onPause()
    {
        super.onPause();

        SharedPreferences.Editor editor = prefe.edit();
        editor.putInt("Intentos", intentos);
        editor.commit();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}