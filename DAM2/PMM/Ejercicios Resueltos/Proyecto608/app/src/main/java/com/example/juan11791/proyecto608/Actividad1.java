package com.example.juan11791.proyecto608;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Actividad1 extends AppCompatActivity {
    private EditText et1;
    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        et1 = (EditText) findViewById(R.id.etIntentos);

    }

    @Override
    protected void onPause()
    {
        super.onPause();

        bundle.putInt("Intentos", Integer.parseInt(et1.getText().toString()));

        Intent i = new Intent(this, MainActivity.class);
        i.putExtras(bundle);
        startActivity(i);
    }
}
