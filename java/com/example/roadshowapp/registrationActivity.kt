package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class registrationActivity : AppCompatActivity() {
    lateinit var register:LinearLayout
    lateinit var back1:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        back1=findViewById(R.id.back1)
        back1.setOnClickListener {
            onBackPressed()
            finish()
        }
        register=findViewById(R.id.register)
        register.setOnClickListener{
            val intent=Intent(this,homeActivity::class.java)
            startActivity(intent)
           finish()
        }
    }
}