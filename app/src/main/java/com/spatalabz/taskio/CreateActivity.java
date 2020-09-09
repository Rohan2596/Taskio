package com.spatalabz.taskio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CreateActivity extends AppCompatActivity {

    ImageView back_arrow,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        back_arrow=findViewById(R.id.back_arrow);
    }

    public void back(View view){
        back_arrow.setOnClickListener();

    }
}