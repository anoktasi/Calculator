package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var result: Any = 0
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

    }

    fun mySum(view: View) {
        val number = binding.editTextNumber.text.toString().toIntOrNull()
        val number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (number == null || number2 == null) {
            binding.resultText.text = " "
        } else {
            result = number + number2
        }

    }

    fun mySub(view: View) {
        val number = binding.editTextNumber.text.toString().toIntOrNull()
        val number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (number == null || number2 == null) {
            binding.resultText.text = " "
        } else {
            result = number - number2
        }
    }

    fun myMultiply(view: View) {
        val number = binding.editTextNumber.text.toString().toIntOrNull()
        val number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (number == null || number2 == null) {
            binding.resultText.text = " "
        } else {
            result = number * number2
        }
    }

    fun myDiv(view: View) {
        val number = binding.editTextNumber.text.toString().toFloatOrNull()
        val number2 = binding.editTextNumber2.text.toString().toFloatOrNull()

        if (number == null || number2 == null) {
            binding.resultText.text = " "
        } else {
            result = number / number2

        }
    }

    fun equals(view: View) {
        binding.resultText.text = "$result"
    }

    fun clearText(view: View){
        binding.editTextNumber.text.clear()
        binding.editTextNumber2.text.clear()
        binding.resultText.text = " "
    }
}