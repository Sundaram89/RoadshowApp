package com.example.masmasfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.notificationAdapter
import com.example.masmasfoodapp.Adapter.popular_menuAdapter
import com.example.masmasfoodapp.model.notification_model
import com.example.masmasfoodapp.model.popular_menu

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val notification_recycleview=findViewById<RecyclerView>(R.id.notification_recycleview)
        notification_recycleview.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val data5=ArrayList<notification_model>()
        data5.add(notification_model(R.drawable.ic_checked__1__1,"Your order has been taken by the driver","Recently"))
        data5.add(notification_model(R.drawable.ic_money_1,"Topup for \$100 was successful","10.00 Am"))
        data5.add(notification_model(R.drawable.ic_x_button_1,"Your order has been canceled","22 Juny 2021"))
        val adapter4= notificationAdapter(data5)
        notification_recycleview.adapter=adapter4
    }
}