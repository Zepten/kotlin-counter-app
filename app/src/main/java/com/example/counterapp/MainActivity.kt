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

        // Поле со значением счётчика
        val valueText: TextView = findViewById(R.id.valueTextView)
        valueText.text = currentValueText

        // Поле ввода шага счётчика
        val stepText: EditText = findViewById(R.id.stepEditText)
        stepText.setText(resources.getText(R.string.default_step_text))

        // Кнопка "прибавить"
        val plusButton: ImageButton = findViewById(R.id.plusImageButton)
        plusButton.setOnClickListener { updateCounterValue(add=true) }

        // Кнопка "вычесть"
        val minusButton: ImageButton = findViewById(R.id.minusImageButton)
        minusButton.setOnClickListener { updateCounterValue(add=false) }

        // Кнопка "перейти на 2-ю активность"
        val secondActivityButton: Button = findViewById(R.id.secondActivityButton)
        secondActivityButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("value", valueText.text.toString())
            startActivity(intent)
        }
    }

    private fun updateCounterValue(add: Boolean) {
        val valueText: TextView = findViewById(R.id.valueTextView)
        val stepText: EditText = findViewById(R.id.stepEditText)
        val value: Int = valueText.text.toString().toInt()
        var step: Int = stepText.text.toString().toInt()
        step = if (add) step else -step
        currentValueText = (value + step).toString()
        valueText.text = currentValueText
    }

    companion object {
        private var currentValueText: String = "0"
    }
}