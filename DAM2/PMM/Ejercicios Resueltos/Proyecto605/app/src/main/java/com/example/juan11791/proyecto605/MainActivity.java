package com.example.juan11791.proyecto605;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private String sb = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
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

    public void actividad1(View view)
    {
        Intent i = new Intent(this, actividad1.class);
        startActivity(i);
        tv2.setText(actividad1.sb);
    }
}
