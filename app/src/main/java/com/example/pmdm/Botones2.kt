package com.example.pmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Botones2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones2)

        val boton1 = findViewById<Button>(R.id.saludo)

        boton1.setOnClickListener {

            val cambiando = Intent(this, Saludos ::class.java)

            startActivity(cambiando)

        }
        val suma = findViewById<Button>(R.id.suma)

        suma.setOnClickListener {

            val cambiando = Intent(this, Suma ::class.java)

            startActivity(cambiando)

        }

        val Calculadora = findViewById<Button>(R.id.ejercicio1)

        Calculadora.setOnClickListener {

            val cambiando = Intent(this, calculadora ::class.java)

            startActivity(cambiando)

        }
        val Fibonacci = findViewById<Button>(R.id.ejercicio2)

        Fibonacci.setOnClickListener {

            val cambiando = Intent(this, fibonacci ::class.java)

            startActivity(cambiando)

        }
        val arrayletras = findViewById<Button>(R.id.ejercicio4)

        arrayletras.setOnClickListener {

            val cambiando = Intent(this, Arrayletras ::class.java)

            startActivity(cambiando)

        }

    }


}