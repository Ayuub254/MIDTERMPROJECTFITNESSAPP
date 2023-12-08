package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        ImageButton back = findViewById(R.id.imageButtonBackLunch);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this, MealPlanner.class);
                startActivity(intent);
            }
        });

        Button buttonSteak = findViewById(R.id.buttonSteak);
        buttonSteak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this, Steak.class);
                startActivity(intent);
            }
        });
        Button buttonSalmon = findViewById(R.id.buttonSalmon);
        buttonSalmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this, Salmon.class);
                startActivity(intent);
            }
        });
        Button buttonSalad = findViewById(R.id.buttonSalad);
        buttonSalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this, Salad.class);
                startActivity(intent);
            }
        });

    }
}