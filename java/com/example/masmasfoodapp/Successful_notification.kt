package com.example.masmasfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Successful_notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successful_notification)
        val btn13=findViewById<Button>(R.id.btn13)
        btn13.setOnClickListener{
            onBackPressed()

        }
    }
}