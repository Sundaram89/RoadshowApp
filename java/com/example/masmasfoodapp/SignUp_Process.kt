package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import com.example.masmasfoodapp.MasmasApi.Masmas_Api
import com.example.masmasfoodapp.MasmasApi.RegistrationUrl
import com.example.masmasfoodapp.model.Model_for_CreateProfile
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SignUp_Process : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_process)
        val back1=findViewById<LinearLayout>(R.id.img2)
        back1.setOnClickListener {
            onBackPressed()
            finish()
        }
        val btn5=findViewById<Button>(R.id.btn5)

        btn5.setOnClickListener {
            val intent= Intent(this ,Payment_Method::class.java)
            startActivity(intent)
            finish()

        }
    }
    }