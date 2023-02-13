package com.example.assignmentfirst

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ibtnEnter = findViewById<ImageButton>(R.id.ibtnEnter)

        ibtnEnter.setOnClickListener {
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}