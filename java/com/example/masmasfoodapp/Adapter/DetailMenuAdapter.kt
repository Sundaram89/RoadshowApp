package com.example.masmasfoodapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Message_chat
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.DetailMenuModel
import com.example.masmasfoodapp.model.chating_model

class DetailMenuAdapter ( private val mlist8:List<DetailMenuModel>): RecyclerView.Adapter<DetailMenuAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ):ViewHolder {
        var view8= LayoutInflater.from(parent.context)
            .inflate(R.layout.detail_menu,parent,false)
        return ViewHolder(view8)
    }


    override fun onBindViewHolder(holder: DetailMenuAdapter.ViewHolder, position: Int) {
        val message4=mlist8[position]
        holder.detail_pic.setImageResource(message4.detail_pic)
        holder.detail_name.text=message4.detail_name
        holder.detail_date.text=message4.detail_date
        holder.detail_description.text=message4.detail_descption
        holder.detail_rating.setImageResource(message4.detail_rating)
        holder.detail_ratingpoint.text=message4.detail_ratingpoint
    }

    override fun getItemCount(): Int {
        return mlist8.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val detail_pic: ImageView =itemView.findViewById(R.id.detail_pic)
        val detail_name: TextView =itemView.findViewById(R.id.detail_name)
        val detail_date: TextView =itemView.findViewById(R.id.detail_date)
        val detail_description: TextView =itemView.findViewById(R.id.detail_description)
        val detail_rating:ImageView=itemView.findViewById(R.id.detail_rating)
        val detail_ratingpoint:TextView=itemView.findViewById(R.id.detail_ratingpoint)
    }
}
