package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)
        val btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent= Intent(this,Signup::class.java)
            startActivity(intent)
        }
    }
}