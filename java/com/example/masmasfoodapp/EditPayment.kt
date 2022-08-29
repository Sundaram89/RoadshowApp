package com.example.masmasfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible

class EditPayment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_payment)
        val paypal_account1 = findViewById<LinearLayout>(R.id.paypal_accoun1)
        val paypal_account2 = findViewById<LinearLayout>(R.id.paypal_accoun2)
        val visa_account1 = findViewById<LinearLayout>(R.id.visa_account1)
        val visa_account2 = findViewById<LinearLayout>(R.id.visa_account2)
        val payneer_account1 = findViewById<LinearLayout>(R.id.payneer_account1)
        val payneer_account2 = findViewById<LinearLayout>(R.id.payneer_account2)
        paypal_account1.setOnClickListener {
            if (paypal_account1.isVisible) {
               paypal_account2.setVisibility(View.VISIBLE)
                visa_account2.setVisibility(View.INVISIBLE)
                payneer_account2.setVisibility(View.INVISIBLE)
            } else {
               paypal_account1.setVisibility(View.VISIBLE)
            }
        }
        visa_account1.setOnClickListener {
            if(visa_account1.isVisible)
            {
                visa_account2.setVisibility(View.VISIBLE)
                payneer_account2.setVisibility(View.INVISIBLE)
                paypal_account2.setVisibility(View.INVISIBLE)
            }
            else
            {
               visa_account1.setVisibility(View.VISIBLE)
            }
        }
       payneer_account1.setOnClickListener {
            if(payneer_account1.isVisible)
            {
                payneer_account2.setVisibility(View.VISIBLE)
                paypal_account2.setVisibility(View.INVISIBLE)
               visa_account2.setVisibility(View.INVISIBLE)
            }
            else
            {
               payneer_account1.setVisibility(View.VISIBLE)
            }
        }
    }
}