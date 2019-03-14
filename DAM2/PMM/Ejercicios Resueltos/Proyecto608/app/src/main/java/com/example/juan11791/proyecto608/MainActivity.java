package com.example.juan11791.proyecto608;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvA1, tvA2;
    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvA1 = (TextView)findViewById(R.id.tvA1);
        tvA2 = (TextView)findViewById(R.id.tvA2);
    }

    protected void onResume()
    {
        super.onResume();

        bundle = getIntent().getExtras();
    }

    public void actividad1(View view)
    {
        Intent i = new Intent(this, Actividad1.class);
        startActivity(i);
    }

    public void actividad2(View view)
    {
        Intent i = new Intent(this, Actividad2.class);

        if(bundle.getInt("Intentos", 0) > 0)
        {
            i.putExtras(bundle);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, "No hay mas intentos",Toast.LENGTH_LONG).show();
        }
    }
}
