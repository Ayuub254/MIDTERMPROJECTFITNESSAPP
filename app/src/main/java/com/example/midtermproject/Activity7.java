package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Activity7 extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        if(user==null){
            Intent intent = new Intent(Activity7.this, Login.class);
            startActivity(intent);
        }

        Button logout = findViewById(R.id.buttonLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(Activity7.this, Login.class);
                startActivity(intent);
            }
        });

        ImageButton buttonBack = findViewById(R.id.imageButtonBackToMildlyActive);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity7.this, ExerciseLevels.class);
                startActivity(intent);
            }
        });
        //Takes you to the Full body workout page
        Button fullBodyWorkout = findViewById(R.id.buttonFullBodyWorkout2);
        fullBodyWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity7.this, FullBodyWorkout.class);
                startActivity(intent);
            }
        });

        //Takes you to the Lower body workout page
        Button lowerBodyWorkout = findViewById(R.id.buttonLowerBody);
        lowerBodyWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity7.this, LowerBodyWorkout.class);
                startActivity(intent);
            }
        });

        //Takes you to the meal planner page
        Button mealPlanner = findViewById(R.id.buttonMealPlanner2);
        mealPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity7.this, MealPlanner.class);
                startActivity(intent);
            }
        });


    }
}