package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class Via_Method : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_via_method)
        val back5=findViewById<LinearLayout>(R.id.back5)
        back5.setOnClickListener {
            onBackPressed()
            finish()
        }
        val btn11=findViewById<Button>(R.id.btn11)
        btn11.setOnClickListener {
            val intent= Intent(this,Password::class.java)
            startActivity(intent)

        }
    }
}