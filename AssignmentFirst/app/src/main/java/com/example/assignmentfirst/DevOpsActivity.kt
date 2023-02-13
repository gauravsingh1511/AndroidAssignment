package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class DevOpsActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dev_ops)

        val webDevOps = findViewById<WebView>(R.id.webDevOps)
        webDevOpsSetUp(webDevOps)
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webDevOpsSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            settings.allowContentAccess = true
            settings.builtInZoomControls = true
            loadUrl("https://www.tutorialspoint.com/devops_tutorials.htm")
        }
    }
}