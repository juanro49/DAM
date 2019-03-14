package com.example.juan11791.proyecto804;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
	private String nombre = "Nombre";
	private BaseDatos datos;
	private SQLiteDatabase db;
	private TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv1 = (TextView)findViewById(R.id.tv1);
		tv1.setMovementMethod(new ScrollingMovementMethod());
	}

	public void onResume()
	{
		super.onResume();
		datos = new BaseDatos(this,"Datos",null,4);
		db = datos.getWritableDatabase();
	}
	public void onPause()
	{
		super.onPause();
		db.close();
	}

	public void crear(View view)
	{
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

	public void mostrar(View view)
	{
		tv1.setText("");

		try
		{
			String columnas[] = {"*"};
			//Cursor cursor = db.rawQuery("select * from Nombres", null);
			Cursor cursor = db.query("Nombres", columnas, null, null, null, null, "codigo asc");

			cursor.moveToFirst();

			do
			{
				tv1.append(cursor.getInt(0) + "\t\t\t\t" + cursor.getString(1) + "\n");
			}
			while(cursor.moveToNext());
		}
		catch(Exception e)
		{
			Toast.makeText(this, "Debe crear la base de datos " + e.getMessage(), Toast.LENGTH_LONG).show();
		}

	}

	public void modificar(View view)
	{
		if(db != null)
		{
			try
			{
				ContentValues valores = new ContentValues();
				valores.put("nombre","Juan");

				if(db.update("Nombres",valores,"codigo = 1", null) != -1)
				{
					Toast.makeText(this, "Se ha actualizado un registro", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(this, "Error al modificar un registro", Toast.LENGTH_LONG).show();
				}

				if(db.delete("Nombres","codigo = 3" ,null) > 0)
				{
					Toast.makeText(this, "Se ha borrado un registro", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(this, "Error al eliminar un registro", Toast.LENGTH_LONG).show();
				}

				valores.put("nombre","Pepe");

				if(db.update("Nombres",valores,"codigo = 4", null) != -1)
				{
					Toast.makeText(this, "Se ha actualizado un registro", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(this, "Error al modificar un registro", Toast.LENGTH_LONG).show();
				}

				valores.put("codigo",6);
				valores.put("nombre","Luis");

				if(db.insert("Nombres", null, valores) != -1)
				{
					Toast.makeText(this, "Se ha insertado un registro", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(this, "Error al insertar un registro", Toast.LENGTH_LONG).show();
				}
			}
			catch(Exception e)
			{
				Toast.makeText(this, "Error en la inserción de datos " + e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		else
		{
			Toast.makeText(this, "Error al acceder a la base de datos", Toast.LENGTH_LONG).show();
		}
	}
}