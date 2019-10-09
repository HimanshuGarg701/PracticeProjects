package com.example.playlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result = ArrayList<String>()
    private lateinit var myAdapter : ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadDictionary()

        SearchButton.setOnClickListener {
            makeSearch()
        }

    }

    private fun loadDictionary(){
        for(i : DataBase in DataBase.values()){
            val obj = Dictionary(i.name, i)
        }
    }
    private fun makeSearch(){
        var input = Search.text.toString()
        val finalInput = input.split(" ")

        val pos = arrayListOf("noun", "pronoun", "verb", "adverb", "conjunction", "interjection", "preposition", "adjective")

        if(finalInput.size==1){
            result = Dictionary.querryDictionary(finalInput[0], null, false)
            Log.d("firstWord", "heyyy")

            displayResult(result)
        }

        else if(finalInput.size==2){
            if(finalInput[1].toLowerCase().equals("distinct")){
                result = Dictionary.querryDictionary(finalInput[0], null, true)
            }
            else if(pos.contains(finalInput[1].toLowerCase())){
                Log.d("pos", "${finalInput[1]}")
                result = Dictionary.querryDictionary(finalInput[0], finalInput[1].toLowerCase(), false)
            }
            else{
                result.add("<Not Found>")
            }

            displayResult(result)
        }
        else if(finalInput.size==3){
            if(finalInput[2].toLowerCase().equals("distinct") && pos.contains(finalInput[1].toLowerCase())){
                result = Dictionary.querryDictionary(finalInput[0], finalInput[1].toLowerCase(), true)
            }
            else{
                result.add("2nd argument must be a pos and 3rd should be distinct")
            }

            displayResult(result)
        }

    }

    private fun displayResult(result : ArrayList<String>){
        myAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, result)


        ListOfContents.adapter = myAdapter

    }
}


