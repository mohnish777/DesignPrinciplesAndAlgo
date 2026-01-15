package com.example.designPrinciplesAndAlgo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val TAG = "Main Activity"

    override  fun onCreate(savedInstanceState: Bundle?) { // onCreate is where we initialise the activity.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // we call this fsn with a layout resource for defining the UI.

        Log.d(TAG,"onCreate: ")
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener({startActivity(Intent(this,SecondActivity::class.java))})

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy: ")
    }
}


