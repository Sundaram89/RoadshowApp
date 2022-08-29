package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible

class buyActivity : AppCompatActivity() {
    lateinit var back2:ImageView
   private lateinit var ratingbar: RatingBar
   private lateinit var textview: TextView
   private lateinit var value:TextView
   lateinit var incresement:TextView
   lateinit var decrement:TextView
   lateinit var txt3:LinearLayout
   var count = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)
        back2=findViewById(R.id.back2)
        back2.setOnClickListener {
           onBackPressed()
            finish()
        }
        textview=findViewById(R.id.textview)
        txt3=findViewById(R.id.txt3)
        txt3.setOnClickListener {
            val intent=Intent(this,AddCartActivity::class.java)
            startActivity(intent)
        }
        ratingbar=findViewById(R.id.ratingbar)
        ratingbar.rating=4.5f
        ratingbar.stepSize=.5f
        ratingbar.setOnRatingBarChangeListener { ratingBar, rating, fromuser ->
            textview.setText( ""+rating)
        }
        incresement=findViewById(R.id.increase)
        decrement=findViewById(R.id.decrease)
        value=findViewById(R.id.value)
        incresement.setOnClickListener {

            count++
            value.setText(""+count)
        }
        decrement.setOnClickListener {
            if (count <= 1) {
                count = 1
            } else {
                count--
                value.setText(""+count)
            }
        }
        val img1= findViewById<TextView>(R.id.img1)
        val img2= findViewById<TextView>(R.id.img2)
        val img3=findViewById<ImageView>(R.id.img3)
        val img4= findViewById<TextView>(R.id.img4)
        val img5= findViewById<TextView>(R.id.img5)
        val img6=findViewById<ImageView>(R.id.img6)
        val img7= findViewById<TextView>(R.id.img7)
        val img8= findViewById<TextView>(R.id.img8)
        val img9=findViewById<ImageView>(R.id.img9)
        val img10= findViewById<TextView>(R.id.img10)
        val img11= findViewById<TextView>(R.id.img11)
        val img12=findViewById<ImageView>(R.id.img12)
        val img13= findViewById<TextView>(R.id.img13)
        val img14= findViewById<TextView>(R.id.img14)
        val img15=findViewById<ImageView>(R.id.img15)
        val heart1=findViewById<ImageView>(R.id.heart1)
        val heart2=findViewById<ImageView>(R.id.herat2)
        heart1.setOnClickListener {
            if(heart1.isVisible){
                heart2.setVisibility(View.VISIBLE)
            }
            else{
                heart1.setVisibility(View.VISIBLE)
            }
        }
        heart2.setOnClickListener {
            if(heart2.isVisible){
                heart1.setVisibility(View.VISIBLE)
                heart2.setVisibility(View.INVISIBLE)

            }
            else{
                heart2.setVisibility(View.VISIBLE)
            }
        }



        img1.setOnClickListener {
            if(img1.isVisible){
                img2.setVisibility(View.VISIBLE)
                img3.setVisibility(View.VISIBLE)
                img5.setVisibility(View.INVISIBLE)
                img6.setVisibility(View.INVISIBLE)
                img8.setVisibility(View.INVISIBLE)
                img9.setVisibility(View.INVISIBLE)
                img11.setVisibility(View.INVISIBLE)
                img12.setVisibility(View.INVISIBLE)
                img14.setVisibility(View.INVISIBLE)
                img15.setVisibility(View.INVISIBLE)
            }
            else{
                img1.setVisibility(View.VISIBLE)
            }
        }

        img4.setOnClickListener {
            if(img4.isVisible){
                img5.setVisibility(View.VISIBLE)
                img6.setVisibility(View.VISIBLE)
                img2.setVisibility(View.INVISIBLE)
                img3.setVisibility(View.INVISIBLE)
                img8.setVisibility(View.INVISIBLE)
                img9.setVisibility(View.INVISIBLE)
                img11.setVisibility(View.INVISIBLE)
                img12.setVisibility(View.INVISIBLE)
                img14.setVisibility(View.INVISIBLE)
                img15.setVisibility(View.INVISIBLE)
            }
            else{
                img4.setVisibility(View.VISIBLE)
            }
        }
        img7.setOnClickListener {
            if(img7.isVisible){
                img8.setVisibility(View.VISIBLE)
                img9.setVisibility(View.VISIBLE)
                img2.setVisibility(View.INVISIBLE)
                img3.setVisibility(View.INVISIBLE)
                img5.setVisibility(View.INVISIBLE)
                img6.setVisibility(View.INVISIBLE)
                img11.setVisibility(View.INVISIBLE)
                img12.setVisibility(View.INVISIBLE)
                img14.setVisibility(View.INVISIBLE)
                img15.setVisibility(View.INVISIBLE)

            }
            else{
                img7.setVisibility(View.VISIBLE)
            }
        }

        img10.setOnClickListener {
            if(img10.isVisible) {
                img8.setVisibility(View.INVISIBLE)
                img9.setVisibility(View.INVISIBLE)
                img2.setVisibility(View.INVISIBLE)
                img3.setVisibility(View.INVISIBLE)
                img5.setVisibility(View.INVISIBLE)
                img6.setVisibility(View.INVISIBLE)
                img11.setVisibility(View.VISIBLE)
                img12.setVisibility(View.VISIBLE)
                img14.setVisibility(View.INVISIBLE)
                img15.setVisibility(View.INVISIBLE)
            }
            else{
                img10.setVisibility(View.VISIBLE)
            }
        }

        img13.setOnClickListener {
            if(img13.isVisible){
                img8.setVisibility(View.INVISIBLE)
                img9.setVisibility(View.INVISIBLE)
                img2.setVisibility(View.INVISIBLE)
                img3.setVisibility(View.INVISIBLE)
                img5.setVisibility(View.INVISIBLE)
                img6.setVisibility(View.INVISIBLE)
                img11.setVisibility(View.INVISIBLE)
                img12.setVisibility(View.INVISIBLE)
                img14.setVisibility(View.VISIBLE)
                img15.setVisibility(View.VISIBLE)
            }
            else{
                img13.setVisibility(View.VISIBLE)
            }
        }
    }
}