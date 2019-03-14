package com.example.juan11791.proyecto604;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Obras extends AppCompatActivity {
    private ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        iv1 = (ImageView)findViewById(R.id.iv1);
        iv1.setImageResource(R.drawable.obras);
    }
}
