package com.example.masmasfoodapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Message_chat
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.ProfileMenuModel
import com.example.masmasfoodapp.model.chating_model

class ProfilemenuAdapter ( private val mlist7:List<ProfileMenuModel>): RecyclerView.Adapter<ProfilemenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ):ViewHolder {
        var view7= LayoutInflater.from(parent.context)
            .inflate(R.layout.profile_menu,parent,false)
        return ViewHolder(view7)
    }


    override fun onBindViewHolder(holder: ProfilemenuAdapter.ViewHolder, position: Int) {
        val message2=mlist7[position]
        holder.menu_pic.setImageResource(message2.menu_pic)
        holder.menu_name.text=message2.menu_name
        holder.menu_tittle.text=message2.menu_title
        holder.menu_price.text=message2.menu_price
        holder.buy_again.text=message2.buy_again
    }

    override fun getItemCount(): Int {
        return mlist7.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val menu_pic: ImageView =itemView.findViewById(R.id.menu_pic)
        val menu_name: TextView =itemView.findViewById(R.id.menu_name)
        val menu_tittle: TextView =itemView.findViewById(R.id.menu_tittle)
        val menu_price: TextView =itemView.findViewById(R.id.menu_price)
        val buy_again:Button=itemView.findViewById(R.id.buy_again)
    }
}