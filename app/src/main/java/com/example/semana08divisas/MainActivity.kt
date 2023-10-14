package com.example.semana08divisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val btnConvertir: Button = findViewById(R.id.btnConvertir)
        btnConvertir.setOnClickListener{
            val edtCantidad: EditText = findViewById(R.id.edtCantidad)
            val edtSaldo = findViewById<TextView>(R.id.edtSaldo)

            val cantsoles = edtCantidad.text.toString().toDouble()

            val convert = (cantsoles*3.8)
            edtSaldo.text = convert.toString()
        }
    }

}