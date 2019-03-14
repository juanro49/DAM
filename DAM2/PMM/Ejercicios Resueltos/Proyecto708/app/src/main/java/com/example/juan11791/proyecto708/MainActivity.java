package com.example.juan11791.proyecto708;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
	private TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv1 = (TextView)findViewById(R.id.tv1);
	}

	public void comprobar(View view)
	{
		String estado = Environment.getExternalStorageState();

		if(estado.equals(Environment.MEDIA_MOUNTED))
		{
			tv1.setText(estado);
		}
		else if(estado.equals(Environment.MEDIA_MOUNTED_READ_ONLY))
		{
			tv1.setText(estado);
		}
		else if(estado.equals(Environment.MEDIA_UNMOUNTED))
		{
			tv1.setText(estado);
		}
		else
		{
			tv1.setText(estado);
		}
	}
}
