package com.example.roadshowapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter1(private val mList: List<ItemsViewModel1>) : RecyclerView.Adapter<CustomAdapter1.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.faviort_cart, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel1 = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.iv_img3.setImageResource(ItemsViewModel1.images1)

        // sets the text to the textview from our itemHolder class
        holder.tv_txt5.text = ItemsViewModel1.texts1
        holder.tv_txt6.text = ItemsViewModel1.texts2.toString()
        holder.tv_txt7.text = ItemsViewModel1.texts3.toString()
        holder.tv_txt8.text = ItemsViewModel1.texts4
        holder.iv_img4.setImageResource(ItemsViewModel1.images2)
    }
    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val iv_img3: ImageView = itemView.findViewById(R.id.iv_img3)
        val tv_txt5: TextView = itemView.findViewById(R.id.tv_txt5)
        val tv_txt6: TextView =itemView.findViewById(R.id.tv_txt6)
        val tv_txt7: TextView =itemView.findViewById(R.id.tv_txt7)
        val tv_txt8: TextView =itemView.findViewById(R.id.tv_txt8)
        val iv_img4: ImageView =itemView.findViewById(R.id.iv_img4)


    }
}

