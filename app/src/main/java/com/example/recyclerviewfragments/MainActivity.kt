package com.example.recyclerviewfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            //var un=editTextTextPersonName2.text.toString()
            Toast.makeText(this, "WELCOME BUTTON CLICKED", Toast.LENGTH_LONG).show()
            // editTextTextPersonName2.setText(un)
            var myIntent = Intent(this, MainActivity1::class.java)
            startActivity(myIntent)
        }
    }
}