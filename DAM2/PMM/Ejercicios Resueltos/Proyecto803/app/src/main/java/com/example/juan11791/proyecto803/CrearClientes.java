package com.example.juan11791.proyecto803;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearClientes extends AppCompatActivity
{
	private EditText dni, nombre, direccion, tfno;
	private BaseDatos datos;
	private SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crear_clientes);
		dni = (EditText)findViewById(R.id.etDni);
		nombre = (EditText)findViewById(R.id.etNom);
		direccion = (EditText)findViewById(R.id.etDirec);
		tfno = (EditText)findViewById(R.id.etTfno);
	}

	public void onResume()
	{
		super.onResume();
		datos = new BaseDatos(this,"Datos",null,1);
		db = datos.getWritableDatabase();
	}

	public void onPause()
	{
		super.onPause();
		db.close();
	}

	public void addCliente(View view)
	{
		if(dni.getText().toString().isEmpty() || nombre.getText().toString().isEmpty() || direccion.getText().toString().isEmpty() || tfno.getText().toString().isEmpty())
		{
			Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_LONG).show();
		}
		else
		{
			if(db != null)
			{
				ContentValues registro = new ContentValues();

				registro.put("dni", dni.getText().toString());
				registro.put("nombre", nombre.getText().toString());
				registro.put("direccion", direccion.getText().toString());
				registro.put("tfno", tfno.getText().toString());

				if(db.insert("Clientes", null, registro) == -1)
				{
					Toast.makeText(this, "Error al añadir el cliente", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(this, "Cliente añadido", Toast.LENGTH_LONG).show();
				}

				/*
				boolean creada = true;

				try
				{
					db.execSQL("INSERT INTO Clientes(dni, nombre, direccion, tfno) VALUES ('" + dni + "', '" + nombre + "', '" + direccion + "', " + tfno + ")");
				}
				catch(Exception e)
				{
					Toast.makeText(this, "Error al añadir el cliente " + e.getMessage(), Toast.LENGTH_LONG).show();
					creada = false;
				}

				if(creada)
				{
					Toast.makeText(this, "Cliente añadido", Toast.LENGTH_LONG).show();
				}
				*/
			}
			else
			{
				Toast.makeText(this, "Error al acceder a la base de datos", Toast.LENGTH_LONG).show();
			}
		}

	}
}
