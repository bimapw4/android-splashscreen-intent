package com.example.tugas1_splash_screen_and_input

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        val back = this.findViewById<LinearLayout>(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val username = this.findViewById<TextView>(R.id.username)
        username.setText(intent.getStringExtra("username"))
        val email = this.findViewById<TextView>(R.id.email)
        email.setText(intent.getStringExtra("email"))
        val gender = this.findViewById<TextView>(R.id.gender)
        gender.setText(intent.getStringExtra("gender"))
    }
}