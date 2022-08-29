package com.example.roadshowapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.roadshowapp.Model.LanguageItem
import com.example.roadshowapp.adapter.LanguageAdapters

class homeActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private var arrayList:ArrayList<LanguageItem> ?=null
    private var gridView: GridView?=null
    private var languageAdapters: LanguageAdapters?=null
    private lateinit var popular:TextView
    private lateinit var mens:TextView
    private lateinit var womens:TextView
    private lateinit var sale:TextView
    private lateinit var txt7:TextView
    private lateinit var popular1:TextView
    private lateinit var mens1:TextView
    private lateinit var womens1:TextView
    private lateinit var sale1:TextView
    private lateinit var txt8:TextView
    private lateinit var txt9:TextView
    private lateinit var txt10:TextView
    private lateinit var search1:ImageView
    private lateinit var like:ImageView
    private lateinit var cart:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        popular=findViewById(R.id.popular)
        mens=findViewById(R.id.mens)
        womens=findViewById(R.id.women)
        sale=findViewById(R.id.sale)
        popular1=findViewById(R.id.popular1)
        mens1=findViewById(R.id.mens1)
        womens1=findViewById(R.id.women1)
        sale1=findViewById(R.id.sale1)
        txt7=findViewById(R.id.txt7)
        txt8=findViewById(R.id.txt8)
        txt9=findViewById(R.id.txt9)
        txt10=findViewById(R.id.txt10)
        search1=findViewById(R.id.search1)
        search1.setOnClickListener {
            val intent=Intent(this,findProductActivity::class.java)
            startActivity(intent)
        }
        like=findViewById(R.id.like)
        like.setOnClickListener {
            val intent=Intent(this,FaviortActivity::class.java)
            startActivity(intent)
        }
        cart=findViewById(R.id.cart)
        cart.setOnClickListener {
            val intent=Intent(this,AddCartActivity::class.java)
            startActivity(intent)
        }

        popular.setOnClickListener {
            if(popular.isVisible){
                popular1.setVisibility(View.VISIBLE)
                txt7.setVisibility(View.VISIBLE)
                mens1.setVisibility(View.INVISIBLE)
                txt8.setVisibility(View.INVISIBLE)
                womens1.setVisibility(View.INVISIBLE)
                txt9.setVisibility(View.INVISIBLE)
                sale1.setVisibility(View.INVISIBLE)
                txt10.setVisibility(View.INVISIBLE)

            }
            else{
                popular.setVisibility(View.VISIBLE)
            }
        }
        mens.setOnClickListener {
            if(mens.isVisible){
                mens1.setVisibility(View.VISIBLE)
                txt8.setVisibility(View.VISIBLE)
                popular1.setVisibility(View.INVISIBLE)
                txt7.setVisibility(View.INVISIBLE)
                womens1.setVisibility(View.INVISIBLE)
                txt9.setVisibility(View.INVISIBLE)
                sale1.setVisibility(View.INVISIBLE)
                txt10.setVisibility(View.INVISIBLE)

            }
            else{
                mens.setVisibility(View.VISIBLE)
            }
        }
        womens.setOnClickListener {
            if(womens.isVisible){
                womens1.setVisibility(View.VISIBLE)
                txt9.setVisibility(View.VISIBLE)
                popular1.setVisibility(View.INVISIBLE)
                txt7.setVisibility(View.INVISIBLE)
                mens1.setVisibility(View.INVISIBLE)
                txt8.setVisibility(View.INVISIBLE)
                sale1.setVisibility(View.INVISIBLE)
                txt10.setVisibility(View.INVISIBLE)


            }
            else{
                womens.setVisibility(View.VISIBLE)
            }
        }
        sale.setOnClickListener {
            if(sale.isVisible) {
                womens1.setVisibility(View.INVISIBLE)
                txt9.setVisibility(View.INVISIBLE)
                popular1.setVisibility(View.INVISIBLE)
                txt7.setVisibility(View.INVISIBLE)
                mens1.setVisibility(View.INVISIBLE)
                txt8.setVisibility(View.INVISIBLE)
                sale1.setVisibility(View.VISIBLE)
                txt10.setVisibility(View.VISIBLE)

            }
            else{
                sale.setVisibility(View.VISIBLE)
            }
        }
        gridView=findViewById(R.id.my_grid_view_list)
        arrayList= ArrayList()
        arrayList=setDataList()
        languageAdapters= LanguageAdapters(applicationContext,arrayList!!)
        gridView?.adapter=languageAdapters
        gridView?.onItemClickListener=this
    }
    private fun setDataList():ArrayList<LanguageItem>{
        var arrayList:ArrayList<LanguageItem> = ArrayList()
        arrayList.add(LanguageItem(R.drawable.hoddies, R.drawable.heart3, R.drawable.heart1,"Pink Hoodie", "₹40.00 "))
        arrayList.add(LanguageItem(R.drawable.jacket, R.drawable.heart3, R.drawable.heart1,"Leather Jacket", "₹48.00 "))
        arrayList.add(LanguageItem(R.drawable.jeans, R.drawable.heart3, R.drawable.heart1,"Washed Blue Jeans", "₹36.00 "))
        arrayList.add(LanguageItem(R.drawable.shirt, R.drawable.heart3, R.drawable.heart1,"Printed Shirt", "₹28.00 "))
        return arrayList

    }
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val intent= Intent(this,buyActivity::class.java)
        startActivity(intent)
    }
}
