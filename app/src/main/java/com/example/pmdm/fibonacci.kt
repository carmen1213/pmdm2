package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class fibonacci : AppCompatActivity() {
    lateinit var texto: TextView
    val ArrayNums = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        ArrayNums.add(0)
        ArrayNums.add(1)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibonacci)
        texto = findViewById(R.id.textofibo)

                var calcular = findViewById<Button>(R.id.button3)
                calcular.setOnClickListener {
            if (ArrayNums.size>28){
                texto.text = "Has llegado al final"
            }else{
                ArrayNums.add(ArrayNums[ArrayNums.size-1]+ArrayNums[ArrayNums.size-2])
                texto.text = ArrayNums.toString()
            }
        }
    }
}