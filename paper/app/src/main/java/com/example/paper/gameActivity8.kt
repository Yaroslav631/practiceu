package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game8)

    }

    fun yt(view: View) {
        val intent: Intent = Intent(this@gameActivity8, gameActivity9::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}