package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class Varification_Code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_varification_code)
        val back4=findViewById<LinearLayout>(R.id.back4)
        back4.setOnClickListener {
            onBackPressed()
            finish()
        }
        val otp1=findViewById<EditText>(R.id.otp_1)
        val otp2=findViewById<EditText>(R.id.otp_2)
        val otp3=findViewById<EditText>(R.id.otp_3)
        val otp4=findViewById<EditText>(R.id.otp_4)
        val verify=findViewById<Button>(R.id.btn10)
        verify.setOnClickListener {
            if(otp1.text.trim().isEmpty() || otp2.text.trim().isEmpty() || otp3.text.trim().isEmpty() || otp4.text.trim().isEmpty())
            {
                Toast.makeText(this,"Please enter OTP", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, Via_Method::class.java)
                startActivity(intent)
                finish()
            }

        }
        otp1.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(!otp1.text.toString().isEmpty()){
                    otp2.requestFocus()
                }

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        otp2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(!otp2.text.toString().isEmpty())
                {
                    otp3.requestFocus()
                }
                else{
                    otp1.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

        otp3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(!otp3.text.toString().isEmpty())
                {
                    otp4.requestFocus()
                }
                else
                {
                    otp1.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })
    }
            }
