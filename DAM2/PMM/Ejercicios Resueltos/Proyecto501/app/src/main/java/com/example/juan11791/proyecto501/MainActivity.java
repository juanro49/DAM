package com.example.juan11791.proyecto501;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTexto = (TextView)findViewById(R.id.tvTexto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnOpc1: {
                tvTexto.setText("Opción 1 seleccionada");
                return true;
            }


            case R.id.mnOpc2: {
                tvTexto.setText("Opción 2 seleccionada");
                return true;
            }

            case R.id.mnOpc3: {
                tvTexto.setText("Opción 3 seleccionada");
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
