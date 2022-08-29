package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class loginActivity : AppCompatActivity() {
    lateinit var txt4:TextView
    lateinit var txt3:LinearLayout
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        back=findViewById(R.id.back)
        back.setOnClickListener {
            onBackPressed()
            finish()
        }
        txt4=findViewById(R.id.txt4)
        txt4.setOnClickListener {
         val intent=Intent(this,registrationActivity::class.java)
            startActivity(intent)
        }
        txt3=findViewById(R.id.txt3)
        txt3.setOnClickListener {
            val intent=Intent(this,homeActivity::class.java)
            startActivity(intent)
            onBackPressed()
            finish()

        }
    }
}