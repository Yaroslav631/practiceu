package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game12)
    }

    fun oiu(view: View) { val intent: Intent = Intent(this@gameActivity12, gameActivity13::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}