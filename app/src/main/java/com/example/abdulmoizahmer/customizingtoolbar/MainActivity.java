package com.example.abdulmoizahmer.customizingtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                Toast.makeText(MainActivity.this, "Item One Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(MainActivity.this, "Item Two Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(MainActivity.this, "Item Three Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(MainActivity.this, "Item Four Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item5:
                Toast.makeText(MainActivity.this, "Item Five Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item6:
                Toast.makeText(MainActivity.this, "Item Six Clicked!", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
