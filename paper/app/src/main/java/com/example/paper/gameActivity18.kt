package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game18)
    }

    fun yuyu(view: View) {  val intent: Intent = Intent(this@gameActivity18, gameActivity19::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}