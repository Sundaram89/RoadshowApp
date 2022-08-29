package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.masmasfoodapp.MasmasApi.Masmas_Api
import com.example.masmasfoodapp.MasmasApi.RegistrationUrl
import com.example.masmasfoodapp.model.Model_for_CreateProfile
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val btn4=findViewById<Button>(R.id.btn3)
        val userName=findViewById<EditText>(R.id.name)
        val emailId=findViewById<EditText>(R.id.email1)
        val passWord=findViewById<EditText>(R.id.txt_pswrd)
        btn4.setOnClickListener {
            if(userName.text.toString().isEmpty() && emailId.text.toString().isEmpty() && passWord.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"please enter name",Toast.LENGTH_SHORT).show()
            }
            else {
                postData(userName.text.toString(),
                    emailId.text.toString(),
                    passWord.text.toString())
            }
        }
    }

    private fun postData(toString: String, toString1: String, toString2: String) {
        val username=findViewById<EditText>(R.id.name).text.toString()
        val emailid=findViewById<EditText>(R.id.email1).text.toString()
        val password=findViewById<EditText>(R.id.txt_pswrd).text.toString()
        val retrofitBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(RegistrationUrl)
            .build()
        val masmas_Api=retrofitBuilder.create(Masmas_Api::class.java)
        val model_for_createprofile= Model_for_CreateProfile(username, emailid, password)
        val call=masmas_Api.SendCreateProfileData(model_for_createprofile)
        call.enqueue(object : Callback<Model_for_CreateProfile> {

            override fun onResponse(
                call: Call<Model_for_CreateProfile>,
                response: Response<Model_for_CreateProfile>,
            ) {

                Toast.makeText(applicationContext,"successful", Toast.LENGTH_SHORT).show()

            }

            override fun onFailure(call: Call<Model_for_CreateProfile>, t: Throwable) {
                Toast.makeText(applicationContext,"wronggg", Toast.LENGTH_SHORT).show()

                val intent=Intent(applicationContext,SignUp_Process::class.java)
                startActivity(intent)
                finish()
            }

        })

    }

    }