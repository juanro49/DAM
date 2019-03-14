package com.example.juan11791.proyecto803;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by juan11791 on 31/01/19.
 */
public class BaseDatos extends SQLiteOpenHelper
{
	String crearClientes = "CREATE TABLE Clientes(dni text PRIMARY KEY,nombre TEXT, direccion text, tfno text)";
	String crearFacturas = "CREATE TABLE Facturas(num integer PRIMARY KEY,dni TEXT, concepto text, valor real)";

	public BaseDatos(Context contexto, String nombre, SQLiteDatabase.CursorFactory factory, int version)
	{
		super(contexto,nombre,factory,version);
	}

	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(crearClientes);
		db.execSQL(crearFacturas);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db,int versionAnt,int versionNue)
	{
		db.execSQL("DROP TABLE IF EXISTS Clientes");
		db.execSQL("DROP TABLE IF EXISTS Facturas");
		db.execSQL(crearClientes);
		db.execSQL(crearFacturas);
	}
}