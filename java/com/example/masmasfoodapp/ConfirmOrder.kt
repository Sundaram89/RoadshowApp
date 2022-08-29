package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_order)
        val edit_payment=findViewById<TextView>(R.id.edit_payment)
        edit_payment.setOnClickListener {
            val intent= Intent(this,EditPayment::class.java)
            startActivity(intent)
        }
        val edit_location=findViewById<TextView>(R.id.edit_location)
        edit_location.setOnClickListener {
            val intent= Intent(this,Shipping::class.java)
            startActivity(intent)
        }
    }
}