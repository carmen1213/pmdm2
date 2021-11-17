package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.view.View

import android.widget.TextView
import android.R.menu
import android.view.Menu
import android.widget.Button


class calculadora : AppCompatActivity() {
    lateinit var num1: Button
    lateinit var num2: Button
    lateinit var num3: Button
    lateinit var num4: Button
    lateinit var num5: Button
    lateinit var num6: Button
    lateinit var num7: Button
    lateinit var num8: Button
    lateinit var num9: Button
    lateinit var num0: Button
    lateinit var sumas2: Button
    lateinit var restas2: Button
    lateinit var multiplicacion2: Button
    lateinit var division2: Button
    lateinit var igual2: Button
    lateinit var Numero: TextView
    lateinit var Reset: Button
    var sumar : Boolean = false;
    var restar : Boolean = false;
    var dividir : Boolean = false;
    var multiplicar : Boolean = false;
    var numero1 :String = "";
    var numero2 : String = "";
    var operaciones : Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.pmdm.R.layout.activity_calculadora)
        num1 = findViewById(com.example.pmdm.R.id.numero1)
        num2 = findViewById(com.example.pmdm.R.id.numero2)
        num3 = findViewById(com.example.pmdm.R.id.numero3)
        num4 = findViewById(com.example.pmdm.R.id.numero4)
        num5 = findViewById(com.example.pmdm.R.id.numero5)
        num6 = findViewById(com.example.pmdm.R.id.numero6)
        num7 = findViewById(com.example.pmdm.R.id.numero7)
        num8 = findViewById(com.example.pmdm.R.id.numero8)
        num9 = findViewById(com.example.pmdm.R.id.numero9)
        num0 = findViewById(com.example.pmdm.R.id.numero0)
        sumas2 = findViewById(com.example.pmdm.R.id.sumares)
        restas2 = findViewById(com.example.pmdm.R.id.restar)
        multiplicacion2 = findViewById(com.example.pmdm.R.id.multiplicar)
        division2 = findViewById(com.example.pmdm.R.id.division)
        igual2 = findViewById(com.example.pmdm.R.id.igual)
        Numero = findViewById(com.example.pmdm.R.id.txtNumero)
        Reset = findViewById(com.example.pmdm.R.id.borrar)


        fun deshabilitar(){
            multiplicacion2.setEnabled(false)
            sumas2.setEnabled(false)
            restas2.setEnabled(false)
            division2.setEnabled(false)
        }
        fun Habilitar(){
            multiplicacion2.setEnabled(true)
            sumas2.setEnabled(true)
            restas2.setEnabled(true)
            division2.setEnabled(true)
        }
        fun deshabilitaroperadores(){
            sumar = false
            restar = false
            multiplicar = false
            dividir = false
        }
        fun reseteo() {
            Habilitar()
            numero1 = ""
            numero2 = ""
            operaciones = 0.0
            deshabilitaroperadores()
        }
        num1.setOnClickListener {
            numero2 += "1"
            Numero.text = numero2

        }
        num2.setOnClickListener {
            numero2 += "2"
            Numero.text = numero2

        }
        num3.setOnClickListener {
            numero2 += "3"
            Numero.text = numero2

        }
        num4.setOnClickListener {
            numero2 += "4"
            Numero.text = numero2

        }
        num5.setOnClickListener {
            numero2 += "5"
            Numero.text = numero2

        }
        num6.setOnClickListener {
            numero2 += "6"
            Numero.text = numero2

        }
        num7.setOnClickListener {
            numero2 += "7"
            Numero.text = numero2

        }
        num8.setOnClickListener {
            numero2 += "8"
            Numero.text = numero2

        }
        num9.setOnClickListener {
            numero2 += "9"
            Numero.text = numero2

        }
        num0.setOnClickListener {
            numero2 += "0"
            Numero.text = numero2

        }

        sumas2.setOnClickListener{
            sumar=true
            numero1 = numero2
            deshabilitar()
            Numero.text = ""
            numero2 = ""

        }
        restas2.setOnClickListener{
            restar=true
            numero1 = numero2
            deshabilitar()
            Numero.text = ""
            numero2 = ""
        }
        division2.setOnClickListener{
            dividir=true
            numero1 = numero2
            deshabilitar()
            Numero.text = ""
            numero2 = ""
        }
        multiplicacion2.setOnClickListener{
            multiplicar=true
            numero1 = numero2
            deshabilitar()
            Numero.text = ""
            numero2 = ""
        }
        Reset.setOnClickListener{
            reseteo()
            Numero.text = ""
        }
        igual2.setOnClickListener{
            if(sumar){
                operaciones = numero1.toDouble() + numero2.toDouble()
                Numero.text = ""
                Numero.text = operaciones.toInt().toString()
            }else if(restar){
                operaciones = numero1.toDouble() - numero2.toDouble()
                Numero.text = ""
                Numero.text = operaciones.toInt().toString()
            }else if(multiplicar){
                operaciones = numero1.toDouble() * numero2.toDouble()
                Numero.text = ""
                Numero.text = operaciones.toInt().toString()
            } else if(dividir){
                if (numero2.toInt() !== 0){
                    operaciones = numero1.toDouble() / numero2.toDouble()
                    Numero.text = ""
                    Numero.text = operaciones.toString()
                }else{
                    Numero.text= "Math Error"
                }

            }
            reseteo()


        }
    }
}