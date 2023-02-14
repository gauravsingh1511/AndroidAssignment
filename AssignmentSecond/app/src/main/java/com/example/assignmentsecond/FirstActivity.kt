package com.example.assignmentsecond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val ibtnHistory = findViewById<ImageButton>(R.id.ibtnHistory)
        val ibtnMessage = findViewById<ImageButton>(R.id.ibtnMessage)

        ibtnHistory.setOnClickListener {
            intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }

        ibtnMessage.setOnClickListener {
            intent = Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }
    }
}