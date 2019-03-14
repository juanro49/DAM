package com.example.juan11791.proyecto301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ImageView ivImg;
    private String frutas[] = {"Aguacates", "Cerezas", "Fresas", "Manzanas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        ivImg = (ImageView)findViewById(R.id.imageView);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.formato, frutas);
        spinner.setAdapter(adapter);
    }

    public void mostrar(View view)
    {
        int id = this.getResources().getIdentifier(spinner.getSelectedItem().toString().toLowerCase(), "drawable", this.getPackageName());
        ivImg.setImageResource(id);

        /*
        if(spinner.getSelectedItem().equals("Aguacate"))
        {
            ivImg.setImageResource(R.drawable.aguacates);
        }
        else if(spinner.getSelectedItem().equals("Cereza"))
        {
            ivImg.setImageResource(R.drawable.cerezas);
        }
        else if(spinner.getSelectedItem().equals("Fresa"))
        {
            ivImg.setImageResource(R.drawable.fresas);
        }
        else
        {
            ivImg.setImageResource(R.drawable.manzanas);
        }
        */
    }
}
