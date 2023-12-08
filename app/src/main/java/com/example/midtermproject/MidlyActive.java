package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MidlyActive extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midly_active);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        if(user==null){
            Intent intent = new Intent(MidlyActive.this, Login.class);
            startActivity(intent);
        }
        Button fullBody2 = findViewById(R.id.buttonFullbodyWorkout3);
        fullBody2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidlyActive.this, FullBodyWorkout.class);
                startActivity(intent);
            }
        });

        Button Abworkout = findViewById(R.id.buttonAbWorkouts);
        Abworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidlyActive.this, AbsWorkout.class);
                startActivity(intent);
            }
        });

        Button meal3 = findViewById(R.id.buttonMealPlanner4);
        meal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidlyActive.this, MealPlanner.class);
                startActivity(intent);
            }
        });

        Button logout2 = findViewById(R.id.buttonLogout2);
        logout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MidlyActive.this, Login.class);
                startActivity(intent);
            }
        });
    }
}