package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.view.View

import android.widget.TextView
import android.R.menu
import android.view.Menu


class calculadora : AppCompatActivity() {
    var numero1 = Int;
    var numero2= Int;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.pmdm.R.layout.activity_calculadora)



    }

/*fun suma(){
var sumas = Int
    sumas = numero1+numero2;
}
    fun resta(){
        var restas = Int
        restas = numero1-numero2;
    }
    fun multiplicaciones(){
        var multiplicacion = Int
        multiplicacion= numero1*numero2;
    }
    fun division(){
        var divisiones = Int
        divisiones= numero1/numero2;

    }
    fun borrar(){

    }*/

}