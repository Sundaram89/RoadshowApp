package com.example.masmasfoodapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.nearest_resturant

class nearest_resturantAdapter(private val mlist: List<nearest_resturant>) :
    RecyclerView.Adapter<nearest_resturantAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.nearest_resturant, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nearest_resturant = mlist[position]
        holder.resturant_logo.setImageResource(nearest_resturant.image)
        holder.resturant_name.text = nearest_resturant.text1
        holder.resturant_distance.text = nearest_resturant.text2
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val resturant_logo: ImageView = itemView.findViewById(R.id.resturant_logo)
        val resturant_name: TextView = itemView.findViewById(R.id.resturant_name)
        val resturant_distance: TextView = itemView.findViewById(R.id.resturant_distance)

    }
}
