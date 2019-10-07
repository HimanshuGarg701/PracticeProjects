package com.example.celebrityselection

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioClick(view : View){
        val id = when(view){

            ironMan -> R.drawable.ironman
            thor -> R.drawable.thor
            wonderWoman -> R.drawable.wonderwoman
            else -> R.drawable.captain
        }
        Celebrity.setImageResource(id)
    }
}
