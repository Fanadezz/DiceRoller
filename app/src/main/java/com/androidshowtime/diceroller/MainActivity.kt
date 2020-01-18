package com.androidshowtime.diceroller

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {


    //promising compiler this will be initialized before being accessed
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        roll_button.setOnClickListener{

            dice_image1.setImageResource(getRandomDrawable())
            dice_image2.setImageResource(getRandomDrawable())

        }

    }


    fun getRandomDrawable()= when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5


            else -> R.drawable.dice_6
        }



    }


