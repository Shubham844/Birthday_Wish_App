package com.example.birthdaywishapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var textView2:TextView
    lateinit var textView3:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView2=findViewById(R.id.textView2)
        textView3=findViewById(R.id.textView3)

        val intent = intent
        val editTextValue = intent.getStringExtra("editTextValue")
        textView3.text = editTextValue

    }
}
