package com.example.juan11791.proyecto505;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvmanzanas, tvperas, tvplatanos;
    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvmanzanas = (TextView)findViewById(R.id.tvManzanas);
        tvperas = (TextView)findViewById(R.id.tvPeras);
        tvplatanos = (TextView)findViewById(R.id.tvPlatanos);
        iv1 = (ImageView)findViewById(R.id.iv1);
    }

    public void manzanas(View v)
    {
        iv1.setImageResource(R.drawable.golden);
    }

    public void peras(View v)
    {
        iv1.setImageResource(R.drawable.peras);
    }

    public void platanos(View v)
    {
        iv1.setImageResource(R.drawable.platanos);
    }
}
