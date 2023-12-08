package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class Steak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steak);

        WebView webView = findViewById(R.id.webViewSteak);
        String steakVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nsw0Px-Pho8?si=upmukaJq9X-5YIwj\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(steakVideo,"text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        Button buttonGoHome = findViewById(R.id.buttonGoHomeSteak);
        buttonGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Steak.this, Lunch.class);
                startActivity(intent);
            }
        });

    }
}