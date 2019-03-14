package com.example.juan11791.proyecto701;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tv1);
        SharedPreferences prefe = getSharedPreferences("preferencias", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = prefe.edit();
        cont = prefe.getInt("Contador", 1);
        tv1.setText("La aplicación se ha abierto " + String.valueOf(cont) + " veces");
        editor.putInt("Contador", ++cont);
        editor.commit();


    }
}
