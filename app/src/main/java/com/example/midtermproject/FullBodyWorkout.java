package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FullBodyWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body_workout);

        ImageButton back = findViewById(R.id.imageButtonBackFullbodyWorkout2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullBodyWorkout.this,Activity7.class);
                startActivity(intent);
            }
        });

        ImageButton warmUp = findViewById(R.id.imageButtonWarmUpMildlyActive);
        warmUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullBodyWorkout.this,warmUp.class);
                startActivity(intent);
            }
        });

        ImageButton skippingRope = findViewById(R.id.imageButtonSkippingRope3);
        skippingRope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullBodyWorkout.this, SkippingRope.class);
                startActivity(intent);
            }
        });

        ImageButton jumpingJacks = findViewById(R.id.imageButtonJumpingJacks3);
        jumpingJacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullBodyWorkout.this, JumpingJacks.class);
                startActivity(intent);
            }
        });

        ImageButton armRaises = findViewById(R.id.imageButtonArmRaises3);
        armRaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullBodyWorkout.this, ArmRaises.class);
                startActivity(intent);
            }
        });

        ImageButton waterBreak = findViewById(R.id.imageButtonWaterBreak3);
        waterBreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullBodyWorkout.this, WaterBreak.class);
                startActivity(intent);
            }
        });
    }
}