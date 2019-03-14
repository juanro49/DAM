package com.example.juan11791.proyecto706;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tv1);

    }

    public void mostrar(View view)
	{
        tv1.setText("");
		tv1.setMovementMethod(new ScrollingMovementMethod());

        try
        {
            BufferedReader fichero = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.fichero)));
            StringBuilder sb = new StringBuilder();
			String lectura = fichero.readLine();

            while(lectura != null)
            {
                sb.append(lectura + "\n");
                lectura = fichero.readLine();
            }

			tv1.setText(sb);
            fichero.close();
        }
        catch (IOException e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
