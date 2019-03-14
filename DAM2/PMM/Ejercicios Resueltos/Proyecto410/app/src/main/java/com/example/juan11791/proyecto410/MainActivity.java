package com.example.juan11791.proyecto410;

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
        spec.setContent(R.id.fl1);
        spec.setIndicator("PESTAÑA 1");
        th.addTab(spec);

        th=(TabHost)findViewById(R.id.tabHost);
        th.setup();
        spec=th.newTabSpec("DOS");
        spec.setContent(R.id.fl2);
        spec.setIndicator("PESTAÑA 2");
        th.addTab(spec);

        spec=th.newTabSpec("TRES");
        spec.setContent(R.id.fl3);
        spec.setIndicator("PESTAÑA 3");
        th.addTab(spec);

        spec=th.newTabSpec("CUATRO");
        spec.setContent(R.id.fl4);
        spec.setIndicator("PESTAÑA 4");
        th.addTab(spec);
    }
}
