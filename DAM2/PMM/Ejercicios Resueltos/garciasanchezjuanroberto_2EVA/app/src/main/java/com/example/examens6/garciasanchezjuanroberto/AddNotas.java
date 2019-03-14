package com.example.examens6.garciasanchezjuanroberto;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddNotas extends AppCompatActivity
{
    private BBDD datos;
    private SQLiteDatabase db;
    private EditText etMatri, etModulo, etNota;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notas);

        etMatri = (EditText)findViewById(R.id.etMatricula2);
        etModulo = (EditText)findViewById(R.id.etModulo);
        etNota = (EditText)findViewById(R.id.etNota);
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

    public void addNota(View view)
    {
        if(db != null)
        {
            if(comprobarDatos())
            {
                if(existeAlumno())
                {
                    try
                    {
                        db.execSQL("insert into Notas(NumMat, NomMod, Nota) values ('" + etMatri.getText().toString() + "', '" + etModulo.getText().toString() + "', '" + etNota.getText().toString() + "');");
                        Toast.makeText(this, "Nota añadida", Toast.LENGTH_LONG).show();
                    }
                    catch(SQLiteConstraintException e)
                    {
                        Toast.makeText(this, "Ya se ha asignado una nota para ese módulo", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(this, "El alumno no existe", Toast.LENGTH_LONG).show();
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

        if(etModulo.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Introduce un módulo", Toast.LENGTH_LONG).show();
            return false;
        }

        if(etNota.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Introduce una nota", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

    public boolean existeAlumno()
    {
        Cursor cursor = db.rawQuery("select * from Alumnos where NumMat = '" + etMatri.getText().toString() + "'", null);

        return cursor.moveToFirst();
    }
}
