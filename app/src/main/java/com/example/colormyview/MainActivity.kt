package com.example.colormyview

import android.content.Context
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey // para ser válida em toda a classe
    var boxOneColor = R.color.grey
    var boxTwoColor = R.color.grey
    var boxThreeColor = R.color.grey
    var boxFourColor = R.color.grey
    var boxFiveColor = R.color.grey

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val valueBoxOne = sharedPreferences.getInt("boxOneColor", R.color.grey)
        box_one_text.setBackgroundResource(valueBoxOne)
        val valueBoxTwo = sharedPreferences.getInt("boxTwoColor", R.color.grey)
        box_two_text.setBackgroundResource(valueBoxTwo)
        val valueBoxThree = sharedPreferences.getInt("boxThreeColor", R.color.grey)
        box_three_text.setBackgroundResource(valueBoxThree)
        val valueBoxFour = sharedPreferences.getInt("boxFourColor", R.color.grey)
        box_four_text.setBackgroundResource(valueBoxFour)
        val valueBoxFive = sharedPreferences.getInt("boxFiveColor", R.color.grey)
        box_five_text.setBackgroundResource(valueBoxFive)

        setColorButtonsAction()
        setBoxesColor()
        }

    override fun onStop() {
        super.onStop()
        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val sharedPreferencesEditor = sharedPreferences.edit()
        sharedPreferencesEditor.putInt("boxOneColor", boxOneColor)
        sharedPreferencesEditor.putInt("boxTwoColor", boxTwoColor)
        sharedPreferencesEditor.putInt("boxThreeColor", boxThreeColor)
        sharedPreferencesEditor.putInt("boxFourColor", boxFourColor)
        sharedPreferencesEditor.putInt("boxFiveColor", boxFiveColor)
        sharedPreferencesEditor.apply()
    }

    private fun setBoxesColor() {
        box_one_text.setOnClickListener{
            box_one_text.setBackgroundResource(currentColor)
//            ou it.setBackgroundColor(currentColor)
            boxOneColor = currentColor
        }
        box_two_text.setOnClickListener{
            box_two_text.setBackgroundResource(currentColor)
            boxTwoColor = currentColor
        }
        box_three_text.setOnClickListener{
            box_three_text.setBackgroundResource(currentColor)
            boxThreeColor = currentColor
        }
        box_four_text.setOnClickListener{
            box_four_text.setBackgroundResource(currentColor)
            boxFourColor = currentColor
        }
        box_five_text.setOnClickListener{
            box_five_text.setBackgroundResource(currentColor)
            boxFiveColor = currentColor
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

//    fun saveBoxOneBackgroundColor(){
//        /**
//         * acessar a cor do fundo definida para a caixa um
//         * quando o app for finalizando
//         *  - abrir o sharedpreferences
//         *  - salvar a cor da caixa um
//         */
//    }
//
//    fun loadSavedColorAtBoxOneBackground(){
//        /**
//         * Recuperar a cor salva no sharedpreferences
//         *
//         */
//    }
}