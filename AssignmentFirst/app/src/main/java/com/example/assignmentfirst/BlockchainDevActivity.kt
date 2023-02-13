package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class BlockchainDevActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain_dev)

        val webBlockChain = findViewById<WebView>(R.id.webBlockChain)
        webBlockChainSetUp(webBlockChain)
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webBlockChainSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            settings.allowContentAccess = true
            settings.builtInZoomControls = true
            loadUrl("https://www.javatpoint.com/blockchain-tutorial")
        }
    }
}