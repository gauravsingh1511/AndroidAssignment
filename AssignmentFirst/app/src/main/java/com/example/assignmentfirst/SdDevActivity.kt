package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class SdDevActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sd_dev)

        val webSd = findViewById<WebView>(R.id.webSd)
        webSdSetUp(webSd)
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webSdSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            settings.allowContentAccess = true
            settings.builtInZoomControls = true
            loadUrl("https://www.geeksforgeeks.org/system-design-tutorial/")
        }
    }
}