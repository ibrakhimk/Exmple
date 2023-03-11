package com.example.exmple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.exmple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            calculate("+")
        }
        binding.btnMinis.setOnClickListener {
            calculate("-")
        }
    }

    private fun calculate(operator: String) {
        val number1 = binding.etNum.text.toString().toDouble()
        val number2 = binding.etNum1.text.toString().toDouble()
        val result = when (operator) {
            "+" -> number1 + number2
            "-" -> number1 - number2
            "*" -> number1 * number2
            "/" -> number1 / number2
            else -> 0.0
        }
        Toast.makeText(this, "Результат: $result", Toast.LENGTH_SHORT).show()
    }
}