package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game10)
    }

    fun iuy(view: View) {
        val intent: Intent = Intent(this@gameActivity10, gameActivity11::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}