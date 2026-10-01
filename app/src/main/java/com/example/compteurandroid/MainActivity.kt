package com.example.compteurandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var compteur = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val textViewCompteur =
            findViewById<TextView>(R.id.textViewCompteur)

        val buttonIncrementer =
            findViewById<Button>(R.id.buttonIncrementer)

        val buttonDecrementer =
            findViewById<Button>(R.id.buttonDecrementer)

        val buttonReinitialiser =
            findViewById<Button>(R.id.buttonReinitialiser)
        buttonIncrementer.setOnClickListener {
            compteur = compteur+1
            textViewCompteur.text=compteur.toString()
        }
        buttonDecrementer.setOnClickListener {
            compteur = compteur-1
            textViewCompteur.text=compteur.toString()
        }
        buttonReinitialiser.setOnClickListener {
            compteur=0
            textViewCompteur.text=compteur.toString()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}