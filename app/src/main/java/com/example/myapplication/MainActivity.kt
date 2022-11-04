package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var nextPageButton : ImageView
    lateinit var number : TextView
    lateinit var increaseButton : ImageView
    lateinit var messagesButton : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextPageButton = findViewById(R.id.coffeeButton)
        number = findViewById(R.id.numberTextView)
        increaseButton = findViewById(R.id.contactsButton)
        messagesButton = findViewById(R.id.messagesButton)

        nextPageButton.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        increaseButton.setOnClickListener{
            var numberResult = number.text.toString().toInt()
            numberResult++
            number.text = numberResult.toString()
        }

        messagesButton.setOnClickListener {
            //toast
            Toast.makeText(this, "function unavailable!", Toast.LENGTH_SHORT).show()
        }

    }

}