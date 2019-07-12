package com.zo0okadev.alcchallenge;

import android.os.Bundle;

import com.zo0okadev.alcchallenge.webUtils.WebViewLoader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.webkit.WebView;

public class ActivityB extends AppCompatActivity {

    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webView = findViewById(R.id.about_webview);
        WebViewLoader webViewLoader = new WebViewLoader(webView);
        webViewLoader.setSettings();
        webViewLoader.loadUrl("http://andela.com/alc");
    }
}
