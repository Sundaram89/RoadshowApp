package com.example.masmasfoodapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.DetailMenu
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.popular_menu

class popular_menuAdapter( private val mlist1:List<popular_menu>):RecyclerView.Adapter<popular_menuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ):ViewHolder {
        var view1=LayoutInflater.from(parent.context)
            .inflate(R.layout.popular_menu,parent,false)
        return ViewHolder(view1)
    }


    override fun onBindViewHolder(holder: popular_menuAdapter.ViewHolder, position: Int) {
        val popular_menu=mlist1[position]
        holder.dish_pic.setImageResource(popular_menu.dish_pic)
        holder.dish_name.text=popular_menu.dish_name
        holder.dish_title.text=popular_menu.dish_title
        holder.dish_price.text=popular_menu.dish_price
        holder.itemView.setOnClickListener{
            val intent=Intent(it.context,DetailMenu::class.java)
            it.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return mlist1.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val dish_pic:ImageView=itemView.findViewById(R.id.dish_image)
        val dish_name:TextView=itemView.findViewById(R.id.dish_name)
        val dish_title:TextView=itemView.findViewById(R.id.dish_title)
        val dish_price:TextView=itemView.findViewById(R.id.dish_price)
    }
    }
