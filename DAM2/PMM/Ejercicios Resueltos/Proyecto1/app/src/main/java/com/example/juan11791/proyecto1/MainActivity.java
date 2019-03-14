package com.example.juan11791.proyecto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setText("Mi primer programa Android");
    }

    public void aceptar(View v){
        tv1.setText(et1.getText().toString());
    }
}
