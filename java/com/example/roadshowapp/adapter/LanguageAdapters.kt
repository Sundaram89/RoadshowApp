package com.example.roadshowapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.roadshowapp.Model.LanguageItem
import com.example.roadshowapp.R

class LanguageAdapters (var context: Context, var arrayList: ArrayList<LanguageItem>): BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        var view: View = View.inflate(context , R.layout.card_view_grid_item,null)
        var icons: ImageView =view.findViewById(R.id.imageView)
        var icons1: ImageView =view.findViewById(R.id.imageView1)
        var icons12:ImageView=view.findViewById(R.id.imageView21)
        var names: TextView =view.findViewById(R.id.textView)
        var names1: TextView =view.findViewById(R.id.textView1)
        var ListItem:LanguageItem=arrayList.get(position)
        icons.setImageResource(ListItem.icons!!)
        icons1.setImageResource(ListItem.icons1!!)
        icons12.setImageResource(ListItem.icons12!!)
        names.text=ListItem.name
        names1.text=ListItem.name1
        icons1.setOnClickListener {
            if(icons1.isVisible){
                icons12.setVisibility(View.VISIBLE)
            }
            else{
                icons1.setVisibility(View.VISIBLE)
            }
        }
        icons12.setOnClickListener {
            if(icons12.isVisible){
                icons1.setVisibility(View.VISIBLE)
                icons12.setVisibility(View.INVISIBLE)


            }
            else{

                icons12.setVisibility(View.VISIBLE)
            }
        }


        return view

    }


}