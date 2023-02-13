package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class UiUxActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_ux)

        val webUiUx = findViewById<WebView>(R.id.webUiUx)
        webViewUiUxSetUp(webUiUx)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewUiUxSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.allowContentAccess = true
            settings.builtInZoomControls = true
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.youtube.com/@NNgroup/playlists")
        }
    }
}