package com.example.juan11791.proyecto208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvRes;
    private EditText txtN1, txtN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRes = (TextView)findViewById(R.id.tvRes);
        txtN1 = (EditText)findViewById(R.id.txtN1);
        txtN2 = (EditText)findViewById(R.id.txtN2);
    }

    public void suma(View v)
    {
        try
        {
            tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) + Float.parseFloat(String.valueOf(txtN2.getText()))));
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Debe teclear un número", Toast.LENGTH_LONG).show();
        }

    }

    public void resta(View v)
    {
        try
        {
            tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) - Float.parseFloat(String.valueOf(txtN2.getText()))));
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, "Debe teclear un número", Toast.LENGTH_LONG).show();
        }

    }

    public void multi(View v)
    {
        try
        {
            tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) * Float.parseFloat(String.valueOf(txtN2.getText()))));
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, "Debe teclear un número", Toast.LENGTH_LONG).show();
        }

    }

    public void divi(View v)
    {
        try
        {
            tvRes.setText(String.valueOf(Float.parseFloat(String.valueOf(txtN1.getText())) / Float.parseFloat(String.valueOf(txtN2.getText()))));
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, "Debe teclear un número", Toast.LENGTH_LONG).show();
        }

    }
}
