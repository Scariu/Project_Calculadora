package com.example.projectcalculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Declarar botones y text por id
        val mensajeNumero1 = findViewById<EditText>(R.id.editTextNumero1)
        val mensajeNumero2 = findViewById<EditText>(R.id.editTextNumero2)
        val botonSumar = findViewById<Button>(R.id.buttonSumar)
        val botonRestar = findViewById<Button>(R.id.buttonRestar)
        val botonMultiplicar = findViewById<Button>(R.id.buttonMultiplicar)
        val botonDividir = findViewById<Button>(R.id.buttonDividir)
        val botonSalir = findViewById<Button>(R.id.buttonSalir)
        val resultado = findViewById<TextView>(R.id.calculoResultado)

        //Le da comportamientoa los botones al hacer el click
        botonSumar.setOnClickListener(View.OnClickListener {
            if (mensajeNumero1.text.toString().trim { it <= ' ' }
                    .isEmpty() || mensajeNumero2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Falta ingresar números ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val num1 = mensajeNumero1.text.toString()
            val num2 = mensajeNumero2.text.toString()
            val numero1 = num1.toDouble()
            val numero2 = num2.toDouble()
            val sumar = numero1 + numero2
            resultado.text = "Resultado $sumar"
            Toast.makeText(baseContext, "Se realizó una Suma ", Toast.LENGTH_LONG).show()
        })
        botonRestar.setOnClickListener(View.OnClickListener {
            if (mensajeNumero1.text.toString().trim { it <= ' ' }
                    .isEmpty() || mensajeNumero2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Falta ingresar números ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val num1 = mensajeNumero1.text.toString()
            val num2 = mensajeNumero2.text.toString()
            val numero1 = num1.toDouble()
            val numero2 = num2.toDouble()
            val restar = numero1 - numero2
            resultado.text = "Resultado $restar"
            Toast.makeText(baseContext, "Se realizó una Resta ", Toast.LENGTH_LONG).show()
        })
        botonMultiplicar.setOnClickListener(View.OnClickListener {
            if (mensajeNumero1.text.toString().trim { it <= ' ' }
                    .isEmpty() || mensajeNumero2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Falta ingresar números ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val num1 = mensajeNumero1.text.toString()
            val num2 = mensajeNumero2.text.toString()
            val numero1 = num1.toDouble()
            val numero2 = num2.toDouble()
            val multiplicar = numero1 * numero2
            resultado.text = "Resultado $multiplicar"
            Toast.makeText(baseContext, "Se realizó una Multiplicación ", Toast.LENGTH_LONG).show()
        })
        botonDividir.setOnClickListener(View.OnClickListener {
            if (mensajeNumero1.text.toString().trim { it <= ' ' }
                    .isEmpty() || mensajeNumero2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Falta ingresar números ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            if (mensajeNumero2.text.toString().toInt() == 0) {
                Toast.makeText(
                    baseContext,
                    "Debe ingresar un número distinto a 0 en el divisor ",
                    Toast.LENGTH_SHORT
                ).show()
                return@OnClickListener
            }
            val num1 = mensajeNumero1.text.toString()
            val num2 = mensajeNumero2.text.toString()
            val numero1 = num1.toDouble()
            val numero2 = num2.toDouble()
            val dividir = numero1 / numero2
            resultado.text = "Resultado $dividir"
            Toast.makeText(baseContext, "Se realizó una División ", Toast.LENGTH_LONG).show()
        })
        botonSalir.setOnClickListener { finish() }
    }
}