package com.example.juan11791.proyecto805;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by juan11791 on 28/01/19.
 */
public class BaseDatos extends SQLiteOpenHelper
{
	String crear = "CREATE TABLE Citas(_id integer primary key autoincrement,fecha text, hora text)";

	public BaseDatos(Context contexto, String nombre, SQLiteDatabase.CursorFactory factory, int version)
	{
		super(contexto,nombre,factory,version);
	}

	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(crear);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db,int versionAnt,int versionNue)
	{
		db.execSQL("DROP TABLE IF EXISTS Nombres");
		db.execSQL(crear);
	}
}