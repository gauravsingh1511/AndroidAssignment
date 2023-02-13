package com.example.assignmentfirst

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class AndroidGitActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_git)

        val webAndroidGit = findViewById<WebView>(R.id.webAndroidGit)

        webViewAndroidGitSetUp(webAndroidGit)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewAndroidGitSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            settings.builtInZoomControls = true
            settings.allowContentAccess = true
            loadUrl("https://github.com/search?q=android+projects&type=Repositories")
        }
    }
}