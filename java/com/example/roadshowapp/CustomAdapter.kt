package com.example.roadshowapp

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roadshowapp.CustomAdapter as CustomAdapter

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.add_cart, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.iv_img1.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.tv_txt1.text = ItemsViewModel.text
        holder.tv_txt2.text = ItemsViewModel.text1.toString()
        holder.tv_txt3.text = ItemsViewModel.text2.toString()
        holder.tv_txt4.text = ItemsViewModel.text3
        holder.decrease1.text = ItemsViewModel.decrease1
        holder.value1.text = ItemsViewModel.value1
        holder.increase1.text = ItemsViewModel.increase1
        holder.iv_img2.setImageResource(ItemsViewModel.image1)
        holder.iv_img2.setOnClickListener {
             val newPosition = holder.adapterPosition
            mList.remove(newPosition);
            notifyItemRemoved(newPosition)

        }
        holder.increase1.setOnClickListener {
            var count = Integer.parseInt(holder.value1.getText().toString())
            count++
            holder.value1.setText("" + count)
        }
        holder.decrease1.setOnClickListener {
            var count = Integer.parseInt(holder.value1.getText().toString())
            if (count <= 1) {
                count = 1
            } else {
                count--
                holder.value1.setText("" + count)

            }

        }
    }
    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }
    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val iv_img1: ImageView = itemView.findViewById(R.id.iv_img1)
        val tv_txt1: TextView = itemView.findViewById(R.id.tv_txt1)
        val tv_txt2: TextView =itemView.findViewById(R.id.tv_txt2)
        val tv_txt3: TextView =itemView.findViewById(R.id.tv_txt3)
        val tv_txt4: TextView =itemView.findViewById(R.id.tv_txt4)
        val decrease1:TextView=itemView.findViewById(R.id.decrease1)
        val value1:TextView=itemView.findViewById(R.id.value1)
        val increase1:TextView=itemView.findViewById(R.id.increase1)
        val iv_img2: ImageView =itemView.findViewById(R.id.iv_img2)

    }
}



private fun <E> Collection<E>.remove(position: Int) {

}





