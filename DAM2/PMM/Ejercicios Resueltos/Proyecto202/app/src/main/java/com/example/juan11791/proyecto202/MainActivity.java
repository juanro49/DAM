package com.example.juan11791.proyecto202;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView tvModo;
    private ToggleButton btnModo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvModo = (TextView)findViewById(R.id.tvModo);
        btnModo = (ToggleButton)findViewById(R.id.btnModo);
    }

    public void Modo(View v)
    {
        if(btnModo.isChecked())
        {
            tvModo.setText("Activado");
        }
        else
        {
            tvModo.setText("Desactivado");
        }
    }
}
