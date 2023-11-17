package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game14)
    }

    fun poi(view: View) { val intent: Intent = Intent(this@gameActivity14, gameActivity15::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}