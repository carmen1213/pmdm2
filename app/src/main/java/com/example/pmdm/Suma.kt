package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Integer.parseInt

class Suma : AppCompatActivity() {

    lateinit var txt1 : EditText
    lateinit var txt2 : EditText
    lateinit var Botoncalcular : Button
    lateinit var resultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)

        txt1 = findViewById(R.id.editTextTextPersonName2)
        txt2 = findViewById(R.id.editTextTextPersonName3)
        Botoncalcular = findViewById(R.id.Calcular)
        resultado = findViewById(R.id.resultado)


    }

    fun onClickCalcular(view : View){
       var valor1 = parseInt(txt1.text.toString())
        var valor2 = parseInt(txt2.text.toString())
       var resultados = valor1 + valor2
        resultado.text = "El resultado de la suma es : "+resultados.toString()


    }


}

