package com.example.masmasfoodapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Message_chat
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.chating_model


class chatingAdapter( private val mlist3:List<chating_model>): RecyclerView.Adapter<chatingAdapter.ViewHolder>() {
//    private lateinit var mlistener: OnItemClickListener
//    interface OnItemClickListener{
//        fun onItemClick(position: Int)
//    }
//    fun setOnItemClickListener(listener: OnItemClickListener) {
//        mlistener = listener
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ):ViewHolder {
        var view3= LayoutInflater.from(parent.context)
            .inflate(R.layout.chating,parent,false)
        return ViewHolder(view3)
    }


    override fun onBindViewHolder(holder: chatingAdapter.ViewHolder, position: Int) {
        val message=mlist3[position]
        holder.user_profile.setImageResource(message.user_profile)
        holder.user_name.text=message.user_name
        holder.chat_notification.text=message.chat_notification
        holder.chating_time.text=message.chat_time
        holder.itemView.setOnClickListener{
            val intent = Intent (it.context, Message_chat::class.java)
            it.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return mlist3.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val user_profile: ImageView =itemView.findViewById(R.id.user_profile)
        val user_name: TextView =itemView.findViewById(R.id.user_name)
        val chat_notification: TextView =itemView.findViewById(R.id.chat_notification)
        val chating_time: TextView =itemView.findViewById(R.id.chat_time)
    }
}
