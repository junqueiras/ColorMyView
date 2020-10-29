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
        setBoxColor()
        }

    private fun setBoxColor() {
        box_one_text.setOnClickListener{
            box_one_text.setBackgroundResource(currentColor)
//            ou it.setBackgroundColor(currentColor)
        }

        box_two_text.setOnClickListener{
            box_two_text.setBackgroundResource(currentColor)
        }

        box_three_text.setOnClickListener{
            box_three_text.setBackgroundResource(currentColor)
        }

        box_four_text.setOnClickListener{
            box_four_text.setBackgroundResource(currentColor)
        }

        box_five_text.setOnClickListener{
            box_five_text.setBackgroundResource(currentColor)
        }
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