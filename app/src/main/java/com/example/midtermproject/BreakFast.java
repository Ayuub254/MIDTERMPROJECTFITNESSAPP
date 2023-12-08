package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BreakFast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_fast);

        ImageButton back = findViewById(R.id.imageButtonback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BreakFast.this, MealPlanner.class);
                startActivity(intent);
            }
        });

        Button pancake = findViewById(R.id.buttonHoneyPancake);
        pancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BreakFast.this, HoneyPancake.class);
                startActivity(intent);
            }
        });

        Button canaiBread = findViewById(R.id.buttonCanaiBread);
        canaiBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BreakFast.this, CanaiBread.class);
                startActivity(intent);

            }
        });

        Button oatMeal = findViewById(R.id.buttonOatMeal);
        oatMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BreakFast.this, OatMeal.class);
                startActivity(intent);
            }
        });
    }
}