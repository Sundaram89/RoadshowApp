package com.example.masmasfoodapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.ResturantProductModel


class ResturantProductAdapter(private val mlist9: List<ResturantProductModel>) :
    RecyclerView.Adapter<ResturantProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view9 = LayoutInflater.from(parent.context)
            .inflate(R.layout.resturant_product, parent, false)

        return ViewHolder(view9)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val detail_product = mlist9[position]
        holder.product_pic.setImageResource(detail_product.product_pic)
        holder.product_name.text = detail_product.product_name
        holder.product_price.text = detail_product.product_price
    }

    override fun getItemCount(): Int {
        return mlist9.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val product_pic: ImageView = itemView.findViewById(R.id.product_pic)
        val product_name: TextView = itemView.findViewById(R.id.product_name)
        val product_price: TextView = itemView.findViewById(R.id.product_price)

    }
}
