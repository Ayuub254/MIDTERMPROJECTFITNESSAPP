
package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class CanaiBread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canai_bread);

        WebView webView = findViewById(R.id.webViewCanaiBread);
        String canaiBreadVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/f4OGNIt_S1I?si=MQjKVFEsIjOm1iWa\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(canaiBreadVideo,"text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        Button canaiBread = findViewById(R.id.buttonCanaiBread2);
        canaiBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CanaiBread.this,MealPlanner.class);
                startActivity(intent);
            }
        });
    }
}