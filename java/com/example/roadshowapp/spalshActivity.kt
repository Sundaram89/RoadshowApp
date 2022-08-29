package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class spalshActivity : AppCompatActivity() {
    lateinit var txt:Button
    lateinit var txt1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_spalsh)
        txt=findViewById(R.id.txt)
        txt1=findViewById(R.id.txt1)
            txt.setOnClickListener {
                val intent=Intent(this,loginActivity::class.java)
                startActivity(intent)
            }
        txt1.setOnClickListener {
            val intent=Intent(this,registrationActivity::class.java)
            startActivity(intent)
        }

    }
}