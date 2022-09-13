package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle ?= intent.extras
        if (bundle != null) {
            findViewById<TextView>(R.id.textView).text = bundle.getString("value")
        }
        findViewById<Button>(R.id.backToMainActivityButton).setOnClickListener { this.finish() }
    }
}