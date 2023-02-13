package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class JsActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_js)

        val webJs = findViewById<WebView>(R.id.webJs)

        webViewJsSetUp(webJs)
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewJsSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.allowContentAccess = true
            settings.builtInZoomControls = true
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.w3schools.com/js/default.asp")
        }
    }
}