package com.example.masmasfoodapp.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.R
import com.example.masmasfoodapp.model.notification_model

class notificationAdapter ( private val mlist4:List<notification_model>): RecyclerView.Adapter<notificationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ):ViewHolder {
        var view4= LayoutInflater.from(parent.context)
            .inflate(R.layout.notification,parent,false)
        return ViewHolder(view4)
    }

    override fun onBindViewHolder(holder: notificationAdapter.ViewHolder, position: Int) {
        val message2=mlist4[position]
        holder.order_confirmationpic.setImageResource(message2.order_confirmationpic)
        holder.order_notification.text=message2.order_notification
        holder.order_update.text=message2.order_update

    }

    override fun getItemCount(): Int {
        return mlist4.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val order_confirmationpic: ImageView =itemView.findViewById(R.id.order_confirmationpic)
        val order_notification: TextView =itemView.findViewById(R.id.order_notification)
        val order_update: TextView =itemView.findViewById(R.id.order_update)

    }
}
