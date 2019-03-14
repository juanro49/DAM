package com.example.juan11791.proyecto409;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    private TabHost th;
    private TabHost.TabSpec spec;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        th=(TabHost)findViewById(R.id.tabHost);
        th.setup();

        spec=th.newTabSpec("UNO");
        spec.setContent(R.id.Pestaña1);
        spec.setIndicator("PESTAÑA 1");
        th.addTab(spec);

        spec=th.newTabSpec("DOS");
        spec.setContent(R.id.Pestaña2);
        spec.setIndicator("PESTAÑA 2");
        th.addTab(spec);

        spec=th.newTabSpec("TRES");
        spec.setContent(R.id.Pestaña3);
        spec.setIndicator("PESTAÑA 3");
        th.addTab(spec);
    }
}
