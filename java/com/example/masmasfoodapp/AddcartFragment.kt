package com.example.masmasfoodapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.notificationAdapter
import com.example.masmasfoodapp.Adapter.orderDetailAdapter
import com.example.masmasfoodapp.model.notification_model
import com.example.masmasfoodapp.model.ordreDetailModel

class AddcartFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_addcart, container, false)
        val place_order=view.findViewById<Button>(R.id.place_order)
        place_order?.setOnClickListener {
            val intent=Intent(context,ConfirmOrder::class.java)
            startActivity(intent)
        }
        val order_recycleview=view.findViewById<RecyclerView>(R.id.orderDetails_recycleview)
        order_recycleview.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val data6=ArrayList<ordreDetailModel>()
        data6.add(ordreDetailModel(R.drawable.menuphoto5,"Spacy fresh crab","Waroenk kita","\$ 35","-","1","+"))
        data6.add(ordreDetailModel(R.drawable.ic_money_1,"Spacy fresh crab","Waroenk kita","\$ 35","-","1","+"))
        data6.add(ordreDetailModel(R.drawable.ic_x_button_1,"Spacy fresh crab","Waroenk kita","\$ 35","-","1","+"))
        data6.add(ordreDetailModel(R.drawable.menuphoto5,"Spacy fresh crab","Waroenk kita","\$ 35","-","1","+"))
        data6.add(ordreDetailModel(R.drawable.ic_money_1,"Spacy fresh crab","Waroenk kita","\$ 35","-","1","+"))
        data6.add(ordreDetailModel(R.drawable.ic_x_button_1,"Spacy fresh crab","Waroenk kita","\$ 35","-","1","+"))
        val adapter4= orderDetailAdapter(data6)
        order_recycleview.adapter=adapter4
        return view
    }


    }
