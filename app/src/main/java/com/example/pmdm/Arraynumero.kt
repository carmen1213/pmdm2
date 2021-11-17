package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class Arraynumero : AppCompatActivity() {
    lateinit var textoarraynum: TextView
    lateinit var textoarraynumpa: TextView
    lateinit var textoarrayimp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arraynumero)

        textoarraynum = findViewById(R.id.textoarray)
        textoarraynumpa = findViewById(R.id.textoaaraypares)
        textoarrayimp = findViewById(R.id.textoarrayimpares)


        val ArrayNumerosimpares = mutableListOf<Int>()
        val ArrayNumerospares = mutableListOf<Int>()


        var calculararraynum = findViewById<Button>(R.id.button19)
        calculararraynum.setOnClickListener {
            var ArrayNumero = List(10) { Random.nextInt(1, 101) }
            ArrayNumerospares.clear()
            ArrayNumerosimpares.clear()



            for (i in 0..9) {
                textoarraynum.text = ""
                textoarraynum.text = ArrayNumero.toString()
                if (ArrayNumero[i] % 2 == 0) {
                    ArrayNumerospares.add(ArrayNumero[i])
                    textoarraynumpa.text = ""
                    textoarraynumpa.text = ArrayNumerospares.toString()
                } else {
                    ArrayNumerosimpares.add(ArrayNumero[i])
                    textoarrayimp.text = ""
                    textoarrayimp.text = ArrayNumerosimpares.toString()
                }

            }
        }


    }
}
