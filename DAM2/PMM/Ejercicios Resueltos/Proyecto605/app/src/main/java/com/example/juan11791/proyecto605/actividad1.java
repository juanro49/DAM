package com.example.juan11791.proyecto605;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class actividad1 extends AppCompatActivity {
    private TextView tv1;
    public static String sb = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        tv1 = (TextView)findViewById(R.id.tv1);
        sb += "onCreate()\n";
        tv1.setText(sb);
    }

    @Override
    protected void onStart() {
        super.onStart();
        sb += "onStart()\n";
        tv1.setText(sb);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sb += "onResume()\n";
        tv1.setText(sb);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sb += "onPause()\n";
        tv1.setText(sb);

        if(isFinishing())
        {
            sb += "isFinishing()\n";
            tv1.setText(sb);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        sb += "onStop()\n";
        tv1.setText(sb);

        if(isFinishing())
        {
            sb += "isFinishing()\n";
            tv1.setText(sb);
        }
    }

    @Override
    protected void onDestroy() {
        super.onStart();
        sb += "onDestroy()\n";
        tv1.setText(sb);
    }

    @Override
    protected void onRestart() {
        super.onStart();
        sb += "onRestart()\n";
        tv1.setText(sb);
    }
}
