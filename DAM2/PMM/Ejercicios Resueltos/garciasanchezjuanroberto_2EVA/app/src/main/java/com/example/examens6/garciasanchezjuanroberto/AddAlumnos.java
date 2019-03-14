package com.example.examens6.garciasanchezjuanroberto;

import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddAlumnos extends AppCompatActivity
{
    private BBDD datos;
    private SQLiteDatabase db;
    private EditText etMatri, etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_alumnos);

        etMatri = (EditText)findViewById(R.id.etMatricula1);
        etNombre = (EditText)findViewById(R.id.etNombre);
    }

    protected void onResume()
    {
        super.onResume();

        datos = new BBDD(this, "Datos", null, 1);
        db = datos.getWritableDatabase();
    }

    protected void onPause()
    {
        super.onPause();

        db.close();
        datos.close();
    }

    public void addAlumno(View view)
    {
        if(db != null)
        {
            if(comprobarDatos())
            {
                try
                {
                    db.execSQL("insert into Alumnos(NumMat, Nombre) values ('" + etMatri.getText().toString() + "', '" + etNombre.getText().toString() + "');");
                    Toast.makeText(this, "Alumno añadido", Toast.LENGTH_LONG).show();
                }
                catch(SQLiteConstraintException e)
                {
                    Toast.makeText(this, "El alumno ya existe", Toast.LENGTH_LONG).show();
                }
            }
        }
        else
        {
            Toast.makeText(this, "No se pudo acceder a la base de datos", Toast.LENGTH_LONG).show();
        }
    }

    public boolean comprobarDatos()
    {
        if(etMatri.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Introduce un Nº de matrícula", Toast.LENGTH_LONG).show();
            return false;
        }

        if(etNombre.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Introduce un nombre", Toast.LENGTH_LONG).show();
            return false;

        }

        return true;
    }
}
