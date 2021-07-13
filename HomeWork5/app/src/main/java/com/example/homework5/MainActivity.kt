package com.example.homework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardWidget = findViewById<CardView>(R.id.idCardView)
        val text = getString(R.string.answer)

        cardWidget.setOnClickListener {
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }


    }
}

