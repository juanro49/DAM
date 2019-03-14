package com.example.juan11791.proyecto803;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void crearClientes(View view)
	{
		Intent i = new Intent(this, CrearClientes.class);
		startActivity(i);
	}

	public void crearFacturas(View view)
	{
		Intent i = new Intent(this, CrearFacturas.class);
		startActivity(i);
	}

	public void consularFacturas(View view)
	{
		Intent i = new Intent(this, ConsultarFacturas.class);
		startActivity(i);
	}
}
