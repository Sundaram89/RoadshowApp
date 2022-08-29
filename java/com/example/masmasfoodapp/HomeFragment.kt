package com.example.masmasfoodapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.nearest_resturantAdapter
import com.example.masmasfoodapp.Adapter.popular_menuAdapter
import com.example.masmasfoodapp.model.nearest_resturant
import com.example.masmasfoodapp.model.popular_menu


class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
         val notification=view?.findViewById<LinearLayout>(R.id.notication)
        notification?.setOnClickListener{
            val intent=Intent(requireContext(),Notification::class.java)
            startActivity(intent)
        }
        val resturant_viewmore=view?.findViewById<TextView>(R.id.resturant_viewmore)
        resturant_viewmore?.setOnClickListener {
            val intent= Intent(requireContext(),Popular_Resturant::class.java)
            startActivity(intent)
        }
        val popularmenu_viewmore=view?.findViewById<TextView>(R.id.popular_menuViewmore)
        popularmenu_viewmore?.setOnClickListener {
            val intent= Intent(requireContext(),Popular_menu::class.java)
            startActivity(intent)
        }
        val filter=view?.findViewById<LinearLayout>(R.id.filter)
        filter?.setOnClickListener {
            val intent= Intent(requireContext(),Filter::class.java)
            startActivity(intent)
        }
        val popular_menu=view?.findViewById<RecyclerView>(R.id.popular_menu)
        popular_menu?.layoutManager= LinearLayoutManager(context)
        val data1=ArrayList<popular_menu>()
        data1.add(popular_menu(R.drawable.menu_photo,"Herbal Pancake","Warung Herbal","$7"))
        data1.add(popular_menu(R.drawable.menu_photo2,"Fruit Salad","Wijie Resto","$5"))
        data1.add(popular_menu(R.drawable.menu_photo3,"Noodle Home","Warung Herbal","$15"))
        val adapter1= popular_menuAdapter(data1)
        popular_menu?.adapter=adapter1

        val nearest_resturnt=view?.findViewById<RecyclerView>(R.id.nearest_resturant)
        nearest_resturnt?.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val data=ArrayList<nearest_resturant>()
        data.add(nearest_resturant(R.drawable.resturant_image1,"Vegan Resto","12 Mins"))
        data.add(nearest_resturant(R.drawable.resturant_image3,"Healthy Food","8 Mins"))
        data.add(nearest_resturant(R.drawable.resturant_image2,"Good Food","12 Mins"))
        data.add(nearest_resturant(R.drawable.resturant_item4,"Smart Resto","8 Mins"))
        val adapter = nearest_resturantAdapter(data)
        // Setting the Adapter with the recyclerview
        nearest_resturnt?.adapter = adapter

        return view
    }

}