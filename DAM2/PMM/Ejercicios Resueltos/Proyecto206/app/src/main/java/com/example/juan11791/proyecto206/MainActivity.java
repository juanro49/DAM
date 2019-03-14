package com.example.juan11791.proyecto206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImagen = (ImageView)findViewById(R.id.imageView);
    }

    public void aguacate(View v)
    {
        ivImagen.setImageResource(R.drawable.aguacates);
    }

    public void cereza(View v)
    {
        ivImagen.setImageResource(R.drawable.cerezas);
    }

    public void manzana(View v)
    {
        ivImagen.setImageResource(R.drawable.manzanas);
    }
}
