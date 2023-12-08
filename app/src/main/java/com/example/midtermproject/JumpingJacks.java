package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class JumpingJacks extends AppCompatActivity {
    private static final long START_TIME_IN_MILLISECONDS = 300000;
    private TextView countDownTextView;
    private Button buttonStartPause;
    private Button buttonReset;
    private CountDownTimer countDownTimer;
    private boolean timerRunning;
    private long timeLeftInMilliSeconds = START_TIME_IN_MILLISECONDS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumping_jacks);

        WebView webView = findViewById(R.id.webViewJumpingJacks);
        String jumpingJacksVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/N9gBKJ1z71k?si=CzTIcfg9GF0DxTWl\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(jumpingJacksVideo,"text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());


        Button finishJumpingJacks = findViewById(R.id.buttonFinishJumpingJacks);
        finishJumpingJacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JumpingJacks.this,finishExercise.class);
                startActivity(intent);
            }
        });

        countDownTextView = findViewById(R.id.textViewCountDownTimerJumpingJacks);
        buttonStartPause = findViewById(R.id.buttonStartPauseJumpingJacksTimer);
        buttonReset = findViewById(R.id.buttonResetJumpingJacksTimer);

        buttonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(timerRunning){
                    pauseTimer();
                }else{
                    startTimer();
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetTimer();
            }
        });
        updateCountDownText();

    }
    private void startTimer(){
        countDownTimer = new CountDownTimer(timeLeftInMilliSeconds, 1000) {
            @Override
            public void onTick(long milliSecondsUntilFinished) {
                timeLeftInMilliSeconds = milliSecondsUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timerRunning=false;
                buttonStartPause.setText("Start");
                buttonStartPause.setVisibility(View.INVISIBLE);
                buttonReset.setVisibility(View.VISIBLE);

            }
        }.start();

        timerRunning=true;
        buttonStartPause.setText("Pause");
        buttonReset.setVisibility(View.INVISIBLE);
    }


    private void pauseTimer(){
        countDownTimer.cancel();
        timerRunning=false;
        buttonStartPause.setText("Start");
        buttonReset.setVisibility(View.VISIBLE);
    }
    private void resetTimer(){
        timeLeftInMilliSeconds = START_TIME_IN_MILLISECONDS;
        updateCountDownText();
        buttonReset.setVisibility(View.INVISIBLE);
        buttonStartPause.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText() {
        int minutes = (int) (timeLeftInMilliSeconds / 1000) / 60; // turns the time into minutes.
        int seconds = (int) (timeLeftInMilliSeconds / 1000) % 60; // turns the time into seconds.

        String timeLeftFormatted = String.format(Locale.getDefault()
                , "%02d:%02d", minutes, seconds);
        countDownTextView.setText(timeLeftFormatted);
    }


    }
