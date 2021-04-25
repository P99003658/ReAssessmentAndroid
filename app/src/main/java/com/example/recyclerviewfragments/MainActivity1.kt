package com.example.recyclerviewfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity1(): AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
       // var adapter: RecyclerView.Adapter<Adapter.MyViewHolder>? = null
        // var rview = findViewById<RecyclerView>(R.id.myrecyclerview)
       //rview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        var data = ArrayList<UsersData>()
        data.add(UsersData("Name: Pankaj","Location: Bangalore","Track: SPS Java"))
        data.add(UsersData("Name: Bhanu","Location: Mysore","Track: SPS C#"))
        data.add(UsersData("Name: Ravi","Location: Mumbai","Track: Embedded"))
        data.add(UsersData("Name: Geethika","Location: Baroda","Track: Python"))
        data.add(UsersData("Name: Khanith","Location: Hyderabad","Track: SPS Java"))
     //   adapter = Adapter()
        supportFragmentManager.beginTransaction().add(R.id.yellow_layout,MainFragment()).commit()
    }
}