package com.example.implicitintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openWebsite(view: View) {
        Log.v(TAG, "open website")
    }

    fun openLocation(view: View) {
        Log.v(TAG, "open location")
    }

    fun shareText(view: View) {
        Log.v(TAG, "share text")
    }

    companion object {
        private const val TAG:String = "Implicit_Intents"
    }

}