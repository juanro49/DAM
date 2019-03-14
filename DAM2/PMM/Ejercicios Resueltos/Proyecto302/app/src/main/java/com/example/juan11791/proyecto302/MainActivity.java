package com.example.juan11791.proyecto302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHab;
    private ListView lv1;
    private String paises[] = {"Alemania","Andorra","Austria", "España","Francia","Italia","Portugal", "Reino Unido","Rusia","San Marino","Suiza","Vaticano"};
    private String poblacion[] = {"81.861.000","77.000","8.457.000","47.244.000","63.604.000", "59.649.000","10.588.000","63.214.000","143.184.000","32.000","7.986.000",
        "800"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHab = (TextView) findViewById(R.id.tvHab);
        lv1 = (ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.ormato, paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id)
            {
                mostrar(posicion);
            }
        });
    }

    private void mostrar(int pos)
    {
        tvHab.setText(poblacion[pos]);
    }

}
