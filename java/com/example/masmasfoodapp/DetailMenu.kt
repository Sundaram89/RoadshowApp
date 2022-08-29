package com.example.masmasfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.DetailMenuAdapter
import com.example.masmasfoodapp.Adapter.notificationAdapter
import com.example.masmasfoodapp.model.DetailMenuModel
import com.example.masmasfoodapp.model.notification_model

class DetailMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)
        val detailMenu_recycleview=findViewById<RecyclerView>(R.id.detailMenu_recycleview)
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