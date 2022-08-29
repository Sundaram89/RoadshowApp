package com.example.roadshowapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.roadshowapp.adapter.LanguageAdapters

import com.example.roadshowapp.Model.LanguageItem as LanguageItem2

class findProductActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private var arrayList1:ArrayList<LanguageItem2> ?=null
    private var gridView1: GridView?=null
    private var languageAdapters1: LanguageAdapters?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_product)
        var back7=findViewById<ImageView>(R.id.back7)
        back7.setOnClickListener {
           onBackPressed()
            finish()
        }
        gridView1 = findViewById(R.id.my_grid_view_list1)
        arrayList1 = ArrayList()
        arrayList1 = setDataList()
        languageAdapters1 = LanguageAdapters(applicationContext, arrayList1!!)
        gridView1?.adapter = languageAdapters1
        gridView1?.onItemClickListener = this

    }
    private fun setDataList():ArrayList<LanguageItem2>{
        val arrayList:ArrayList<LanguageItem2> = ArrayList()
        arrayList.add(LanguageItem2(R.drawable.hoddies, R.drawable.heart3, R.drawable.heart1,"Pink Hoodie", "₹40.00 "))
        arrayList.add(LanguageItem2(R.drawable.hoodie1, R.drawable.heart3, R.drawable.heart1,"Light Purple Hoodie", "₹48.00 "))
        arrayList.add(LanguageItem2(R.drawable.hoddies2, R.drawable.heart3, R.drawable.heart1,"Dark Green Hoodie", "₹36.00 "))
        arrayList.add(LanguageItem2(R.drawable.hoodies3, R.drawable.heart3, R.drawable.heart1,"Turquoise Hoodie", "₹28.00 "))
        arrayList.add(LanguageItem2(R.drawable.hoddies2, R.drawable.heart3,R.drawable.heart1, "Dark Green Hoodie", "₹36.00 "))
        arrayList.add(LanguageItem2(R.drawable.hoodies3, R.drawable.heart3, R.drawable.heart1,"Turquoise Hoodie", "₹28.00 "))



        return arrayList
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }
}
