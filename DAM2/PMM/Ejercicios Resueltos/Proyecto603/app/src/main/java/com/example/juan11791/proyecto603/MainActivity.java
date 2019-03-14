package com.example.juan11791.proyecto603;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mAgua:
            {
                setContentView(R.layout.activity2);
                return true;
            }
            case R.id.mObr:
            {
                setContentView(R.layout.activity3);
                return true;
            }
            case R.id.mTel:
            {
                setContentView(R.layout.activity4);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
