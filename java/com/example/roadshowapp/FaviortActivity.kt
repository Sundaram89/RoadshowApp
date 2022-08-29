package com.example.roadshowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class FaviortActivity : AppCompatActivity() {
    lateinit var addcart:LinearLayout
    lateinit var back6:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faviort)
        back6=findViewById(R.id.back6)
        back6.setOnClickListener {
            onBackPressed()
            finish()
        }
        addcart=findViewById(R.id.addcart)
        addcart.setOnClickListener{
            val intent=Intent(this,AddCartActivity::class.java)
            startActivity(intent)
        }
        val recyclerview4 = findViewById<RecyclerView>(R.id.recyclerview4)
        recyclerview4.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel1>()
        data.add(ItemsViewModel1(R.drawable.shirt,"Printed Shirt","GEETA COLLECTION","₹28.","00",R.drawable.ic_baseline_arrow_forward_24))
        data.add(ItemsViewModel1(R.drawable.jacket,"Leather Jacket","GEETA COLLECTION","₹36.","00",R.drawable.ic_baseline_arrow_forward_24))
        data.add(ItemsViewModel1(R.drawable.jeans,"Washed Jeans","GEETA COLLECTION","₹19.","00",R.drawable.ic_baseline_arrow_forward_24))
        data.add(ItemsViewModel1(R.drawable.hoddies2,"Pink Hoodie","GEETA COLLECTION","₹45.","00",R.drawable.ic_baseline_arrow_forward_24))
        data.add(ItemsViewModel1(R.drawable.hoddies,"Pink Hoodie","GEETA COLLECTION","₹45.","00",R.drawable.ic_baseline_arrow_forward_24))
        val adapter = CustomAdapter1(data)

        // Setting the Adapter with the recyclerview
        recyclerview4.adapter = adapter
    }
}