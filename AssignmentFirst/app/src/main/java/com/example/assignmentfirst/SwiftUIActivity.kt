package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class SwiftUIActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swift_uiactivity)

        val webSwiftUI = findViewById<WebView>(R.id.webSwiftUI)
        webViewSwiftUISetUp(webSwiftUI)
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSwiftUISetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            settings.builtInZoomControls = true
            settings.allowContentAccess = true
            loadUrl("https://developer.apple.com/tutorials/swiftui")
        }
    }
}