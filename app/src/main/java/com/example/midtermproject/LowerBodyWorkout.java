package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LowerBodyWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_body_workout);

        ImageButton backButton = findViewById(R.id.imageButtonBackToMildlyActive);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LowerBodyWorkout.this,Activity7.class);
                startActivity(intent);
            }
        });


        ImageButton warmUp2 = findViewById(R.id.imageButtonWarmUp2);
        warmUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LowerBodyWorkout.this,warmUp.class);
                startActivity(intent);
            }
        });

        ImageButton jumpingJacks2 = findViewById(R.id.imageButtonJumpingJacks2);
        jumpingJacks2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LowerBodyWorkout.this, JumpingJacks.class);
                startActivity(intent);
            }
        });

        ImageButton squats = findViewById(R.id.imageButtonSquats);
        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LowerBodyWorkout.this, Squats.class);
                startActivity(intent);
            }
        });

        ImageButton skippingRope2 = findViewById(R.id.imageButtonSkippingRope2);
        skippingRope2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LowerBodyWorkout.this, SkippingRope.class);
                startActivity(intent);
            }
        });

        ImageButton waterBreak2 = findViewById(R.id.imageButtonWaterBreak2);
        waterBreak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LowerBodyWorkout.this, WaterBreak.class);
                startActivity(intent);
            }
        });
    }
}