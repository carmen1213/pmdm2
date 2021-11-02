package com.example.pmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.button)

        boton1.setOnClickListener {

            val cambiando = Intent(this, Botones2 ::class.java)

            startActivity(cambiando)

        }
    }
}