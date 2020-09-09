package com.spatalabz.taskio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent toTask=new Intent(MainActivity.this,CreateActivity.class);
        startActivity(toTask);
        floatingActionButton=findViewById(R.id.createTask);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTask=new Intent(MainActivity.this,CreateActivity.class);
                startActivity(toTask);
            }
        });
    }
}