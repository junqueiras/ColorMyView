package com.example.colormyview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey // para ser válida em toda a classe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setColorButtonsAction()
        }

     private fun setColorButtonsAction() {
        redButton.setOnClickListener {
            currentColor = R.color.red
        }

         yellowButton.setOnClickListener {
             currentColor = R.color.yellow
         }

         greenButton.setOnClickListener {
             currentColor = R.color.green
         }
    }
}