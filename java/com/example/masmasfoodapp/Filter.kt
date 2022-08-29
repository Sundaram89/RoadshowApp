package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible

class Filter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)
        val notification3=findViewById<LinearLayout>(R.id.notification3)
        notification3.setOnClickListener{
            val intent= Intent(this,Notification::class.java)
            startActivity(intent)
        }
        val resturant1 = findViewById<TextView>(R.id.resturant1)
        val resturant2 = findViewById<TextView>(R.id.resturant2)
        val menu1 = findViewById<TextView>(R.id.menu1)
        val menu2 = findViewById<TextView>(R.id.menu2)
        val distanace1 = findViewById<TextView>(R.id.distance1)
        val distanace11 = findViewById<TextView>(R.id.distance11)
        val distanace2 = findViewById<TextView>(R.id.distance2)
        val distanace22 = findViewById<TextView>(R.id.distance22)
        val distanace3 = findViewById<TextView>(R.id.distance3)
        val distanace33 = findViewById<TextView>(R.id.distance33)
        val cake1 = findViewById<TextView>(R.id.cake1)
        val cake2 = findViewById<TextView>(R.id.cake2)
        val soup1 = findViewById<TextView>(R.id.soup1)
        val soup2 = findViewById<TextView>(R.id.soup2)
        val main_course1 = findViewById<TextView>(R.id.main_course1)
        val main_course2 = findViewById<TextView>(R.id.main_course2)
        val appetizer1 = findViewById<TextView>(R.id.appetizer1)
        val appetizer2 = findViewById<TextView>(R.id.appetizer2)
        val dessert1 = findViewById<TextView>(R.id.dessert1)
        val dessert2 = findViewById<TextView>(R.id.dessert2)
        resturant1.setOnClickListener {
            if (resturant1.isVisible) {
                resturant2.setVisibility(View.VISIBLE)
                menu2.setVisibility(View.INVISIBLE)
            } else {
                resturant1.setVisibility(View.VISIBLE)
            }
        }
        menu1.setOnClickListener {
            if(menu1.isVisible)
            {
                menu2.setVisibility(View.VISIBLE)
                resturant2.setVisibility(View.INVISIBLE)
            }
            else
            {
                menu1.setVisibility(View.VISIBLE)
            }
        }

        distanace1.setOnClickListener {
            if (distanace1.isVisible) {
               distanace11.setVisibility(View.VISIBLE)
                distanace22.setVisibility(View.INVISIBLE)
                distanace33.setVisibility(View.INVISIBLE)
            } else {
                distanace1.setVisibility(View.VISIBLE)
            }
        }
       distanace2.setOnClickListener {
            if(distanace2.isVisible)
            {
                distanace22.setVisibility(View.VISIBLE)
                distanace33.setVisibility(View.INVISIBLE)
                distanace11.setVisibility(View.INVISIBLE)
            }
            else
            {
                distanace2.setVisibility(View.VISIBLE)
            }
        }
        distanace3.setOnClickListener {
            if(distanace3.isVisible)
            {
                distanace33.setVisibility(View.VISIBLE)
                distanace22.setVisibility(View.INVISIBLE)
                distanace11.setVisibility(View.INVISIBLE)
            }
            else
            {
                distanace3.setVisibility(View.VISIBLE)
            }
        }
        cake1.setOnClickListener {
            if(cake1.isVisible) {
                cake2.setVisibility(View.VISIBLE)
                soup2.setVisibility(View.INVISIBLE)
                main_course2.setVisibility(View.INVISIBLE)
                appetizer2.setVisibility(View.INVISIBLE)
                dessert2.setVisibility(View.INVISIBLE)

            }
            else{
                cake1.setVisibility(View.VISIBLE)
            }

        }
        soup1.setOnClickListener {
            if(soup1.isVisible) {
                soup2.setVisibility(View.VISIBLE)
                cake2.setVisibility(View.INVISIBLE)
                main_course2.setVisibility(View.INVISIBLE)
                appetizer2.setVisibility(View.INVISIBLE)
                dessert2.setVisibility(View.INVISIBLE)

            }
            else{
                soup1.setVisibility(View.VISIBLE)
            }

        }
       main_course1.setOnClickListener {
            if(main_course1.isVisible) {
               main_course2.setVisibility(View.VISIBLE)
                cake2.setVisibility(View.INVISIBLE)
                soup2.setVisibility(View.INVISIBLE)
                appetizer2.setVisibility(View.INVISIBLE)
                dessert2.setVisibility(View.INVISIBLE)

            }
            else{
                main_course1.setVisibility(View.VISIBLE)
            }

        }
       appetizer1.setOnClickListener {
            if(appetizer1.isVisible) {
                appetizer2.setVisibility(View.VISIBLE)
                cake2.setVisibility(View.INVISIBLE)
                soup2.setVisibility(View.INVISIBLE)
                main_course2.setVisibility(View.INVISIBLE)
                dessert2.setVisibility(View.INVISIBLE)

            }
            else{
                appetizer1.setVisibility(View.VISIBLE)
            }

        }
        dessert1.setOnClickListener {
            if(dessert1.isVisible) {
                dessert2.setVisibility(View.VISIBLE)
                cake2.setVisibility(View.INVISIBLE)
                soup2.setVisibility(View.INVISIBLE)
                main_course2.setVisibility(View.INVISIBLE)
               appetizer2.setVisibility(View.INVISIBLE)

            }
            else{
               dessert1.setVisibility(View.VISIBLE)
            }

        }

    }
}