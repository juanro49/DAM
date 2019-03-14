package com.example.examens6.garciasanchezjuanroberto;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NotaMedia extends AppCompatActivity
{
    private BBDD datos;
    private SQLiteDatabase db;
    private EditText etMatri;
    private TextView tvNombre, tvNota;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota_media);

        etMatri = (EditText)findViewById(R.id.etMatricula3);
        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvNota = (TextView)findViewById(R.id.tvNota);
    }

    protected void onResume()
    {
        super.onResume();

        datos = new BBDD(this, "Datos", null, 1);
        db = datos.getReadableDatabase();
    }

    protected void onPause()
    {
        super.onPause();

        db.close();
        datos.close();
    }

    public void calcularMedia(View view)
    {
        if(db != null)
        {
            if(etMatri.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Introduce una matrícula", Toast.LENGTH_LONG).show();
            }
            else if(existeAlumno())
            {
                float nota = 0;
                Cursor cursor = db.rawQuery("select Nota from Notas where NumMat = '" + etMatri.getText().toString() + "'", null);

                if(cursor.moveToFirst())
                {
                    do
                    {
                        nota += cursor.getFloat(0);
                    }while(cursor.moveToNext());

                    tvNota.setText(String.valueOf(nota / cursor.getCount()));
                }
                else
                {
                    tvNota.setText("0");
                    Toast.makeText(this, "El alumno no tiene notas", Toast.LENGTH_LONG).show();
                }
            }
        }
        else
        {
            Toast.makeText(this, "No se pudo acceder a la base de datos", Toast.LENGTH_LONG).show();
        }
    }

    public boolean existeAlumno()
    {
        Cursor cursor = db.rawQuery("select * from Alumnos where NumMat = '" + etMatri.getText().toString() + "'", null);

        if(cursor.moveToFirst())
        {
            tvNombre.setText(cursor.getString(1));
            return true;
        }
        else
        {
            Toast.makeText(this, "No existe el alumno", Toast.LENGTH_LONG).show();
            tvNombre.setText("Nombre");
            tvNota.setText("0");
            return false;
        }
    }
}
