package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game13)
    }

    fun wer(view: View) { val intent: Intent = Intent(this@gameActivity13, gameActivity14::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}