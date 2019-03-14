package com.example.juan11791.proyecto801;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
	private String nombre = "Nombre";
	private BaseDatos datos;
	private SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onPause()
	{
		super.onPause();
		db.close();
	}

	public void crear(View view)
	{
		datos = new BaseDatos(this,"Datos",null,2);
		db = datos.getWritableDatabase();

		if(db != null)
		{
			boolean creada = true;

			try
			{
				for(int codigo = 1; codigo <= 5; codigo++)
				{
					db.execSQL("INSERT INTO Nombres(codigo, nombre) VALUES (" + codigo + ", '" + nombre + String.valueOf(codigo) + "')");
				}
			}
			catch(Exception e)
			{
				Toast.makeText(this, "Error en la inserción de datos " + e.getMessage(), Toast.LENGTH_LONG).show();
				creada = false;
			}

			if(creada)
			{
				Toast.makeText(this, "Base de datos creada", Toast.LENGTH_LONG).show();
			}
		}
		else
		{
			Toast.makeText(this, "Error al acceder a la base de datos", Toast.LENGTH_LONG).show();
		}
	}
}
