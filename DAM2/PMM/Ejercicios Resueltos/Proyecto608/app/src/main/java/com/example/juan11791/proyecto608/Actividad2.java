package com.example.juan11791.proyecto608;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    private TextView tv1;
    private int intentos = 0;
    private Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        tv1 = (TextView)findViewById(R.id.tvIntentos);
        bundle = getIntent().getExtras();
        intentos = bundle.getInt("Intentos", 0);
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

        bundle.putInt("Intentos", intentos);

        Intent i = new Intent(this, MainActivity.class);
        i.putExtras(bundle);
        startActivity(i);
    }
}
