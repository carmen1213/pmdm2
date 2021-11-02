package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.view.View

import android.widget.TextView
import android.R.menu
import android.view.Menu


class calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        var numero1: Double
        var numero2: Double
        var resultado: Double
        var operador: String


        fun onClickIgual(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            numero2 = tv.text.toString().toDouble()
            if (operador.equals("+")) {
                resultado = numero1 + numero2
            } else if (operador.equals("-")) {
                resultado = numero1 - numero2
            } else if (operador.equals("*")) {
                resultado = numero1 * numero2
            } else if (operador.equals("/")) {
                resultado = numero1 / numero2
            }
            tv.setText(resultado.toString())
        }

        fun onClickSuma(miView: View?) {
            operador = "+"
            onClickOperacionCapturaNumero1(miView)
        }

        fun onClickResta(miView: View?) {
            operador = "-"
            onClickOperacionCapturaNumero1(miView)
        }

        fun onClickMultiplicacion(miView: View?) {
            operador = "*"
            onClickOperacionCapturaNumero1(miView)
        }

        fun onClickDivision(miView: View?) {
            operador = "/"
            onClickOperacionCapturaNumero1(miView)
        }

        fun onClickOperacionCapturaNumero1(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            numero1 = tv.text.toString().toDouble()
            tv.text = ""
        }

        fun onClickLimpia(miView: View?) {
            numero1 = 0.0
            numero2 = 0.0
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = ""
        }

        fun onClickBtn1(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "1"
        }

        fun onClickBtn2(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "2"
        }

        fun onClickBtn3(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "3"
        }

        fun onClickBtn4(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "4"
        }

        fun onClickBtn5(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "5"
        }

        fun onClickBtn6(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "6"
        }

        fun onClickBtn7(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "7"
        }

        fun onClickBtn8(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "8"
        }

        fun onClickBtn9(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "9"
        }

        fun onClickBtn0(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "0"
        }

        fun onClickBtnPunto(miView: View?) {
            val tv = findViewById<View>(R.id.txtNumero) as TextView
            tv.text = tv.text.toString() + "."
        }
    }

}