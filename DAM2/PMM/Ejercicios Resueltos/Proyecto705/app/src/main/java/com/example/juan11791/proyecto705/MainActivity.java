package com.example.juan11791.proyecto705;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
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

        BufferedReader fichero = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.fichero)));

        try
        {
            tv1.setText(fichero.readLine());
            fichero.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
