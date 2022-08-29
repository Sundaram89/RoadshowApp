package com.example.roadshowapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class debitCardActivity : AppCompatActivity() {
    lateinit var back4:ImageView
    lateinit var opencamera: ImageView
    lateinit var photo: ImageView
    private val CAMERA_REQUEST = 123
    lateinit var bitmap: Bitmap
    lateinit var usecard:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debit_card)
        back4=findViewById(R.id.back4)
        back4.setOnClickListener {
           onBackPressed()
            finish()
        }
        usecard=findViewById(R.id.usecard)
        usecard.setOnClickListener {
            val intent=Intent(this,successfulActivity::class.java)
            startActivity(intent)
        }
        opencamera = findViewById(R.id.opencamera)
        photo = findViewById(R.id.photo)
        opencamera.setOnClickListener {
            val intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent1, CAMERA_REQUEST)
        }

    }
        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            bitmap = (data!!.extras!!["data"] as Bitmap?)!!
            photo.setImageBitmap(bitmap)
        }
    }

