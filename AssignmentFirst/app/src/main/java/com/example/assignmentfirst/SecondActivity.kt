package com.example.assignmentfirst

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val ibtnAndroid = findViewById<ImageButton>(R.id.ibtnAndroid)
        val ibtnIos = findViewById<ImageButton>(R.id.ibtnIos)
        val ibtnWeb = findViewById<ImageButton>(R.id.ibtnWeb)
        val ibtnSD = findViewById<ImageButton>(R.id.ibtnSD)
        val ibtnBlockchain = findViewById<ImageButton>(R.id.ibtnBlockchain)
        val ibtnDevOps = findViewById<ImageButton>(R.id.ibtnDevOps)
        val ibtnContactUs = findViewById<ImageButton>(R.id.ibtnContactUs)

        ibtnAndroid.setOnClickListener {
            intent = Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }

        ibtnIos.setOnClickListener {
            intent = Intent(applicationContext, IosActivity::class.java)
            startActivity(intent)
        }

        ibtnWeb.setOnClickListener {
            intent = Intent(applicationContext, WebActivity::class.java)
            startActivity(intent)
        }

        ibtnSD.setOnClickListener {
            intent = Intent(applicationContext, SdDevActivity::class.java)
            startActivity(intent)
        }

        ibtnBlockchain.setOnClickListener {
            intent = Intent(applicationContext, BlockchainDevActivity::class.java)
            startActivity(intent)
        }

        ibtnDevOps.setOnClickListener {
            intent = Intent(applicationContext, DevOpsActivity::class.java)
            startActivity(intent)
        }

        ibtnContactUs.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "7701883805")
            startActivity(intent)
        }
    }
}