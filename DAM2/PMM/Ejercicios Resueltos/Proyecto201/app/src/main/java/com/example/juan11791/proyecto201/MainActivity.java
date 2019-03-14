package com.example.juan11791.proyecto201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtN1, txtN2;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtN1 =(EditText)findViewById(R.id.txtN1);
        txtN2 =(EditText)findViewById(R.id.txtN2);
        tvRes = (TextView)findViewById(R.id.tvRes);
    }

    public void suma(View v)
    {
        tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) + Float.parseFloat(String.valueOf(txtN2.getText()))));
    }

    public void resta(View v)
    {
        tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) - Float.parseFloat(String.valueOf(txtN2.getText()))));
    }

    public void multi(View v)
    {
        tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) * Float.parseFloat(String.valueOf(txtN2.getText()))));
    }

    public void divi(View v)
    {
        tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) / Float.parseFloat(String.valueOf(txtN2.getText()))));
    }
}
