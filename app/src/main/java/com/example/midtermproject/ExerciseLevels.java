package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExerciseLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_levels);

        Button notActive = findViewById(R.id.buttonNotActive);
        Button mildlyActive = findViewById(R.id.buttonMildlyActive);
        Button veryActive = findViewById(R.id.buttonVeryActive);

        notActive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseLevels.this, Activity7.class);
                startActivity(intent);
            }
        });

        mildlyActive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseLevels.this, MidlyActive.class);
                startActivity(intent);
            }
        });

        veryActive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseLevels.this, MidlyActive.class);
                startActivity(intent);
            }
        });
    }
}