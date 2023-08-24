package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.mycalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vDatoOne: EditText
    lateinit var vDatoTwo: EditText
    lateinit var vDatoThree: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val enlace = ActivityMainBinding.inflate(layoutInflater)

        vDatoOne=enlace.inputOne
        vDatoTwo=enlace.inputTwo
        vDatoThree=enlace.inputResult

        setContentView(enlace.root)
        //setContentView(R.layout.activity_main)

    }

    fun sumar(view: View){
        val resultado= vDatoOne.text.toString().toFloat() + vDatoTwo.text.toString().toFloat()
        vDatoThree.setText(resultado.toString())
    }
}