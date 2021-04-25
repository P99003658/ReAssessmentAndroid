package com.example.recyclerviewfragments

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class Adapter() : RecyclerView.Adapter<Adapter.MyViewHolder>() {
     private lateinit var userlist:ArrayList<UsersData>
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun holdingViews(users : UsersData){
            var name = itemView.findViewById<TextView>(R.id.textViewName)
            var location = itemView.findViewById<TextView>(R.id.textViewLocation)
            var track = itemView.findViewById<TextView>(R.id.textViewTrack)
            name.setText(users.name)
            location.setText(users.location)
            track.setText(users.track)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var a = LayoutInflater.from(parent.context).inflate(R.layout.carditem_layout,parent,false)
        return MyViewHolder(a)
    }
    override fun getItemCount(): Int {
        return userlist.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.holdingViews(userlist[position])
    }
}