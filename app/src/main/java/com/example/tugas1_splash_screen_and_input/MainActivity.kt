package com.example.tugas1_splash_screen_and_input

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.setTitleTextColor(Color.parseColor(
            "#f5cca2"
        ))
        setSupportActionBar(toolbar)

        val name = this.findViewById<EditText>(R.id.nama)
        val email = this.findViewById<EditText>(R.id.email)
//        val outputText = this.findViewById<TextView>(R.id.output)
        val rg = this.findViewById<RadioGroup>(R.id.radioGroup)
        val button = this.findViewById<Button>(R.id.button)

        button.setOnClickListener{
                val selectedID = rg.checkedRadioButtonId
                val rd = this.findViewById<RadioButton>(selectedID)
                val intent = Intent(baseContext, ShowActivity::class.java)
                intent.putExtra("username", name.text.toString())
                intent.putExtra("email", email.text.toString())
                intent.putExtra("gender", rd.text.toString())
                startActivity(intent)
                finish()
        }
    }
}