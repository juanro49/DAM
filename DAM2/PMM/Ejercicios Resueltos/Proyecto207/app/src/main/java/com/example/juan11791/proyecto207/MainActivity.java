package com.example.juan11791.proyecto207;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etTexto;
    private ImageView ivImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTexto = (EditText)findViewById(R.id.etTexto);
        ivImagen = (ImageView)findViewById(R.id.imageView);
    }

    public void mostrar (View v)
    {
        if(etTexto.getText().toString().equalsIgnoreCase("a") || etTexto.getText().toString().equalsIgnoreCase("c") || etTexto.getText().toString().equalsIgnoreCase("m"))
        {
            int resID = this.getResources().getIdentifier(etTexto.getText().toString().toLowerCase(), "drawable", this.getPackageName());
            ivImagen.setImageResource(resID);
        }
        else
        {
            Toast.makeText(this, "Debe teclear una letra correcta", Toast.LENGTH_LONG).show();
            ivImagen.setImageResource(R.drawable.f);
        }

        /*
        if(String.valueOf(etTexto.getText()).equalsIgnoreCase("c"))
        {
            ivImagen.setImageResource(R.drawable.c);
        }
        else if(String.valueOf(etTexto.getText()).equalsIgnoreCase("a"))
        {
            ivImagen.setImageResource(R.drawable.a);
        }
        else if(String.valueOf(etTexto.getText()).equalsIgnoreCase("m"))
        {
            ivImagen.setImageResource(R.drawable.m);
        }
        else
        {
            Toast.makeText(this, "Debe teclear una letra", Toast.LENGTH_LONG).show();
            ivImagen.setImageResource(R.drawable.f);
        }
        */
    }
}
