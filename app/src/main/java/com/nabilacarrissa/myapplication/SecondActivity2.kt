package com.nabilacarrissa.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second2)

        val username = intent.getStringExtra("USERNAME") ?: "User"
        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        greetingTextView.text = "Halo, selamat datang kembali!\n $username"
    }
}
