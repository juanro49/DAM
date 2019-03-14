package com.example.juan11791.proyecto203;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private Switch swModo;
    private TextView tvModo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swModo = (Switch)findViewById(R.id.swModo);
        tvModo = (TextView)findViewById(R.id.tvModo);
    }

    public void Modo(View v)
    {
        if(swModo.isChecked())
        {
            tvModo.setText("Activado");
            swModo.setText("Activado");
        }
        else
        {
            tvModo.setText("Desactivado");
            swModo.setText("Desactivado");
        }
    }
}
