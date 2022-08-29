package com.example.masmasfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.DetailMenuAdapter
import com.example.masmasfoodapp.Adapter.ResturantProductAdapter
import com.example.masmasfoodapp.Adapter.nearest_resturantAdapter
import com.example.masmasfoodapp.model.DetailMenuModel
import com.example.masmasfoodapp.model.ResturantProductModel
import com.example.masmasfoodapp.model.nearest_resturant

class Detail_product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)

        val detailproduct_recyleview=findViewById<RecyclerView>(R.id.resturant_recyleview)
        detailproduct_recyleview.layoutManager = LinearLayoutManager(
          this, LinearLayoutManager.HORIZONTAL, false)
        val data9=ArrayList<ResturantProductModel>()
        data9.add(ResturantProductModel(R.drawable.product_pic,"Spacy fresh crab","12 \$"))
        data9.add(ResturantProductModel(R.drawable.product_pic,"Spacy fresh crab","12 \$"))
        data9.add(ResturantProductModel(R.drawable.product_pic,"Spacy fresh crab","12 \$"))
        data9.add(ResturantProductModel(R.drawable.product_pic,"Spacy fresh crab","12 \$"))

        val adapter = ResturantProductAdapter(data9)
        // Setting the Adapter with the recyclerview
       detailproduct_recyleview.adapter = adapter
        val detailMenu_recycleview=findViewById<RecyclerView>(R.id.detailProduct_recycleview)
        detailMenu_recycleview.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val data8=ArrayList<DetailMenuModel>()
        data8.add(DetailMenuModel(R.drawable.user_pic,"Dianne Russell","12 April 2021","This Is great, So delicious! You Must Here, With Your family . .",R.drawable.ic_icon_star__1_,"5"))
        data8.add(DetailMenuModel(R.drawable.user_pic,"Dianne Russell","12 April 2021","This Is great, So delicious! You Must Here, With Your family . .",R.drawable.ic_icon_star__1_,"5"))
        data8.add(DetailMenuModel(R.drawable.user_pic,"Dianne Russell","12 April 2021","This Is great, So delicious! You Must Here, With Your family . .",R.drawable.ic_icon_star__1_,"5"))
        data8.add(DetailMenuModel(R.drawable.user_pic,"Dianne Russell","12 April 2021","This Is great, So delicious! You Must Here, With Your family . .",R.drawable.ic_icon_star__1_,"5"))

        val adapter4= DetailMenuAdapter(data8)
        detailMenu_recycleview.adapter=adapter4
    }
    }
