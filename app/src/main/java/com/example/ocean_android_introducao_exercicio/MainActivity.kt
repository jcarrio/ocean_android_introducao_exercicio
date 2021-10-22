package com.example.ocean_android_introducao_exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNome = findViewById<EditText>(R.id.etNome)
        val btExibir = findViewById<Button>(R.id.btExibir)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btExibir.setOnClickListener {
            tvResultado.text = "Olá, " + etNome.text +"!"
        }
    }
}