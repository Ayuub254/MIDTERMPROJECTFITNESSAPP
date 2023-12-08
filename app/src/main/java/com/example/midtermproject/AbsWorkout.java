package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AbsWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_workout);

        ImageButton warmUp = findViewById(R.id.imageButtonWarmUpMildlyActive);
        warmUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AbsWorkout.this,warmUp.class);
                startActivity(intent);
            }
        });

        ImageButton Abs1 = findViewById(R.id.imageButtonAbs1);
        Abs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AbsWorkout.this, Abs.class);
                startActivity(intent);
            }
        });

        ImageButton Abs2 = findViewById(R.id.imageButtonAbs2);
        Abs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AbsWorkout.this, Abs.class);
                startActivity(intent);
            }
        });


        ImageButton waterBreak = findViewById(R.id.imageButtonWaterBreak3);
        waterBreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AbsWorkout.this, WaterBreak.class);
                startActivity(intent);
            }
        });
    }
}