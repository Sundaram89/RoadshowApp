package com.example.masmasfoodapp.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.nearest_resturant1

class popular_resturantAdapter(var context: Context, var arrayList: ArrayList<nearest_resturant1>):
    BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
      var view :View= View.inflate(context, R.layout.nearest_resturant1,null)
        var resturant_logo1:ImageView=view.findViewById(R.id.resturant_logo1)
        var resturant_name1 :TextView=view.findViewById(R.id.resturant_name1)
        var resturant_distance1:TextView=view.findViewById(R.id.resturant_distance1)
        var resturantList: nearest_resturant1=arrayList.get(position)
        resturant_logo1.setImageResource(resturantList.resturant_logo1!!)
        resturant_name1.text=resturantList.resturant_name1!!
        resturant_distance1.text=resturantList.resturant_distance1!!
        return view
    }
}