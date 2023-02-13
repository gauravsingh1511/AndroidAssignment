package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class JavaActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)

        val webJava = findViewById<WebView>(R.id.webJava)

        webViewSetUp(webJava)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            settings.builtInZoomControls = true
            settings.allowContentAccess = true
            loadUrl("https://www.javatpoint.com/java-tutorial")
        }
    }
}