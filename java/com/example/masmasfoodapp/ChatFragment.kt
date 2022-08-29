package com.example.masmasfoodapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.chatingAdapter
import com.example.masmasfoodapp.Adapter.popular_menuAdapter
import com.example.masmasfoodapp.model.chating_model
import com.example.masmasfoodapp.model.popular_menu

class ChatFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_chat, container, false)
        var chating = view?.findViewById<RecyclerView>(R.id.chating)
        chating?.layoutManager = LinearLayoutManager(context)
        var chat = ArrayList<chating_model>()
        chat.add(chating_model(R.drawable.userprofile1,
            "Louis Kelly",
            "Your Order Just Arrived!",
            "20:00"))
        chat.add(chating_model(R.drawable.user_profile1,
            "Paul Koch",
            "Your Order Just Arrived!",
            "20:00"))
        chat.add(chating_model(R.drawable.user_profile2,
            "Carla Klein",
            "Your Order Just Arrived!",
            "20:00"))
        val adapter3 = chatingAdapter(chat)
        chating?.adapter = adapter3
        return view
    }

}