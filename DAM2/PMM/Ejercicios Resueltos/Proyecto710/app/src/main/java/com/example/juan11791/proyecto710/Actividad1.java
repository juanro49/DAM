package com.example.juan11791.proyecto710;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Actividad1 extends AppCompatActivity
{
	private TextView tvUsu;
	private EditText tvAgenda;
	private SharedPreferences prefe;
	private String usu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad1);

		tvUsu = (TextView)findViewById(R.id.tvUsu);
		tvAgenda = (EditText)findViewById(R.id.etAgenda);
		prefe = getSharedPreferences("acceso", Context.MODE_PRIVATE);
		Bundle bundle = getIntent().getExtras();
		usu = bundle.getString("usuario");
		tvUsu.setText(usu);
	}

	protected void onPause()
	{
		super.onPause();

		String estado = Environment.getExternalStorageState();

		if(estado.equals(Environment.MEDIA_MOUNTED))
		{
			try
			{
				File file = new File(getExternalFilesDir(null),"fichero" + usu + ".txt");
				OutputStreamWriter fichero = new OutputStreamWriter(new FileOutputStream(file));

				fichero.write(tvAgenda.getText().toString());
				fichero.flush();
				fichero.close();
				Toast.makeText(this, "Agenda guardada", Toast.LENGTH_SHORT).show();
			}
			catch (FileNotFoundException e)
			{
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
			catch (IOException e)
			{
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		else
		{
			try
			{
				OutputStreamWriter fichero = new OutputStreamWriter(openFileOutput("fichero" + usu + ".txt", Context.MODE_PRIVATE));

				fichero.write(tvAgenda.getText().toString());
				fichero.flush();
				fichero.close();
			}
			catch (FileNotFoundException e)
			{
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
			catch (IOException e)
			{
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
	}

	protected void onResume()
	{
		super.onResume();

		String estado = Environment.getExternalStorageState();

		if (estado.equals(Environment.MEDIA_MOUNTED))
		{
			File file = new File(getExternalFilesDir(null), "fichero" + usu + ".txt");

			if(file.exists())
			{
				try
				{

					BufferedReader fichero = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

					StringBuilder sb = new StringBuilder();
					String lectura = fichero.readLine();

					while (lectura != null)
					{
						sb.append(lectura + "\n");
						lectura = fichero.readLine();
					}

					tvAgenda.setText(sb);
					fichero.close();

				} catch (FileNotFoundException e)
				{
					Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
				} catch (IOException e)
				{
					Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
				}
			}

		} else
		{
			try
			{
				BufferedReader fichero = new BufferedReader(new InputStreamReader(openFileInput("fichero" + usu + ".txt")));
				StringBuilder sb = new StringBuilder();
				String lectura = fichero.readLine();

				while (lectura != null)
				{
					sb.append(lectura + "\n");
					lectura = fichero.readLine();
				}

				tvAgenda.setText(sb);
				fichero.close();
			} catch (FileNotFoundException e)
			{
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			} catch (IOException e)
			{
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
	}
}
