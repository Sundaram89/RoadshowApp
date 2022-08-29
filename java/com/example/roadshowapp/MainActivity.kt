package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txt: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt=findViewById(R.id.txt)
        txt.setOnClickListener {
            val intent=Intent(this,spalshActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}