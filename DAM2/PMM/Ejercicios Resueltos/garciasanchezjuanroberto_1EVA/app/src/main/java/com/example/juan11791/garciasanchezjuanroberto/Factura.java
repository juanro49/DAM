package com.example.juan11791.garciasanchezjuanroberto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Factura extends AppCompatActivity {
    private TextView tvBici, tvPatin, tvMonop, tvPpatin, tvPbici, tvPmonop, tvPtotal;
    private String bici, patin, monop;
    private int pBici, pPatin, pMonop, pTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        tvBici = (TextView)findViewById(R.id.tvBicicleta);
        tvPatin = (TextView)findViewById(R.id.tvPatinete);
        tvMonop = (TextView)findViewById(R.id.tvMonopatin);
        tvPbici = (TextView)findViewById(R.id.tvPbici);
        tvPpatin = (TextView)findViewById(R.id.tvPpatin);
        tvPmonop = (TextView)findViewById(R.id.tvPmonop);
        tvPtotal = (TextView)findViewById(R.id.tvPtotal);

        Bundle bundle = getIntent().getExtras();
        bici = bundle.getString("bici");
        patin = bundle.getString("patin");
        monop = bundle.getString("monop");

        pBici = bundle.getInt("preBici", 0);
        pPatin = bundle.getInt("prePatin", 0);
        pMonop = bundle.getInt("preMonop", 0);

        calcular();
    }

    private void calcular()
    {
        tvBici.setText(bici);
        tvPatin.setText(patin);
        tvMonop.setText(monop);

        if(pBici != 0)
        {
            tvPbici.setText(String.valueOf(pBici) + "€");
        }

        if(pPatin != 0)
        {
            tvPpatin.setText(String.valueOf(pPatin) + "€");
        }

        if(pMonop != 0)
        {
            tvPmonop.setText(String.valueOf(pMonop) + "€");
        }

        pTotal = pBici + pPatin + pMonop;
        tvPtotal.setText(String.valueOf(pTotal) + "€");
    }
}
