package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game4)



    }

    fun df(view: View) {
        val intent: Intent = Intent(this@gameActivity4, gameActivity5::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}