package com.example.listviewbaseadapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.TextView

class CustomAdapter(
    var mainActivity: MainActivity,
    var names:ArrayList<String>,
    var ages:ArrayList<Int>,
    var addresses:ArrayList<String>):BaseAdapter() {
    override fun getCount(): Int {
        return names.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("MissingInflatedId", "ViewHolder", "SetTextI18n", "ClickableViewAccessibility")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(mainActivity).inflate(R.layout.single_list_item,parent,false)
        val name = view.findViewById<TextView>(R.id.name)
        val address = view.findViewById<TextView>(R.id.address)
        val age = view.findViewById<TextView>(R.id.age)
        val sl = view.findViewById<TextView>(R.id.sl)

        sl.text = (position+1).toString()
        name.text = names[position]
        address.text = addresses[position]
        age.text = ages[position].toString()

        return view

    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getViewTypeCount(): Int {
        return names.size
    }
}