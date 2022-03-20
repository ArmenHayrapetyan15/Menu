package com.example.recviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val imgActivity2 = findViewById<ImageView>(R.id.image)
        val FirstName = findViewById<TextView>(R.id.name)
        imgActivity2.setImageResource(intent.getIntExtra("ID", 0))
        FirstName.setText(intent.getStringExtra("Name"))
        val back = findViewById<Button>(R.id.Back)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}