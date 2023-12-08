package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        ImageButton back = findViewById(R.id.imageButtonBackDinner);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this, MealPlanner.class);
                startActivity(intent);
            }
        });

        Button buttonSteak = findViewById(R.id.buttonSteak2);
        buttonSteak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this, Steak.class);
                startActivity(intent);
            }
        });

        Button canaiBread = findViewById(R.id.buttonCanaiBread3);
        canaiBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this, CanaiBread.class);
                startActivity(intent);

            }
        });

        Button oatMeal = findViewById(R.id.buttonOatMeal3);
        oatMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this, OatMeal.class);
                startActivity(intent);
            }
        });
    }
}