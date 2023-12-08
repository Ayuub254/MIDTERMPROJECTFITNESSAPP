package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MealPlanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_planner);

        ImageButton back = findViewById(R.id.imageButtonbackToHomePage);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MealPlanner.this, Activity7.class);
                startActivity(intent);
            }
        });

        Button breakfast = findViewById(R.id.buttonBreakFast);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MealPlanner.this, BreakFast.class);
                startActivity(intent);
            }
        });

        Button lunch = findViewById(R.id.buttonLunch);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MealPlanner.this, Lunch.class);
                startActivity(intent);
            }
        });

        Button dinner = findViewById(R.id.buttonDinner);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MealPlanner.this,Dinner.class);
                startActivity(intent);
            }
        });
    }
}