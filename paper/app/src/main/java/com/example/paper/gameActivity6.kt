package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game6)


        }

    fun re(view: View) {
        val intent: Intent = Intent(this@gameActivity6, gameActivity7::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}

