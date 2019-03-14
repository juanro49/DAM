package com.example.juan11791.garciasanchezjuanroberto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cbBici, cbPatin, cbMonop;
    private TextView tvBici, tvPatin, tvMonop;
    private EditText etBici, etPatin, etMonop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbBici = (CheckBox)findViewById(R.id.cbBici);
        cbPatin = (CheckBox)findViewById(R.id.cbPatin);
        cbMonop = (CheckBox)findViewById(R.id.cbMonop);

        tvBici = (TextView)findViewById(R.id.tvBici);
        tvPatin = (TextView)findViewById(R.id.tvPatin);
        tvMonop = (TextView)findViewById(R.id.tvMonop);

        etBici = (EditText)findViewById(R.id.etBici);
        etPatin = (EditText)findViewById(R.id.etPatin);
        etMonop = (EditText)findViewById(R.id.etMonop);
    }

    public void enviar(View view)
    {
        Intent i = new Intent(this, Factura.class);
        Bundle bundle = new Bundle();
        String cad = "";
        boolean b = true;

        if(!cbBici.isChecked() && !cbPatin.isChecked() && !cbMonop.isChecked())
        {
            cad += "Debe seleccionar almenos un producto";
            b = false;
        }

        if((etBici.getText().toString().isEmpty() || etBici.getText().toString().equals("0")) && cbBici.isChecked())
        {
            cad += "Indica la cantidad de bicicletas\n";
            b = false;
        }

        if((etPatin.getText().toString().isEmpty() || etPatin.getText().toString().equals("0")) && cbPatin.isChecked())
        {
            cad += "Indica la cantidad de patinetes\n";
            b = false;
        }

        if((etMonop.getText().toString().isEmpty() || etMonop.getText().toString().equals("0")) && cbMonop.isChecked())
        {
            cad += "Indica la cantidad de monopatines\n";
            b = false;
        }

        if(b)
        {
            if(cbBici.isChecked())
            {
                bundle.putString("bici", cbBici.getText().toString());
                bundle.putInt("preBici", Integer.parseInt(etBici.getText().toString()) * 2);
            }


            if(cbPatin.isChecked())
            {
                bundle.putString("patin", cbPatin.getText().toString());
                bundle.putInt("prePatin", Integer.parseInt(etPatin.getText().toString()) * 3);
            }

            if(cbMonop.isChecked())
            {
                bundle.putString("monop", cbMonop.getText().toString());
                bundle.putInt("preMonop", Integer.parseInt(etMonop.getText().toString()) * 5);
            }

            i.putExtras(bundle);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, cad,Toast.LENGTH_LONG).show();
        }
    }
}
