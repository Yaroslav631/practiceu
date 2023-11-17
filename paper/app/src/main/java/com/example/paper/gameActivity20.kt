package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game20)
    }

    fun fdfd(view: View) {val intent: Intent = Intent(this@gameActivity20, MainActivity2::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}