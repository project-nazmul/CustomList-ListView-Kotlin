package com.example.listviewbaseadapter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var names = arrayListOf("Jack","John","Rahim","Karim","Rahul","Rubel","Islam","Jack","John","Rahim","Karim","Rahul","Rubel","Islam","Jack","John","Rahim","Karim","Rahul","Rubel","Islam","Jack","John","Rahim","Karim","Rahul","Rubel","Islam","Jack","John","Rahim","Karim","Rahul","Rubel","Islam","Jack","John","Rahim","Karim","Rahul","Rubel","Islam")
        var addresses = arrayListOf("Dhaka","Camilla","Barista","Ranger","Mandarin","Tiruppur","Kamelia","Dhaka","Camilla","Barista","Ranger","Mandarin","Tiruppur","Kamelia","Dhaka","Camilla","Barista","Ranger","Mandarin","Tiruppur","Kamelia","Dhaka","Camilla","Barista","Ranger","Mandarin","Tiruppur","Kamelia","Dhaka","Camilla","Barista","Ranger","Mandarin","Tiruppur","Kamelia","Dhaka","Camilla","Barista","Ranger","Mandarin","Tiruppur","Kamelia")
        var ages = arrayListOf(20,21,22,23,24,25,26,20,21,22,23,24,25,26,20,21,22,23,24,25,26,20,21,22,23,24,25,26,20,21,22,23,24,25,26,20,21,22,23,24,25,26)

        //var searchView = findViewById<SearchView>(R.id.searchView)
        var listView = findViewById<ListView>(R.id.listView)

        var adapter = CustomAdapter(this, names,ages,addresses)
        listView.adapter = adapter

    }
}