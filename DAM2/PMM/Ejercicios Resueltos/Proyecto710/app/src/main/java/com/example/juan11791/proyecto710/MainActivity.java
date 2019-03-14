package com.example.juan11791.proyecto710;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
	private EditText etNom, etCont;
	private CheckBox cbMostCont;
	private SharedPreferences prefe;
	private SharedPreferences.Editor editor;
	private Bundle bundle = new Bundle();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etNom = (EditText)findViewById(R.id.etNom);
		etCont = (EditText)findViewById(R.id.etCont);
		cbMostCont = (CheckBox)findViewById(R.id.cbMosCont);

		prefe = getSharedPreferences("acceso", Context.MODE_PRIVATE);
	}

	public void alta(View view)
	{
		String nom = etNom.getText().toString();
		String cont = etCont.getText().toString();

		if(etNom.getText().toString().isEmpty() || etCont.getText().toString().isEmpty())
		{
			Toast.makeText(this, "Debe introducir usuario y contraseña", Toast.LENGTH_LONG).show();
		}
		else if(prefe.getString(nom, "").equals(""))
		{
			editor = prefe.edit();
			editor.putString(nom, cont);
			editor.commit();

			Toast.makeText(this, "Usuario dado de alta", Toast.LENGTH_LONG).show();
		}
		else
		{
			Toast.makeText(this, "Ya existe el usuario", Toast.LENGTH_LONG).show();
		}
	}

	public void acceder(View view)
	{
		String nom = etNom.getText().toString();
		String cont = etCont.getText().toString();

		if(etNom.getText().toString().isEmpty() || etCont.getText().toString().isEmpty())
		{
			Toast.makeText(this, "Debe introducir usuario y contraseña", Toast.LENGTH_LONG).show();
		}
		else if(prefe.getString(nom, "").equals(""))
		{
			Toast.makeText(this, "No existe ese usuario", Toast.LENGTH_LONG).show();
		}
		else if(prefe.getString(nom, "").equals(cont))
		{
			Intent i = new Intent(this, Actividad1.class);

			bundle.putString("usuario", nom);
			i.putExtras(bundle);
			startActivity(i);
		}
		else
		{
			Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
		}
	}

	public void mostrarCont(View view)
	{
		if(cbMostCont.isChecked())
		{
			etCont.setInputType(InputType.TYPE_CLASS_TEXT);
		}
		else
		{
			etCont.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
		}
	}
}
