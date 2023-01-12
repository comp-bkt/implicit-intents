package com.example.implicitintents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mWebsiteEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWebsiteEditText = findViewById(R.id.website_edittext)
    }

    fun openWebsite(view: View) {
        Log.v(TAG, "open website")

        val url = mWebsiteEditText.text.toString()

        val webpage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d(TAG, "Can't handle this!")
        }
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