package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val btn2=findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val intent= Intent(this,SignIn::class.java)
            startActivity(intent)

        }
        val forgetpassword=findViewById<TextView>(R.id.forget)
        forgetpassword.setOnClickListener {
            val intent= Intent(this,Varification_Code::class.java)
            startActivity(intent)

        }
    }
}