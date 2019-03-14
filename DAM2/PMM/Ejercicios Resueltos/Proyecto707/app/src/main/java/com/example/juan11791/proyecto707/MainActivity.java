package com.example.juan11791.proyecto707;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity
{
	private EditText etEntrada, etSalida;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etEntrada = (EditText)findViewById(R.id.etEntrada);
		etSalida = (EditText)findViewById(R.id.etSalida);
		etSalida.setMovementMethod(new ScrollingMovementMethod());
	}

	public void crear(View view)
	{
		try
		{
			OutputStreamWriter fichero = new OutputStreamWriter(openFileOutput("fichero.txt", Context.MODE_PRIVATE));

			fichero.write(etEntrada.getText().toString());
			fichero.close();
		}
		catch (FileNotFoundException e)
		{
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
		catch (IOException e)
		{
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
	}

	public void mostrar(View view)
	{

		try
		{
			BufferedReader fichero = new BufferedReader(new InputStreamReader(openFileInput("fichero.txt")));
			StringBuilder sb = new StringBuilder();
			String lectura = fichero.readLine();

			while(lectura != null)
			{
				sb.append(lectura + "\n");
				lectura = fichero.readLine();
			}

			etSalida.setText(sb);
			fichero.close();
		}
		catch (FileNotFoundException e)
		{
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
		catch (IOException e)
		{
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
	}
}
