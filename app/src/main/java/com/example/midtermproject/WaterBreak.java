package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class WaterBreak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_break);

        WebView webView = findViewById(R.id.webViewWaterBreak);
        String waterBreakVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/g031sw47JqA?si=2vB5gBtNyxj4rf3x\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(waterBreakVideo,"text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        Button waterBreak = findViewById(R.id.buttonWaterBreak);
        waterBreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WaterBreak.this,finishExercise.class);
                startActivity(intent);
            }
        });
    }
}