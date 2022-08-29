package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class Payment_Method : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_method)
        val back2=findViewById<LinearLayout>(R.id.linearLayout)
        back2.setOnClickListener {
            onBackPressed()
            finish()
        }
        val btn6=findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            val intent= Intent(this,Upload_photo::class.java)
            startActivity(intent)

        }
    }
}