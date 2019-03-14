package com.example.juan11791.proyecto502;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvTexto;
    private static final int MnuOpc1=1;
    private static final int MnuOpc2=2;
    private static final int MnuOpc3=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTexto = (TextView)findViewById(R.id.txTexto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(Menu.NONE,MnuOpc1,Menu.NONE,"Opcion 1");
        menu.add(Menu.NONE,MnuOpc2,Menu.NONE,"Opcion 2");
        menu.add(Menu.NONE,MnuOpc3,Menu.NONE,"Opcion 3");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MnuOpc1: {
                tvTexto.setText("Opción 1 seleccionada");
                return true;
            }


            case MnuOpc2: {
                tvTexto.setText("Opción 2 seleccionada");
                return true;
            }

            case MnuOpc3: {
                tvTexto.setText("Opción 3 seleccionada");
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
