package com.example.assignmentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val ibtnHtml = findViewById<ImageButton>(R.id.ibtnHTML)
        val ibtnCss = findViewById<ImageButton>(R.id.ibtnCSS)
        val ibtnJs = findViewById<ImageButton>(R.id.ibtnJS)
        val ibtnUiUx = findViewById<ImageButton>(R.id.ibtnUIUX)
        val ibtnWebGitRepo = findViewById<ImageButton>(R.id.ibtnWebGitRepo)

        ibtnHtml.setOnClickListener {
            intent = Intent(this, HtmlActivity::class.java)
            startActivity(intent)
        }

        ibtnCss.setOnClickListener {
            intent = Intent(this, CssActivity::class.java)
            startActivity(intent)
        }

        ibtnJs.setOnClickListener {
            intent = Intent(this, JsActivity::class.java)
            startActivity(intent)
        }

        ibtnUiUx.setOnClickListener {
            intent = Intent(this, UiUxActivity::class.java)
            startActivity(intent)
        }

        ibtnWebGitRepo.setOnClickListener {
            intent = Intent(this, WebGitActivity::class.java)
            startActivity(intent)
        }
    }
}