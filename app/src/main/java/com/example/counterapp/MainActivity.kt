package com.example.counterapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valueText = findViewById<TextView>(R.id.valueTextView)
        val stepText = findViewById<EditText>(R.id.stepEditText)
        valueText.text = currentValueText
        stepText.setText("1")

        // Кнопка "прибавить"
        findViewById<ImageButton>(R.id.plusImageButton).setOnClickListener {
            val value: Int = valueText.text.toString().toInt()
            val step: Int = stepText.text.toString().toInt()
            currentValueText = (value + step).toString()
            valueText.text = currentValueText
        }

        // Кнопка "вычесть"
        findViewById<ImageButton>(R.id.minusImageButton).setOnClickListener {
            val value: Int = valueText.text.toString().toInt()
            val step: Int = stepText.text.toString().toInt()
            currentValueText = (value - step).toString()
            valueText.text = currentValueText
        }

        // Кнопка "перейти на 2-ю активность"
        findViewById<Button>(R.id.secondActivityButton).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("value", valueText.text.toString())
            startActivity(intent)
        }
    }

    companion object {
        private var currentValueText: String = "0"
    }
}