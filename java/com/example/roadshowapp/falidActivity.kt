package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class falidActivity : AppCompatActivity() {
    lateinit var backhome:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_falid)
        backhome=findViewById(R.id.backhome)
        backhome.setOnClickListener {
            val intent=Intent(this,homeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}