package com.example.assignmentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class IosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios)

        val ibtnObjectiveC = findViewById<ImageButton>(R.id.ibtnObjectiveC)
        val ibtnSwift = findViewById<ImageButton>(R.id.ibtnSwift)
        val ibtnSwiftUI = findViewById<ImageButton>(R.id.ibtnSwiftUI)
        val ibtnGitRepo = findViewById<ImageButton>(R.id.ibtnGitRepo)

        ibtnObjectiveC.setOnClickListener {
            intent = Intent(this, ObjectiveActivity::class.java)
            startActivity(intent)
        }

        ibtnSwift.setOnClickListener {
            intent = Intent(this, SwiftActivity::class.java)
            startActivity(intent)
        }

        ibtnSwiftUI.setOnClickListener {
            intent = Intent(this, SwiftUIActivity::class.java)
            startActivity(intent)
        }

        ibtnGitRepo.setOnClickListener {
            intent = Intent(this, IosGitActivity::class.java)
            startActivity(intent)
        }
    }
}