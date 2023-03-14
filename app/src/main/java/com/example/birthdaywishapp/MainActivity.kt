package com.example.birthdaywishapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edit_text1:EditText
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_text1=findViewById(R.id.edit_text1)
        btn1=findViewById(R.id.btn1)

        btn1.setOnClickListener {

            val editTextValue = edit_text1.text.toString()

            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("editTextValue",editTextValue)
            startActivity(intent)
        }
    }
}