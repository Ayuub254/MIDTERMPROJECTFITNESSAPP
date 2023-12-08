package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class Salad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);

        WebView webView = findViewById(R.id.webViewSalad);
        String saladVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1pX_BWgvoN0?si=bc2xLR0yomuZ5mj-\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(saladVideo,"text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        Button buttonGoHome = findViewById(R.id.buttonGoHomeSalad);
        buttonGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Salad.this, Lunch.class);
                startActivity(intent);
            }
        });
    }
}