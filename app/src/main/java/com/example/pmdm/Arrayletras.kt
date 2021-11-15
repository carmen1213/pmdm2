package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Arrayletras : AppCompatActivity() {
    lateinit var textoarray: TextView
    lateinit var textoarrayc: TextView
    lateinit var textoarrayv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arrayletras)
        textoarray = findViewById(R.id.textView8)
        textoarrayc = findViewById(R.id.textView12)
        textoarrayv = findViewById(R.id.textView10)

        var abecedario = 'a'..'z'
        val Arrayabecedario = mutableListOf<String>()
        var letracualquiera = "a"
        val Arrayvocales = mutableListOf<String>()
        val Arrayconsonantes = mutableListOf<String>()

        var calculararray = findViewById<Button>(R.id.button4)
        calculararray.setOnClickListener {

            Arrayabecedario.clear()
            Arrayconsonantes.clear()
            Arrayvocales.clear()

            for (i in 0..9) {
                letracualquiera = abecedario.random().toString()
                Arrayabecedario.add(letracualquiera)
                textoarray.text = ""
                textoarray.text = Arrayabecedario.toString()
                if (Arrayabecedario[i] == "a" || Arrayabecedario[i] == "e" || Arrayabecedario[i] == "i" || Arrayabecedario[i] == "o" || Arrayabecedario[i] == "u") {
                    Arrayvocales.add(letracualquiera)
                    textoarrayv.text = ""
                    textoarrayv.text = Arrayvocales.toString()

                } else {
                    Arrayconsonantes.add(letracualquiera)
                    textoarrayc.text = ""
                    textoarrayc.text = Arrayconsonantes.toString()
                }

            }




        }
    }
}

