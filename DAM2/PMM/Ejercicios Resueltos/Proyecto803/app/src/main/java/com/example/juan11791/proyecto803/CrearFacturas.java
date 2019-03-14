package com.example.juan11791.proyecto803;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearFacturas extends AppCompatActivity
{
	private EditText dni, num, concepto, valor;
	private BaseDatos datos;
	private SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crear_facturas);
		num = (EditText)findViewById(R.id.etNum);
		dni = (EditText)findViewById(R.id.etDNI);
		concepto = (EditText)findViewById(R.id.etConcep);
		valor = (EditText)findViewById(R.id.etValor);
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

	public void addFactura(View view)
	{
		if(num.getText().toString().isEmpty() || dni.getText().toString().isEmpty() || concepto.getText().toString().isEmpty() || valor.getText().toString().isEmpty())
		{
			Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_LONG).show();
		}
		else
		{
			if(db != null)
			{
				if(comprobarDni())
				{
					ContentValues registro = new ContentValues();

					registro.put("num", Integer.parseInt(num.getText().toString()));
					registro.put("dni", dni.getText().toString());
					registro.put("concepto", concepto.getText().toString());
					registro.put("valor", Float.parseFloat(valor.getText().toString()));

					if(db.insert("Facturas", null, registro) == -1)
					{
						Toast.makeText(this, "Error al añadir la factura", Toast.LENGTH_LONG).show();
					}
					else
					{
						Toast.makeText(this, "Factura añadida", Toast.LENGTH_LONG).show();
					}
				}
				else
				{
					Toast.makeText(this, "No existe el DNI", Toast.LENGTH_LONG).show();
				}
			}
			else
			{
				Toast.makeText(this, "Error al acceder a la base de datos", Toast.LENGTH_LONG).show();
			}
		}
	}

	private boolean comprobarDni()
	{
		Cursor cursor = db.rawQuery("select dni from Clientes where dni like " + dni.getText().toString(), null);

		return cursor.moveToFirst();
	}
}
