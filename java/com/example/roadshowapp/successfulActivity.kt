package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class successfulActivity : AppCompatActivity() {


    lateinit var trackorder:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successful)

        trackorder=findViewById(R.id.trackorder)
        trackorder.setOnClickListener {
            val intent=Intent(this,falidActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}