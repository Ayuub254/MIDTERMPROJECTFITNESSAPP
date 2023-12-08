package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class HoneyPancake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honey_pancake);

        WebView webView = findViewById(R.id.webViewHoneyPancakes);
        String honeyPancakesVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NCMKedZvnyI?si=Et3Pfp8HtYYtyiH6\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(honeyPancakesVideo,"text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        Button honeyPancakes = findViewById(R.id.buttonHoneyPancakes);
        honeyPancakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoneyPancake.this,MealPlanner.class);
                startActivity(intent);
            }
        });


    }
}