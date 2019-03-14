package com.example.juan11791.proyecto607;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre, etEdad, etSalario;
    private RadioButton rbHombre, rbMujer;
    private Bundle bundle = new Bundle();

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

            bundle.putString("Nombre", etNombre.getText().toString());

            if(rbHombre.isChecked())
            {
                bundle.putString("Género", "un hombre");
            }

            if(rbMujer.isChecked())
            {
                bundle.putString("Género", "una mujer");
            }

            bundle.putInt("Edad", Integer.parseInt(etEdad.getText().toString()));
            bundle.putFloat("Salario", Float.parseFloat(etSalario.getText().toString()));

            i.putExtras(bundle);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, cad,Toast.LENGTH_LONG).show();
        }
    }
}
