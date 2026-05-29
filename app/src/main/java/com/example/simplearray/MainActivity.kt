package com.example.simplearray

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txtNum1: EditText
    lateinit var txtNum2: EditText
    lateinit var txtNum3: EditText
    lateinit var txtNum4: EditText
    lateinit var txtNum5: EditText
    lateinit var txtPosition: EditText
    lateinit var tvResults: TextView
    lateinit var btnAll: Button
    lateinit var btnEPosition: Button
    lateinit var btnSum: Button
    lateinit var btnAverage: Button
    lateinit var btnSize: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        txtNum1 = findViewById(R.id.txtNum1)
        txtNum2 = findViewById(R.id.txtNum2)
        txtNum3 = findViewById(R.id.txtNum3)
        txtNum4 = findViewById(R.id.txtNum4)
        txtNum5 = findViewById(R.id.txtNum5)
        txtPosition = findViewById(R.id.txtPosition)
        tvResults = findViewById(R.id.tvResults)
        btnSize = findViewById(R.id.btnSize)
        btnAll = findViewById(R.id.btnAll)
        btnEPosition = findViewById(R.id.btnEPosition)
        btnSum = findViewById(R.id.btnSum)
        btnAverage = findViewById(R.id.btnAverage)

        btnAll.setOnClickListener {
            val n1 = txtNum1.text.toString().toInt()
            val n2 = txtNum2.text.toString().toInt()
            val n3 = txtNum3.text.toString().toInt()
            val n4 = txtNum4.text.toString().toInt()
            val n5 = txtNum5.text.toString().toInt()

            val numbers = intArrayOf(n1, n2, n3, n4 , n5)

            tvResults.text = "Array: ${numbers.joinToString (", " )}"
        }

        btnEPosition.setOnClickListener {
            val n1 = txtNum1.text.toString().toInt()
            val n2 = txtNum2.text.toString().toInt()
            val n3 = txtNum3.text.toString().toInt()
            val n4 = txtNum4.text.toString().toInt()
            val n5 = txtNum5.text.toString().toInt()

            val numbers = intArrayOf(n1, n2, n3, n4 , n5)
            val pos = txtPosition.text.toString().toIntOrNull()

            if(pos != null && pos in numbers.indices) {
                tvResults.text = "Element at Position $pos = ${numbers[pos]}"
            }else{
                tvResults.text = "Invalid position (use 0 - 4)"
            }

        }

        btnSum.setOnClickListener {
            val n1 = txtNum1.text.toString().toInt()
            val n2 = txtNum2.text.toString().toInt()
            val n3 = txtNum3.text.toString().toInt()
            val n4 = txtNum4.text.toString().toInt()
            val n5 = txtNum5.text.toString().toInt()

            val numbers = intArrayOf(n1, n2, n3, n4 , n5)

            var sum = 0
            for(n in numbers) {
               sum += n
            }
            tvResults.text = "Sum = $sum"
        }

        btnAverage.setOnClickListener {
            val n1 = txtNum1.text.toString().toInt()
            val n2 = txtNum2.text.toString().toInt()
            val n3 = txtNum3.text.toString().toInt()
            val n4 = txtNum4.text.toString().toInt()
            val n5 = txtNum5.text.toString().toInt()

            val numbers = intArrayOf(n1, n2, n3, n4 , n5)

            var sum = 0
            for(n in numbers) {
                sum += n
            }
            val average = sum / numbers.size
            tvResults.text = "Average: $average"
        }

        btnSize.setOnClickListener {
            val n1 = txtNum1.text.toString().toInt()
            val n2 = txtNum2.text.toString().toInt()
            val n3 = txtNum3.text.toString().toInt()
            val n4 = txtNum4.text.toString().toInt()
            val n5 = txtNum5.text.toString().toInt()

            val numbers = intArrayOf(n1, n2, n3, n4 , n5)



            tvResults.text = "Array size = ${numbers.size}"
        }

    }
}