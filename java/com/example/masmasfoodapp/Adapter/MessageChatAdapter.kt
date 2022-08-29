package com.example.masmasfoodapp.Adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.MessageChatModel
import com.example.masmasfoodapp.model.chating_model


class MessageChatAdapter(val context: Context,val messageList:ArrayList<MessageChatModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val ITEM_RECIVE = 1
    val ITEM_SEND = 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == ITEM_RECIVE) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.recieve_layout, parent, false)
            return RecieveViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.send_layout, parent, false)
            return SentViewHolder(view)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentMessage = messageList[position]
        if (holder.javaClass == SentViewHolder::class.java) {

            val viewHolder = holder as SentViewHolder

            holder.sentMessage.text = currentMessage.message

        } else {
            val viewHolder = holder as RecieveViewHolder
            holder.recieveMessage.text = currentMessage.message
        }
    }

    override fun getItemViewType(position: Int): Int {
        val currentMessage = messageList[position]
        if(equals(currentMessage.senderId))
        {
            Log.e("getItemViewType", "1")
            return ITEM_RECIVE

        }
        else
        {
            Log.e("getItemViewType", "2")
            return ITEM_SEND
        }
    }


    override fun getItemCount(): Int {
        return messageList.size
    }
    class SentViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val sentMessage=itemView.findViewById<TextView>(R.id.message)

    }
    class RecieveViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val recieveMessage=itemView.findViewById<TextView>(R.id.message1)
    }
}