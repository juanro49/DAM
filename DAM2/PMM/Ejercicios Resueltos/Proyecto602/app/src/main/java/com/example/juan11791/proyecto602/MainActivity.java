package com.example.juan11791.proyecto602;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    private ListView lv1;
    private String fotos[] = {"Guapa", "Gato", "Oso"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = (ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.formato, fotos);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id)
            {
                mostrar(posicion);
            }
        });
    }

    private void mostrar(int pos)
    {
        if(pos == 0)
        {
            Intent intent = new Intent(this, Guapa.class);
            startActivity(intent);
        }

        else if(pos == 1)
        {
            Intent intent = new Intent(this, Gato.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, Oso.class);
            startActivity(intent);
        }
    }
}
