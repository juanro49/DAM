package com.example.juan11791.proyecto606;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre, etEdad, etSalario;
    private RadioButton rbHombre, rbMujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etEdad = (EditText)findViewById(R.id.etEdad);
        etSalario = (EditText)findViewById(R.id.etSalario);
        rbHombre = (RadioButton) findViewById(R.id.rbHombre);
        rbMujer = (RadioButton) findViewById(R.id.rbMujer);
    }

    public void mostrar(View view)
    {
        boolean correcto = true;
        String cad = "";

        if(etNombre.getText().toString().isEmpty())
        {
            cad += "Introduce un nombre\n";
            correcto = false;
        }

        if(! rbHombre.isChecked() && ! rbMujer.isChecked())
        {
            cad += "Selecciona el género\n";
            correcto = false;
        }

        if(etEdad.getText().toString().isEmpty())
        {
            cad += "Introduce la edad\n";
            correcto = false;
        }

        if(etSalario.getText().toString().isEmpty())
        {
            cad += "Introduce el salario\n";
            correcto = false;
        }

        if(correcto)
        {
            Intent i = new Intent(this, Actividad1.class);

            i.putExtra("Nombre", etNombre.getText().toString());

            if(rbHombre.isChecked())
            {
                i.putExtra("Género", "un hombre");
            }

            if(rbMujer.isChecked())
            {
                i.putExtra("Género", "una mujer");
            }

            i.putExtra("Edad", Integer.parseInt(etEdad.getText().toString()));
            i.putExtra("Salario", Float.parseFloat(etSalario.getText().toString()));

            startActivity(i);
        }
        else
        {
            Toast.makeText(this, cad,Toast.LENGTH_LONG).show();
        }
    }
}
