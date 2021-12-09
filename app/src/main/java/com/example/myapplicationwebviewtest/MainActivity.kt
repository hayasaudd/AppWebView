package com.example.myapplicationwebviewtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var webView = findViewById<WebView>(R.id.web_view)
        webView.webViewClient = WebViewClient()
        webView.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled= true
        }
    }
}