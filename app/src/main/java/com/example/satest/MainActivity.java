package com.example.satest; // Ensure this matches your package name in AndroidManifest.xml

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.example.satest.R; // Manually import R to resolve "Cannot find symbol 'R'"

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure activity_main.xml exists in res/layout

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript

        webView.setWebViewClient(new WebViewClient()); // Prevents opening in a browser
        webView.loadUrl("https://lba11xie.shinyapps.io/shinysentimentapp/"); // Replace with your deployed Shiny app URL
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); // Go back if possible
        } else {
            super.onBackPressed(); // Otherwise, exit app
        }
    }
}