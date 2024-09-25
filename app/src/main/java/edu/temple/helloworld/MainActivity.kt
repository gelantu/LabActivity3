package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)


        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val name = nameEditText.text.toString().trim()
            if (name.isEmpty()) {
                displayTextView.text = "Please enter your name"
            } else {
                displayTextView.text = "Hello, $name"
            }
        }


    }
}