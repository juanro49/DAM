package com.example.juan11791.proyecto402;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv1, iv2;
    private int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView)findViewById(R.id.iv1);
        iv2 = (ImageView)findViewById(R.id.iv2);
    }

    public void cambiar (View v)
    {
        cont++;

        if(cont % 2 == 0)
        {
            iv1.setImageResource(R.drawable.naturaleza);
            iv2.setImageResource(R.drawable.animal);
        }
        else
        {
            iv1.setImageResource(R.drawable.animal);
            iv2.setImageResource(R.drawable.naturaleza);
        }

    }
}
