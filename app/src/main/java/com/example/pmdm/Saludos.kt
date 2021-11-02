package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Saludos : AppCompatActivity() {
    lateinit var bienvenida : Button
    lateinit var bienvenidati : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludos)
        bienvenida = findViewById(R.id.bienvenida)
        bienvenidati = findViewById(R.id.bienvenidati)

    }
    fun onClickbienvenida(view : View){
        MostrarMensaje("Has Pulsado el Boton!")
        bienvenidati.text = "Bienvenido a mi maravillosa Pagina"
    }

    private fun MostrarMensaje(message: String) {
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show()

    }

}