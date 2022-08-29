package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val intent= Intent(this,OnBoarding1::class.java)
            startActivity(intent)
            finish()
        }
    }
}