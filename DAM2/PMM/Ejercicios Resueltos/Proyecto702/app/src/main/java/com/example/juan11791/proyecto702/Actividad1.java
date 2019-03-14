package com.example.juan11791.proyecto702;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Actividad1 extends AppCompatActivity {
    private EditText et1;
    SharedPreferences prefe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        et1 = (EditText) findViewById(R.id.etIntentos);
    }

    @Override
    protected void onPause()
    {
        super.onPause();

        prefe = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefe.edit();
        editor.putInt("Intentos", Integer.parseInt(et1.getText().toString()));
        editor.commit();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}