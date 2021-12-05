package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var kotlinButton: Button
    private lateinit var androidButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "Home"

        kotlinButton = findViewById(R.id.kotlinButton)
        androidButton = findViewById(R.id.androidButton)


        kotlinButton.setOnClickListener {
            val intent = Intent(this, Kotlin_MainActivity::class.java)
            startActivity(intent)
        }

        androidButton.setOnClickListener {
            val intent = Intent(this, Android_MainActivity::class.java)
            startActivity(intent)
        }
    }
}