package com.example.juan11791.proyecto204;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvModo;
    private CheckBox cbModo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModo = (TextView)findViewById(R.id.tvModo);
        cbModo = (CheckBox)findViewById(R.id.cbModo);
    }

    public void Modo(View v)
    {
        if(cbModo.isChecked())
        {
            tvModo.setText("Activado");
        }
        else
        {
            tvModo.setText("Desactivado");
        }
    }
}
