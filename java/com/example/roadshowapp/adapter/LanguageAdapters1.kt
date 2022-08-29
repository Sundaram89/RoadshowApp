package com.example.roadshowapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.roadshowapp.Model.LanguageItem
import com.example.roadshowapp.Model.LanguageItem1
import com.example.roadshowapp.R

class LanguageAdapters1 (var context: Context, var arrayList: ArrayList<LanguageItem1>): BaseAdapter() {
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
        var view: View = View.inflate(context , R.layout.card_view_grid_item1,null)
        var icon: ImageView =view.findViewById(R.id.imageView11)
        var icon1: ImageView =view.findViewById(R.id.imageView12)
        var name: TextView =view.findViewById(R.id.textView11)
        var name1: TextView =view.findViewById(R.id.textView12)
        var ListItem: LanguageItem1 =arrayList.get(position)
        icon.setImageResource(ListItem.icon!!)
        icon1.setImageResource(ListItem.icon1!!)
        name.text=ListItem.names
        name1.text=ListItem.names1

        return view

    }

}