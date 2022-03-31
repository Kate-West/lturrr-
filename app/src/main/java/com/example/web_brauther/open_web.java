package com.example.web_brauther;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class open_web extends AppCompatActivity {
    private WebView web;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_web);
        web=findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://yandex.ru/");
        web.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if(web.canGoBack()){
            web.canGoBack();
        }
        else {
            super.onBackPressed();
        }
    }





}