package com.example.examens6.garciasanchezjuanroberto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BBDD extends SQLiteOpenHelper
{
    String crear1 = "create table Alumnos(" +
                        "NumMat integer primary key," +
                        "Nombre text)";
    String crear2 = "create table Notas(" +
                        "NumMat integer," +
                        "NomMod text," +
                        "Nota real," +
                        "constraint pk_notas primary key (NumMat, NomMod)," +
                        "constraint fk_matri foreign key (NumMat) references alumnos(NumMat))";

    public BBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(crear1);
        db.execSQL(crear2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS Alumnos");
        db.execSQL("DROP TABLE IF EXISTS Notas");
    }
}