package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class Password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        val back6=findViewById<LinearLayout>(R.id.back6)
        back6.setOnClickListener {
            onBackPressed()
            finish()
        }
        val btn12=findViewById<Button>(R.id.btn12)
        btn12.setOnClickListener {
            val intent= Intent(this,Successful_notification::class.java)
            startActivity(intent)
            finish()

        }
    }
}