package com.example.juan11791.proyecto803;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ConsultarFacturas extends AppCompatActivity
{
	private EditText dni;
	private TextView nombre, facturas;
	private BaseDatos datos;
	private SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consultar_facturas);
		dni = (EditText)findViewById(R.id.etDNImostrar);
		nombre = (TextView)findViewById(R.id.tvNombre);
		facturas = (TextView)findViewById(R.id.tvFacturas);
	}

	public void onResume()
	{
		super.onResume();
		datos = new BaseDatos(this,"Datos",null,1);
		db = datos.getReadableDatabase();
	}

	public void onPause()
	{
		super.onPause();
		db.close();
	}

	public void mostrar(View view)
	{
		facturas.setText("");
		nombre.setText("");

		try
		{
			if(dni.getText().toString().isEmpty())
			{
				Toast.makeText(this, "Indroduce el DNI", Toast.LENGTH_LONG).show();
			}
			else
			{
				String columnas[] = {"*"};
				Cursor cursor1 = db.rawQuery("select * from Facturas where dni = " + dni.getText().toString(), null);
				//Cursor cursor1 = db.query("Facturas", columnas, null, null, null, null, "codigo desc");


				Cursor cursor2 = db.rawQuery("select nombre from Clientes where dni like " + dni.getText().toString(), null);
				cursor2.moveToFirst();
				nombre.setText(cursor2.getString(0));
				facturas.setText("\tNº\t\t DNI\t\t Con\t\t\t Valor\n");

				cursor1.moveToFirst();

				do
				{
					facturas.append(cursor1.getInt(0) + "\t\t\t\t" + cursor1.getString(1) + "\t\t\t\t\t" + cursor1.getString(2) + "\t\t\t\t\t" + cursor1.getFloat(3) + "\n");
				}
				while(cursor1.moveToNext());
			}

		}
		catch(Exception e)
		{
			Toast.makeText(this, "No existe el usuario " + e.getMessage(), Toast.LENGTH_LONG).show();
		}

	}
}
