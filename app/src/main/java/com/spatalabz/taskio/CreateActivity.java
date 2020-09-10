package com.spatalabz.taskio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialDatePicker;

public class CreateActivity extends AppCompatActivity {

    ImageView back_arrow,add_date;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        back_arrow=findViewById(R.id.back_arrow);
        add_date=findViewById(R.id.add_date);

        CalendarConstraints.Builder constrBuilder= new CalendarConstraints.Builder();
        constrBuilder.setValidator(DateValidatorPointForward.now());
        MaterialDatePicker.Builder builder=MaterialDatePicker.Builder.datePicker();
        final MaterialDatePicker materialDatePicker=builder.build();
        builder.setCalendarConstraints(constrBuilder.build());
        add_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialDatePicker.show(getSupportFragmentManager(),"DATE_PICKER");
            }
        });
    }

    public void back(View view){
        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(CreateActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}