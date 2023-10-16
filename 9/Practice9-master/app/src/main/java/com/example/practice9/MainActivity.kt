package com.example.practice9

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text3 = findViewById<TextView>(R.id.textView3)
        text3.text = "Copyright (C) 2021"
        text3.setTextColor(getColor(R.color.my_color))
    }

}