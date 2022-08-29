package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.popular_menuAdapter
import com.example.masmasfoodapp.model.popular_menu

class Popular_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_menu)
        val filter2=findViewById<LinearLayout>(R.id.filter2)
        filter2.setOnClickListener {
            val intent= Intent(this,Filter::class.java)
            startActivity(intent)
        }
        val notification2=findViewById<LinearLayout>(R.id.notification2)
        notification2.setOnClickListener{
            val intent=Intent(this,Notification::class.java)
            startActivity(intent)
        }
        val popular_menu1=findViewById<RecyclerView>(R.id.popular_menu1)
        popular_menu1.layoutManager= LinearLayoutManager(this)
        val data4=ArrayList<popular_menu>()
        data4.add(popular_menu(R.drawable.menu_photo,"Herbal Pancake","Warung Herbal","$7"))
        data4.add(popular_menu(R.drawable.menu_photo2,"Fruit Salad","Wijie Resto","$5"))
        data4.add(popular_menu(R.drawable.menu_photo3,"Noodle Home","Warung Herbal","$15"))
        val adapter1= popular_menuAdapter(data4)
        popular_menu1.adapter=adapter1
    }
}