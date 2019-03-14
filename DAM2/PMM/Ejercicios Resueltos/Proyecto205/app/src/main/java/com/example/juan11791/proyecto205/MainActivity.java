package com.example.juan11791.proyecto205;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1, txtNum2;
    private TextView tvResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        tvResul = (TextView)findViewById(R.id.tvResul);
    }

    public void Suma(View v)
    {
        tvResul.setText(String.valueOf(Float.parseFloat(String.valueOf(txtNum1.getText())) + Float.parseFloat(String.valueOf(txtNum2.getText()))));
    }

    public void Resta(View v)
    {
        tvResul.setText(String.valueOf(Float.parseFloat(String.valueOf(txtNum1.getText())) - Float.parseFloat(String.valueOf(txtNum2.getText()))));
    }

    public void Multi(View v)
    {
        tvResul.setText(String.valueOf(Float.parseFloat(String.valueOf(txtNum1.getText())) * Float.parseFloat(String.valueOf(txtNum2.getText()))));
    }

    public void Divi(View v)
    {
        tvResul.setText(String.valueOf(Float.parseFloat(String.valueOf(txtNum1.getText())) / Float.parseFloat(String.valueOf(txtNum2.getText()))));
    }
}
