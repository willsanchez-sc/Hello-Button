package com.example.hellobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton: Button = findViewById(R.id.helloButton)

        helloButton.setOnClickListener {
            sayHello()
        }
    }



    private fun sayHello() {
        val helloText: TextView = findViewById(R.id.helloText)
        helloText.text = "Hello World!"
    }
}