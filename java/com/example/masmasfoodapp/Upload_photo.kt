package com.example.masmasfoodapp

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore

import android.view.View
import android.view.ViewConfiguration.get
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatDrawableManager.get
import androidx.appcompat.widget.ResourceManagerInternal.get
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.squareup.picasso.Picasso
import java.util.jar.Manifest
import kotlin.coroutines.EmptyCoroutineContext.get

class Upload_photo : AppCompatActivity() {
    lateinit var loadpicture: CardView
    lateinit var opencamera: CardView
    private val pickImage = 100
    lateinit var imageView: ImageView
    private var imageUri: Uri? = null
    private val CAMERA_REQUEST = 123
    lateinit var bitmap: Bitmap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_photo)
        val btn7=findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {
            val intent= Intent(this,Set_Location::class.java)
            startActivity(intent)

        }
        val back3=findViewById<LinearLayout>(R.id.linearLayout1)
        back3.setOnClickListener {
            onBackPressed()
            finish()
        }
        imageView = findViewById(R.id.gallery)
        loadpicture = findViewById(R.id.card1)
        opencamera = findViewById(R.id.card2)
        if(ContextCompat.checkSelfPermission(applicationContext,android.Manifest.permission.CAMERA)==PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),CAMERA_REQUEST)
        loadpicture.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }

        opencamera.setOnClickListener {
            val intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent1, CAMERA_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            val profile_pic = findViewById<CardView>(R.id.profile_pic)
            val upload_pic = findViewById<LinearLayout>(R.id.upload_pic)
            imageUri = data?.data
            imageView.setImageURI(imageUri)
            Picasso.with(this)
                .load(imageUri)
                .resize(800, 800)
                .into(imageView)
            profile_pic.visibility = View.VISIBLE
            upload_pic.visibility = View.INVISIBLE


        } else if (resultCode == RESULT_OK && requestCode == CAMERA_REQUEST) {
            val profile_pic = findViewById<CardView>(R.id.profile_pic)
            val upload_pic = findViewById<LinearLayout>(R.id.upload_pic)
            profile_pic.visibility = View.VISIBLE
            upload_pic.visibility = View.INVISIBLE
            bitmap = (data!!.extras!!["data"] as Bitmap?)!!
            imageView.setImageBitmap(bitmap)
        }

    }
}




