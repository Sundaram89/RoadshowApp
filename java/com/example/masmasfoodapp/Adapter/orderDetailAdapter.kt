package com.example.masmasfoodapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.ordreDetailModel
import com.example.masmasfoodapp.model.popular_menu

class orderDetailAdapter( private val mlist5:List<ordreDetailModel>): RecyclerView.Adapter<orderDetailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ):ViewHolder {
        var view5= LayoutInflater.from(parent.context)
            .inflate(R.layout.orderdetail,parent,false)
        return ViewHolder(view5)
    }


    override fun onBindViewHolder(holder: orderDetailAdapter.ViewHolder, position: Int) {
        val order_detail=mlist5[position]
        holder.dish_pic1.setImageResource(order_detail.menu_pic1)
        holder.dish_name1.text=order_detail.dish_name1
        holder.dish_title1.text=order_detail.dish_title1
        holder.dish_price1.text=order_detail.dish_price1
        holder.decrease.text=order_detail.descrease
        holder.quantity.text=order_detail.quanity
        holder.increase.text=order_detail.increase
        holder.increase.setOnClickListener {
            var count = Integer.parseInt(holder.quantity.getText().toString())
            count++
            holder.quantity.setText("" + count)
        }
        holder.decrease.setOnClickListener {
            var count = Integer.parseInt(holder.quantity.getText().toString())
            if (count <= 1) {
                count = 1
            } else {
                count--
                holder.quantity.setText("" + count)

            }

        }

    }
    override fun getItemCount(): Int {
        return mlist5.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val dish_pic1: ImageView =itemView.findViewById(R.id.menu_photo1)
        val dish_name1: TextView =itemView.findViewById(R.id.dish_name1)
        val dish_title1: TextView =itemView.findViewById(R.id.dish_title1)
        val dish_price1: TextView =itemView.findViewById(R.id.disc_price1)
        val quantity:TextView=itemView.findViewById(R.id.quantity)
        val decrease:TextView=itemView.findViewById(R.id.decrease)
        val increase:TextView=itemView.findViewById(R.id.incerase)
    }
}
