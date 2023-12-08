package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class OatMeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oat_meal);

        WebView webView = findViewById(R.id.webViewOatMeal);
        String oatMealVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/VZOHHCosuzY?si=pdJWIEQb8nRcSoTz\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(oatMealVideo,"text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        Button oatMealPrep = findViewById(R.id.buttonOatMeal2);
        oatMealPrep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OatMeal.this,MealPlanner.class);
                startActivity(intent);
            }
        });
    }
}