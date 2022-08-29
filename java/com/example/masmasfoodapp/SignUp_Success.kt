package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp_Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_success)
        val btn9=findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener {
            val intent= Intent(this,Home::class.java)
            startActivity(intent)

        }
    }
}