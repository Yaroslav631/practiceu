package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game5)





    }

    fun uy(view: View) {
        val intent: Intent = Intent(this@gameActivity5, gameActivity6::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}