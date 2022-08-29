package com.example.masmasfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.LinearLayout
import com.example.masmasfoodapp.Adapter.popular_resturantAdapter
import com.example.masmasfoodapp.model.nearest_resturant
import com.example.masmasfoodapp.model.nearest_resturant1

class Popular_Resturant : AppCompatActivity() {
    private var data2:ArrayList<nearest_resturant1>?=null
    private var popular_resturant:GridView?=null
    private var popularResturantadapter:popular_resturantAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_resturant)
        val notification1=findViewById<LinearLayout>(R.id.notification1)
        notification1.setOnClickListener{
            val intent=Intent(this,Notification::class.java)
            startActivity(intent)
        }
        val filter1=findViewById<LinearLayout>(R.id.filter1)
        filter1.setOnClickListener {
            val intent= Intent(this,Filter::class.java)
            startActivity(intent)
        }
        popular_resturant = findViewById(R.id.nearest_resturant)
        data2 = ArrayList()
        data2=setDataList()
       popularResturantadapter= popular_resturantAdapter(applicationContext,data2!!)
        popular_resturant?.adapter = popularResturantadapter
        popular_resturant?.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//            Toast.makeText(applicationContext, "You CLicked " + playerNames[+position],
//                Toast.LENGTH_SHORT).show()
            val intent =Intent(this,Detail_product::class.java)
            startActivity(intent)
        }
    }
    private fun setDataList():ArrayList<nearest_resturant1> {
        var data2: ArrayList<nearest_resturant1> = ArrayList()
        data2.add(nearest_resturant1(R.drawable.resturant_image1,"Vegan Resto","12 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image3,"Healthy Food","8 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image2,"Good Food","12 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_item4,"Smart Resto","8 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image1,"Vegan Resto","12 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image3,"Healthy Food","8 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image2,"Good Food","12 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_item4,"Smart Resto","8 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image1,"Vegan Resto","12 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image3,"Healthy Food","8 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_image2,"Good Food","12 Mins"))
        data2.add(nearest_resturant1(R.drawable.resturant_item4,"Smart Resto","8 Mins"))
        return data2

    }


}