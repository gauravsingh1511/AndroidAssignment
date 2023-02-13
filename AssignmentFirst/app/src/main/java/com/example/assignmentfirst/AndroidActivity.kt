package com.example.assignmentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val ibtnJava = findViewById<ImageButton>(R.id.ibtnJava)
        val ibtnKotlin = findViewById<ImageButton>(R.id.ibtnKotlin)
        val ibtnXml = findViewById<ImageButton>(R.id.ibtnXml)
        val ibtnAndroidDevelopment = findViewById<ImageButton>(R.id.ibtnAndroidDevelopment)
        val ibtnGitRepo = findViewById<ImageButton>(R.id.ibtnGitRepo)

        ibtnJava.setOnClickListener {
            intent = Intent(this,JavaActivity::class.java)
            startActivity(intent)
        }

        ibtnKotlin.setOnClickListener {
            intent = Intent(this, KotlinActivity::class.java)
            startActivity(intent)
        }

        ibtnXml.setOnClickListener {
            intent = Intent(this, XmlActivity::class.java)
            startActivity(intent)
        }

        ibtnAndroidDevelopment.setOnClickListener {
            intent = Intent(this, AndroidDevelopmentActivity::class.java)
            startActivity(intent)
        }

        ibtnGitRepo.setOnClickListener {
            intent = Intent(this, AndroidGitActivity::class.java)
            startActivity(intent)
        }
    }
}