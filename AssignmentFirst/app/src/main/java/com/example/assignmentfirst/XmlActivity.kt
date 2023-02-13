package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class XmlActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xml)

        val webXml = findViewById<WebView>(R.id.webXml)

        webViewSetUp(webXml)
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
            loadUrl("https://www.javatpoint.com/xml-tutorial")
        }
    }
}